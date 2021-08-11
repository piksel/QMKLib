using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace QMKLib.API
{
    public class KeyboardQueryResult
    {
        [JsonPropertyName("git_hash")]
        public string? GitHash { get; set; }

        [JsonPropertyName("last_updated")]
        public string? LastUpdated { get; set; }

        [JsonPropertyName("keyboards")]
        public Dictionary<string, KeyboardInfo> Keyboards { get; set; } = new();
    }
}