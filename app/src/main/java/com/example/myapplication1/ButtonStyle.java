package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication1.utils.DataUtils;

public class ButtonStyle extends AppCompatActivity {

    private TextView result_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        result_tv = findViewById(R.id.result_tv);
    }

    public void doCilk(View view) {
       String dec =  String.format("%s 您点击了按钮:  %s",DataUtils.getNowTime(),((Button)view).getText());
     result_tv.setText(dec);
    }
}