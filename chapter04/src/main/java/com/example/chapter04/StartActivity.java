package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ning";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Log.d(TAG, "StartActivity onCreate");
        Button button = findViewById(R.id.btn_activity_jump);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//1.在Intent的构造函数中指定
//        startActivity(new Intent(this, FinshActivity.class));
// 2.调用意图对象的setClass方法指定
//        Intent intent = new Intent();
//        intent.setClass(this,FinshActivity.class);
//        startActivity(intent);
//3.调用意图对象的setComponent方法指定
        Intent intent = new Intent();
//        ComponentName componentName = new ComponentName("", "");
        ComponentName componentName = new ComponentName(this, FinshActivity.class);
        intent.setComponent(componentName);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "StartActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "StartActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "StartActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "StartActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "StartActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "StartActivity onRestart");
    }
}