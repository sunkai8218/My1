package com.example.myapplication1.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
public static String getNowTime(){
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
    return  simpleDateFormat.format(new Date());
}
}
