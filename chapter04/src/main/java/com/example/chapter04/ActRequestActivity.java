package com.example.chapter04;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.chapter04.utils.DataUtils;

public class ActRequestActivity extends AppCompatActivity implements View.OnClickListener {

    private  static  final String  mRequest = "你睡了吗？来我家睡吧";
    private ActivityResultLauncher<Intent> intentActivityResultLauncher;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_request);
        TextView textView = findViewById(R.id.tv_request);
        textView.setText("待发送的消息为："+mRequest);
        textView1 = findViewById(R.id.tv_response);
        findViewById(R.id.btn_request).setOnClickListener(this);
        intentActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
          if (result != null){
              Intent data = result.getData();
              if (data !=null&& result.getResultCode() == Activity.RESULT_OK) {
                  Bundle extras = data.getExtras();
                  String response_time = extras.getString("response_time");
                  String response_message =extras.getString("response_message");
                  String desc = String.format("收到返回消息:\n应答时间%s\n应答数据%s",response_time,response_message);
                  textView1.setText(desc);

              }
          }

        });
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,ActReponseActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("request_time", DataUtils.getNowTime());
        bundle.putString("request_message",mRequest);
        intent.putExtras(bundle);
        intentActivityResultLauncher.launch(intent);
    }
}