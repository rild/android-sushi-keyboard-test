package rimp.rild.com.android.android_sushi_keybord_test;

import android.content.Context;
import android.inputmethodservice.Keyboard;

/**
 * Created by rild on 2017/04/18.
 */

public class SushiKeyboard extends Keyboard {

    public SushiKeyboard(Context context, int xmlLayoutResId) {
        super(context, xmlLayoutResId);
    }

    public SushiKeyboard(Context context, int layoutTemplateResId,
                      CharSequence characters, int columns, int horizontalPadding) {
        super(context, layoutTemplateResId, characters, columns, horizontalPadding);
    }
}