namespace QMKLib.Keys
{
    public record LayerKey(
        int Layer, 
        LayerKeyMode Mode, 
        LayerModifier Modifier = LayerModifier.None);
    
    public enum LayerModifier
    {
        None,
        MOD_LCTL, 
        MOD_LSFT, 
        MOD_LALT, 
        MOD_LGUI
    }
    
    public enum LayerKeyMode
    {
        // DF
        SetDefault,

        // MO, LM, LT
        MomentaryActivation,

        // TG
        Toggle,

        // TO
        Replace,

        // OSL
        OneShot,
    }
}