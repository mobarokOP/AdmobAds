package com.mobarok.admobads;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void showShortToast(Context context, String sms){
        Toast.makeText(context, sms, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context, String sms){
        Toast.makeText(context, sms, Toast.LENGTH_LONG).show();
    }
}
