using System;
using System.Collections.Generic;
using System.Linq;
using QMKLib.Layout;
using static ConLib.PrettyConsole;
using static ConLib.ConCol;

namespace QMKLib.LayoutReader
{
    class Program
    {
        static int Main(string[] args)
        {
            if (args.Length < 1)
            {
                WriteLine($"No input specified. Exiting.");
                return 1;
            }

            DoChore("Read Layouts", () =>
            {
                var inputFile = args[0];
                WriteLine($"\nSource: {inputFile}\n");

                LayoutParser? parser = null;
                DoChore("Tokenize", () =>
                {
                    parser = LayoutParser.FromFile(inputFile);
                });
                if (parser is null) return;

                DoChore("Parse", () =>
                {
                    while (!parser.ReachedEnd)
                    {
                        parser.LoadLayout();
                    }
                });
                
                foreach (var layout in parser.Layouts)
                {
                    var layoutName = layout.Key.StripPrefix("LAYOUT_");
                    DoChore($"Verify {layoutName}", () => {

                    var (phyPos, intPos) = layout.Value;
                    WriteLine($"PHY: {FmtKeyPos(phyPos)}", Cyan);
                    Write($"     ");
                    var failed = new List<int>();
                    foreach (var i in intPos)
                    {
                        if (phyPos[i] < intPos.Length && intPos[phyPos[i]] == i)
                        {
                            WriteColor("OK ", Green);
                        }
                        else
                        {
                            WriteColor("!! ", Red);
                            failed.Add(i);
                        }
                    }
                    
                    WriteLine($"");
                    WriteLine($"INT: {FmtKeyPos(intPos)}", Cyan);

                    if (failed.Any())
                    {
                        WriteLine();
                        throw new Exception($"{failed.Count} key(s) not equal after roundtrip");
                    }

                    }, continueOnFail: true);
                }
            });
  
            return 0;
        }

        private static string FmtKeyPos(IEnumerable<int> ps) 
            => string.Join(" ", ps.Select(p => $"{p,2}"));
    }

    static class StringExtensions
    {
        public static string StripPrefix(this string s, string prefix) =>
            s.StartsWith(prefix) ? s.Substring(prefix.Length) : s;
    }
}