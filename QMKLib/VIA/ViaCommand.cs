namespace QMKLib.VIA
{

    public enum ViaCommand: byte
    {
        GetProtocolVersion              = 0x01,  // always 0x01
        GetKeyboardValue                = 0x02,
        SetKeyboardValue                = 0x03,
        DynamicKeymapGetKeycode         = 0x04,
        DynamicKeymapSetKeycode         = 0x05,
        DynamicKeymapReset              = 0x06,
        LightingSetValue                = 0x07,
        LightingGetValue                = 0x08,
        LightingSave                    = 0x09,
        EepromReset                     = 0x0A,
        BootloaderJump                  = 0x0B,
        DynamicKeymapMacroGetCount      = 0x0C,
        DynamicKeymapMacroGetBufferSize = 0x0D,
        DynamicKeymapMacroGetBuffer     = 0x0E,
        DynamicKeymapMacroSetBuffer     = 0x0F,
        DynamicKeymapMacroReset         = 0x10,
        DynamicKeymapGetLayerCount      = 0x11,
        DynamicKeymapGetBuffer          = 0x12,
        DynamicKeymapSetBuffer          = 0x13,
        Unhandled                       = 0xFF,
    }
}