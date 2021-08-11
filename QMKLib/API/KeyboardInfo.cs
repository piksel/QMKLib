using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace QMKLib.API
{
    public class KeyboardInfo
    {
        [JsonPropertyName("keyboard_name")]
        public string KeyboardName { get; set; } = "";
        public string? Url { get; set; }
        public string? Maintainer { get; set; }
        public float Width { get; set; }
        public float Height { get; set; }
        public Dictionary<string, KeyLayout> Layouts { get; set; } = new();


        [JsonPropertyName("keyboard_folder")]
        public string? KeyboardFolder { get; set; }

        public Dictionary<string, KeyMap> Keymaps { get; set; } = new();

        [JsonPropertyName("layout_aliases")]
        public Dictionary<string, string> LayoutAliases { get; set; } = new();


        public int Debounce { get; set; }
        public Usb? USB { get; set; }

        [JsonPropertyName("diode_direction")]
        public string? DiodeDirection { get; set; }
        public string? Manufacturer { get; set; }
        public RgbLight? RgbLight { get; set; }

        [JsonPropertyName("matrix_size")]
        public MatrixSize? MatrixSize { get; set; }

        [JsonPropertyName("matrix_pins")]
        public MatrixPins? MatrixPins { get; set; }
        public string? Processor { get; set; }
        
        [JsonPropertyName("processor_type")]
        public string? ProcessorType { get; set; }

        public string? Platform { get; set; }
        public string? Protocol { get; set; }
        public string? Bootloader { get; set; }

        [JsonPropertyName("community_layouts")]
        public string[] CommunityLayouts { get; set; } = Array.Empty<string>();

        [JsonPropertyName("config_h_features")]
        public Features? ConfigFeatures { get; set; }
        public Features? Features { get; set; }

        public string ProcessorInfo => $"{Processor ?? "Unknown"} ({ProcessorType ?? "Unknown"})";
    }

    public class MatrixSize
    {
        public int Cols { get; set; }
        public int Rows { get; set; }
    }

    public class MatrixPins
    {
        public string[] Cols { get; set; } = Array.Empty<string>();
        public string[] Rows { get; set; } = Array.Empty<string>();
    }
    
}