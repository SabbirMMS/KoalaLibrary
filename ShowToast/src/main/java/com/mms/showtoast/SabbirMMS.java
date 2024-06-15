package com.mms.showtoast;

import android.content.Context;
import android.widget.Toast;

public class SabbirMMS {
    public static void showToast(Context context, String stx) {
        Toast.makeText(context, stx, Toast.LENGTH_SHORT).show();
    }
}
