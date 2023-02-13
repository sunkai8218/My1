package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication1.utils.DataUtils;

public class ButtonEnable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_enable);
        Button button = findViewById(R.id.btn_enable_close);
        Button button1 = findViewById(R.id.btn_enable_open);
        Button button2 = findViewById(R.id.btn_enable_click);
        TextView textView = findViewById(R.id.tv_enable_view);
        button.setOnClickListener(view -> {
            button2.setEnabled(false);
        });
        button1.setOnClickListener(view -> {
            button2.setEnabled(true);
        });
        button2.setOnClickListener(view -> {
            String desc = String.format("%s 您点击了按钮 %s", DataUtils.getNowTime(),((Button)view).getText());
            textView.setText(desc);
        });
    }
}