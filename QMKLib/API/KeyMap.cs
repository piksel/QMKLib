using System;
using System.Text.Json.Serialization;

#nullable enable
namespace QMKLib.API
{
    public class KeyMap
    {
        [JsonPropertyName("version")]
        public int Version { get; set; }
        public string? Notes { get; set; }
        public string? Documentation { get; set; }
        public string? Keyboard { get; set; }
        public string? Keymap { get; set; }
        public string? Layout { get; set; }
        public string[][] Layers { get; set; } = Array.Empty<string[]>();
        public string? Author { get; set; }

        public string? Source { get; set; }

        public override string ToString() => $"{Keymap ?? "Unknown"} ({Source ?? "Unknown"})";
    }

}
