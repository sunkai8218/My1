package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActionReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        TextView textView = findViewById(R.id.btn_receive_message);
        Bundle bundle =getIntent().getExtras();
        String request_time = bundle.getString("request_time");
        String request_message = bundle.getString("request_message");
        String desc = String.format("收到请求消息： \n请求时间%s\n请求内容%s",request_time,request_message);
        textView.setText(desc);
    }
}