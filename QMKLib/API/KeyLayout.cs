using System;
using System.Text.Json.Serialization;

namespace QMKLib.API
{
    public class KeyLayout
    {
        [JsonPropertyName("key_count")]
        public int KeyCount { get; set; }
        public Key[] Layout { get; set; } = Array.Empty<Key>();
        public string? Filename { get; set; }

        [JsonPropertyName("c_macro")]
        public bool CMacro { get; set; }
    }
}