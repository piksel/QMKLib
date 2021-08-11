using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text.Json.Serialization;

namespace QMKLib.API
{
    public class Features
    {
        [JsonIgnore]
        public IReadOnlyList<FlagItem> Values => new ReadOnlyCollection<FlagItem>(Flags);

        public FlagItem[] Flags = {
            new(nameof(SleepLed)),
            new(nameof(Nkro)),
            new(nameof(BackLight)),
            new(nameof(RgbLight)),
            new(nameof(Midi)),
            new(nameof(Unicode)),
            new(nameof(Bluetooth)),
            new(nameof(Audio)),
            new(nameof(BootmagicLite)),
            new(nameof(Command)),
            new(nameof(Console)),
            new(nameof(ExtraKey)),
            new(nameof(MouseKey)),
        };

        [JsonPropertyName("sleep_led")]
        public bool SleepLed { get => Flags[FeatureFlags.SleepLed].Enabled; set => Flags[FeatureFlags.SleepLed].Enabled = value; }
        public bool Nkro { get => Flags[FeatureFlags.Nkro].Enabled; set => Flags[FeatureFlags.Nkro].Enabled = value; }
        public bool BackLight { get => Flags[FeatureFlags.BackLight].Enabled; set => Flags[FeatureFlags.BackLight].Enabled = value; }
        public bool RgbLight { get => Flags[FeatureFlags.RgbLight].Enabled; set => Flags[FeatureFlags.RgbLight].Enabled = value; }
        public bool Midi { get => Flags[FeatureFlags.Midi].Enabled; set => Flags[FeatureFlags.Midi].Enabled = value; }
        public bool Unicode { get => Flags[FeatureFlags.Unicode].Enabled; set => Flags[FeatureFlags.Unicode].Enabled = value; }
        public bool Bluetooth { get => Flags[FeatureFlags.Bluetooth].Enabled; set => Flags[FeatureFlags.Bluetooth].Enabled = value; }
        public bool Audio { get => Flags[FeatureFlags.Audio].Enabled; set => Flags[FeatureFlags.Audio].Enabled = value; }
        
        [JsonPropertyName("bootmagic_lite")]
        public bool BootmagicLite { get => Flags[FeatureFlags.BootmagicLite].Enabled; set => Flags[FeatureFlags.BootmagicLite].Enabled = value; }
        public bool Command { get => Flags[FeatureFlags.Command].Enabled; set => Flags[FeatureFlags.Command].Enabled = value; }
        public bool Console { get => Flags[FeatureFlags.Console].Enabled; set => Flags[FeatureFlags.Console].Enabled = value; }
        public bool ExtraKey { get => Flags[FeatureFlags.ExtraKey].Enabled; set => Flags[FeatureFlags.ExtraKey].Enabled = value; }
        public bool MouseKey { get => Flags[FeatureFlags.MouseKey].Enabled; set => Flags[FeatureFlags.MouseKey].Enabled = value; }

        public override string ToString() 
            => string.Join(", ", Flags.Where(kv => kv.Enabled).Select(kv => kv.Name));

        public static Features All =>
            new()
            {
                SleepLed = true,
                Nkro = true,
                BackLight = true,
                RgbLight = true,
                Midi = true,
                Unicode = true,
                Bluetooth = true,
                Audio = true,
                BootmagicLite = true,
                Command = true,
                Console = true,
                ExtraKey = true,
                MouseKey = true
            };
    }
    
    public static class FeatureFlags
    {
        public const int SleepLed = 0;
        public const int Nkro = 1;
        public const int BackLight = 2;
        public const int RgbLight = 3;
        public const int Midi = 4;
        public const int Unicode = 5;
        public const int Bluetooth = 6;
        public const int Audio = 7;
        public const int BootmagicLite = 8;
        public const int Command = 9;
        public const int Console = 10;
        public const int ExtraKey = 11;
        public const int MouseKey = 12;
    }

    public record FlagItem
    {
        public FlagItem(string name, bool enabled = false)
        {
            Name = name;
            Enabled = enabled;
        }
        public string Name { get; }
        public bool Enabled { get; set; }
    }
}