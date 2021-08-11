using System.Collections.Generic;
using System.IO;
using System.Net;
using System.Text.Json;
using System.Threading.Tasks;

#nullable enable

namespace QMKLib.API
{
    public class QmkClient
    {
        private static readonly JsonSerializerOptions JsonOptions = new ()
        {
            PropertyNameCaseInsensitive = true,
        };

        public static async Task<KeyboardInfo?> KeyboardInfo(string? selectedKeyboard)
        {
            var wc = new WebClient();

            await using var stream = await wc.OpenReadTaskAsync("https://api.qmk.fm/v1/keyboards/" + selectedKeyboard);

            var queryResult = await JsonSerializer.DeserializeAsync<KeyboardQueryResult>(stream, JsonOptions);

            KeyboardInfo? kbdInfo = null;
            queryResult?.Keyboards?.TryGetValue(selectedKeyboard ?? "", out kbdInfo);

            return kbdInfo;
        }

        public static async Task<IReadOnlyCollection<string>?> Keyboards()
        {
            var wc = new WebClient();

            await using var stream = await wc.OpenReadTaskAsync("https://api.qmk.fm/v1/keyboards");

            return await JsonSerializer.DeserializeAsync<string[]>(stream, JsonOptions);
        }

        public static async Task<KeyMap?> ParseCustomKeymap(Stream stream)
        {
            return await JsonSerializer.DeserializeAsync<KeyMap>(stream, JsonOptions);
        }

        public static async Task<KeyMap?> DefaultKeymap(string keyboardId)
        {

            var keymapFile = keyboardId.Replace('/', '_') + "_default.json";

            var wc = new WebClient();

            await using var stream = await wc.OpenReadTaskAsync($"https://config.qmk.fm/keymaps/{keymapFile[0]}/{keymapFile}");

            var keyMap = await JsonSerializer.DeserializeAsync<KeyMap>(stream, JsonOptions);

            return keyMap;
        }

        public static async Task<string?> FetchKeyboardReadme(string? keyboardId)
        {
            if (keyboardId == null) return null;

            var wc = new WebClient();

            return await wc.DownloadStringTaskAsync($"https://api.qmk.fm/v1/keyboards/{keyboardId}/readme");
        }
    }
}
