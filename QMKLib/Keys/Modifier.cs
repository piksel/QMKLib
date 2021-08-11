using System;

namespace QMKLib.Keys
{
    [Flags]
    public enum Modifier
    {
        None = 0,
        // LCTL(kc)	C(kc)	Hold Left Control and press kc
        LeftCtrl = 1 << 0,
        // LSFT(kc)	S(kc)	Hold Left Shift and press kc
        LeftShift = 1 << 1,
        // LALT(kc)	A(kc), LOPT(kc)	Hold Left Alt and press kc
        LeftAlt = 1 << 2,
        // LGUI(kc)	G(kc), LCMD(kc), LWIN(kc)	Hold Left GUI and press kc
        LeftGui = 1 << 3,
        // RCTL(kc)		Hold Right Control and press kc
        RightCtrl = 1 << 4,
        // RSFT(kc)		Hold Right Shift and press kc
        RightShift = 1 << 5,
        // RALT(kc)	ROPT(kc), ALGR(kc)	Hold Right Alt and press kc
        RightAlt = 1 << 6,
        // RGUI(kc)	RCMD(kc), LWIN(kc)	Hold Right GUI and press kc
        RightGui = 1 << 7,
        // SGUI(kc)	SCMD(kc), SWIN(kc)	Hold Left Shift and GUI and press kc
        LeftShiftGui = LeftShift | LeftGui,
        // LCA(kc)		Hold Left Control and Alt and press kc
        LeftCtrlAlt = LeftCtrl | LeftAlt,
        // LSA(kc)		Hold Left Shift and Left Alt and press kc
        LeftShiftAlt = LeftShift | LeftAlt,
        // RSA(kc)	SAGR(kc)	Hold Right Shift and Right Alt (AltGr) and press kc
        RightShiftAlt = RightShift | RightAlt,
        // RCS(kc)		Hold Right Control and Right Shift and press kc
        RightCtrlShift = RightCtrl | RightShift,
        // LCAG(kc)		Hold Left Control, Alt and GUI and press kc
        // MEH(kc)		Hold Left Control, Shift and Alt and press kc
        // HYPR(kc)		Hold Left Control, Shift, Alt and GUI and press kc




    }
}