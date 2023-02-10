package com.example.myapplication1.utils;

import android.content.Context;

public class utils {
    public static int dp2px(Context context,float dpValue){
        float density = context.getResources().getDisplayMetrics().density;
       return (int) (dpValue*density+0.5f);
    }
}
