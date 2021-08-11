using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Linq;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using QMKLib.Layout.CPrep;

namespace QMKLib.Layout
{
    public class LayoutParser: CPrepBaseListener
    {
        public bool ReachedEnd { get; private set; } = false;

        public static LayoutParser FromFile(string fileName) 
            => new(CharStreams.fromPath(fileName));
        
        public static LayoutParser FromString(string input) 
            => new(CharStreams.fromString(input));

        public LayoutParser(ICharStream stream)
        {
            var lexer = new CPrepLexer(stream);
            var tokens = new CommonTokenStream(lexer);
            
            Console.WriteLine($"Read {tokens.GetNumberOfOnChannelTokens()} token(s)");
            
            Parser = new CPrepParser(tokens)
            {
                BuildParseTree = true,
            };
        }

        public void LoadLayout() 
            => ParseTreeWalker.Default.Walk(this, Parser.defineOrEnd());

        public override void ExitEnd(CPrepParser.EndContext context)
        {
            ReachedEnd = true;
        }

        public override void ExitLayoutMacro(CPrepParser.LayoutMacroContext context)
        {
            var layout = context.LayoutIdentifier().Symbol.Text;

            var sources = UniqueKeys2(context.layoutSource()
                .Select((s, i) => new KeyPosition(s.Identifier().Symbol.Text, i)));
            var sourceLookup = sources.ToLookup(x => x.Key, x => x.Pos);
            var sourceKeys = sources.Select(s => s.Key).ToImmutableArray();
            
            var targets = UniqueKeys2(context.layoutTargetRow()
                .SelectMany(row => row.layoutTarget())
                .Select(t => t.Identifier().Symbol.Text)
                .Where(t => t != "KC_NO")
                .Select((t, i) => new KeyPosition( t, i)));
            var targetLookup = targets.ToLookup(x => x.Key, x => x.Pos);
            var targetKeys = targets.Select(t => t.Key).ToImmutableArray();
            
            Console.WriteLine($"SRC: {string.Join(", ", sourceKeys)}");
            Console.WriteLine($"TAR: {string.Join(", ", targetKeys)}");
            Console.WriteLine($"Got {sourceKeys.Length} physical, and {targetKeys.Length} EEPROM key(s)");

            Layouts[layout] = new(
                sourceKeys.Select(key => targetLookup[key].FirstOrDefault()).ToImmutableArray(), 
                targetKeys.Select(key => sourceLookup[key].FirstOrDefault()).ToImmutableArray());
        }

        private static ImmutableArray<KeyPosition> UniqueKeys2(IEnumerable<KeyPosition> items)
            => items.ToImmutableArray();
        
        private static ImmutableArray<KeyPosition> UniqueKeys(IEnumerable<KeyPosition> items)
        {
            var a = items.ToImmutableArray();
            return a
                .Where(ta => !a.Any(tb => ta.Key == tb.Key && ta.Pos > tb.Pos))
                .ToImmutableArray();
        }

        public Dictionary<string, LayoutTransform> Layouts { get; } = new();

        public CPrepParser Parser { get; set; }
    }

    public record LayoutTransform(ImmutableArray<int> Internal, ImmutableArray<int> Physical);
    public record KeyPosition(string Key, int Pos);
}