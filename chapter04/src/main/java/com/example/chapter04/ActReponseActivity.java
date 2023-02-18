package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.chapter04.utils.DataUtils;

public class ActReponseActivity extends AppCompatActivity implements View.OnClickListener {
private static  final  String mReponse ="我还没睡，我爸妈不在家";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_reponse);
        TextView viewById = findViewById(R.id.btn_response);
        Bundle extras = getIntent().getExtras();
        String request_time = extras.getString("request_time");
        String request_message =extras.getString("request_message");
        String desc = String.format("收到请求消息:\n请求时间%s\n请求数据%s",request_time,request_message);
        viewById.setText(desc);

        findViewById(R.id.btn_response).setOnClickListener(this);
        TextView viewById1 = findViewById(R.id.tv_response);
        viewById1.setText("带返回的消息："+mReponse);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("response_time", DataUtils.getNowTime());
        bundle.putString("response_message",mReponse);
        intent.putExtras(bundle);
        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}