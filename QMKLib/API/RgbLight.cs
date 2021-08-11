using System.Text.Json.Serialization;

namespace QMKLib.API
{
    public class RgbLight
    {
        public string? Pin { get; set; }

        [JsonPropertyName("led_count")]
        public int LedCount { get; set; }

        public Animations? Animations { get; set; }

        [JsonPropertyName("max_brightness")]
        public int MaxBrightness { get; set; }

        [JsonPropertyName("hue_steps")]
        public int HueSteps { get; set; }

        [JsonPropertyName("saturation_steps")]
        public int SaturationSteps { get; set; }

        [JsonPropertyName("brightness_steps")]
        public int BrightnessSteps { get; set; }
        public bool Sleep { get; set; }
    }
    
    public class Animations
    {
        public bool All { get; set; }
    }
}