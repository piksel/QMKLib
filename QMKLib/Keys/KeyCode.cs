﻿namespace KeyChart.Keyboards.QMK
{
    public enum KeyCode
    {

    NO = 0x00,
    ROLL_OVER,
    POST_FAIL,
    UNDEFINED,
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,  // 0x10
    N,
    O,
    P,
    Q,
    R,
    S,
    T,
    U,
    V,
    W,
    X,
    Y,
    Z,
    D1,
    D2,
    D3,  // 0x20
    D4,
    D5,
    D6,
    D7,
    D8,
    D9,
    D0,
    ENTER,
    ESCAPE,
    BSPACE,
    TAB,
    SPACE,
    MINUS,
    EQUAL,
    LBRACKET,
    RBRACKET,  // 0x30
    BSLASH,
    NONUS_HASH,
    SCOLON,
    QUOTE,
    GRAVE,
    COMMA,
    DOT,
    SLASH,
    CAPSLOCK,
    F1,
    F2,
    F3,
    F4,
    F5,
    F6,
    F7,  // 0x40
    F8,
    F9,
    F10,
    F11,
    F12,
    PSCREEN,
    SCROLLLOCK,
    PAUSE,
    INSERT,
    HOME,
    PGUP,
    DELETE,
    END,
    PGDOWN,
    RIGHT,
    LEFT,  // 0x50
    DOWN,
    UP,
    NUMLOCK,
    KP_SLASH,
    KP_ASTERISK,
    KP_MINUS,
    KP_PLUS,
    KP_ENTER,
    KP_1,
    KP_2,
    KP_3,
    KP_4,
    KP_5,
    KP_6,
    KP_7,
    KP_8,  // 0x60
    KP_9,
    KP_0,
    KP_DOT,
    NONUS_BSLASH,
    APPLICATION,
    POWER,
    KP_EQUAL,
    F13,
    F14,
    F15,
    F16,
    F17,
    F18,
    F19,
    F20,
    F21,  // 0x70
    F22,
    F23,
    F24,
    EXECUTE,
    HELP,
    MENU,
    SELECT,
    STOP,
    AGAIN,
    UNDO,
    CUT,
    COPY,
    PASTE,
    FIND,
    _MUTE,
    _VOLUP,  // 0x80
    _VOLDOWN,
    LOCKING_CAPS,
    LOCKING_NUM,
    LOCKING_SCROLL,
    KP_COMMA,
    KP_EQUAL_AS400,
    INT1,
    INT2,
    INT3,
    INT4,
    INT5,
    INT6,
    INT7,
    INT8,
    INT9,
    LANG1,  // 0x90
    LANG2,
    LANG3,
    LANG4,
    LANG5,
    LANG6,
    LANG7,
    LANG8,
    LANG9,
    ALT_ERASE,
    SYSREQ,
    CANCEL,
    CLEAR,
    PRIOR,
    RETURN,
    SEPARATOR,
    OUT,  // 0xA0
    OPER,
    CLEAR_AGAIN,
    CRSEL,
    EXSEL,
    
  // ***************************************************************
  // These keycodes are present in the HID spec, but are           *
  // nonfunctional on modern OSes. QMK uses this range (0xA5-0xDF) *
  // for the media and function keys instead - see below.          *
  // ***************************************************************
  /* Media and Function keys */
        /* Generic Desktop Page (0x01) */
        SYSTEM_POWER = 0xA5,
        SYSTEM_SLEEP,
        SYSTEM_WAKE,

        /* Consumer Page (0x0C) */
        AUDIO_MUTE,
        AUDIO_VOL_UP,
        AUDIO_VOL_DOWN,
        MEDIA_NEXT_TRACK,
        MEDIA_PREV_TRACK,
        MEDIA_STOP,
        MEDIA_PLAY_PAUSE,
        MEDIA_SELECT,
        MEDIA_EJECT,  // 0xB0
        MAIL,
        CALCULATOR,
        MY_COMPUTER,
        WWW_SEARCH,
        WWW_HOME,
        WWW_BACK,
        WWW_FORWARD,
        WWW_STOP,
        WWW_REFRESH,
        WWW_FAVORITES,
        MEDIA_FAST_FORWARD,
        MEDIA_REWIND,
        BRIGHTNESS_UP,
        BRIGHTNESS_DOWN,

        /* Fn keys */
        FN0 = 0xC0,
        FN1,
        FN2,
        FN3,
        FN4,
        FN5,
        FN6,
        FN7,
        FN8,
        FN9,
        FN10,
        FN11,
        FN12,
        FN13,
        FN14,
        FN15,
        FN16,  // 0xD0
        FN17,
        FN18,
        FN19,
        FN20,
        FN21,
        FN22,
        FN23,
        FN24,
        FN25,
        FN26,
        FN27,
        FN28,
        FN29,
        FN30,
        FN31,

        /* Modifiers */
    LCTRL = 0xE0,
    LSHIFT,
    LALT,
    LGUI,
    RCTRL,
    RSHIFT,
    RALT,
    RGUI

    // **********************************************
    // * 0xF0-0xFF are unallocated in the HID spec. *
    // * QMK uses these for Mouse Keys - see below. *
    // **********************************************
    }
}