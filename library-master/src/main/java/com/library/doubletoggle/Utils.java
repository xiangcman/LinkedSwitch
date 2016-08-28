package com.library.doubletoggle;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * Created by xiangcheng on 16/8/20.
 */
public class Utils {

    public static int dpTpPx(Context context, float value) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return (int) (TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, dm) + 0.5);
    }

}
