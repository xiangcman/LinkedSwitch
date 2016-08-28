package com.single.doubletoggle;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by xiangcheng on 16/8/21.
 */
public class ToastUtil {
    private static Toast toast;

    public static void makeToast(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
        }
        toast.setText(text);
        toast.show();

    }
}
