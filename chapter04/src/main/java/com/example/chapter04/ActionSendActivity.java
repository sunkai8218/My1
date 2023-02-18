package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.chapter04.utils.DataUtils;

public class ActionSendActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
         textView = findViewById(R.id.btn_action_request);
        findViewById(R.id.btn_action_request_message).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setClass(this,ActionReceiveActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("request_time", DataUtils.getNowTime());
        bundle.putString("request_message",textView.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}