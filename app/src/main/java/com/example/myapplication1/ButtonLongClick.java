package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication1.utils.DataUtils;

public class ButtonLongClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_long_click);
        Button button =findViewById(R.id.btn_click_long_single);
        TextView textView =findViewById(R.id.text_reult);
        button.setOnLongClickListener(view -> {
            String desc = String.format("%s 您点击了按钮 %s", DataUtils.getNowTime(),((Button)view).getText());
            textView.setText(desc);
            return  true;
        });
    }
}