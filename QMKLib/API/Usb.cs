using System.Text.Json.Serialization;

namespace QMKLib.API
{
    public class Usb
    {
        [JsonPropertyName("device_ver")]
        public string? DeviceVer { get; set; }

        [JsonPropertyName("pid")]

        public string? ProductId { get; set; }

        [JsonPropertyName("vid")]

        public string? VendorId { get; set; }
    }
}