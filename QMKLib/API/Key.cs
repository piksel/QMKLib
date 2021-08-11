using System;
using System.ComponentModel;

namespace QMKLib.API
{
    public class Key
    {
        public float X { get; set; }
        public float Y { get; set; }

        [DefaultValue(1)]
        public float W { get; set; } = 1;

        public string? Label { get; set; }
        public int[] Matrix { get; set; } = Array.Empty<int>();
    }
}