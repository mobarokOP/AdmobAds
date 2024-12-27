package com.mobarok.admobads;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void showToast(Context context, String sms){
        Toast.makeText(context, sms, Toast.LENGTH_LONG).show();
    }
}
