package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication1.utils.utils;

public class ViewBorderMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_border_main);
        TextView textView = findViewById(R.id.tv_code);
        //获取布局参数
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        //修改布局参数中的宽度数值 px单位 dp 转成px
        layoutParams.width = utils.dp2px(this,300);
        //设置布局参数
        textView.setLayoutParams(layoutParams);
    }
}