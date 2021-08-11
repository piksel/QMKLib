using System;

namespace QMKLib.Keys
{
    public static class KeyUtil
    {
        public static bool IsLayerKey(string keyCode, out LayerKey? layerKey)
        {
            const StringComparison ct = StringComparison.InvariantCultureIgnoreCase;
            layerKey = null;

            if (keyCode.StartsWith("KC_", ct)) return false;

            var parenOpen = keyCode.IndexOf('(');
            var parenClose = keyCode.IndexOf(')');

            if (parenClose <= 0 || parenOpen <= 1) return false;

            var args = keyCode.Substring(parenOpen + 1, (parenClose - parenOpen)-1).Split(',');
            if (args.Length < 1 || !int.TryParse(args[0], out int layer)) return false;

            layerKey = keyCode.Substring(0, parenOpen) switch
            {
                "DF" => new LayerKey(layer, LayerKeyMode.SetDefault),
                "MO" => new LayerKey(layer, LayerKeyMode.MomentaryActivation),
                "LM" => new LayerKey(layer, LayerKeyMode.MomentaryActivation,
                    (LayerModifier) Enum.Parse(typeof(LayerModifier), args[1], true)),
                "OSL" => new LayerKey(layer, LayerKeyMode.OneShot),
                "TG" => new LayerKey(layer, LayerKeyMode.Toggle),
                "TO" => new LayerKey(layer, LayerKeyMode.Replace),
                "TT" => new LayerKey(layer, LayerKeyMode.MomentaryActivation), // TODO: Add correct type
                _ => null
            };

            return layerKey != null;
        }
    }
}
