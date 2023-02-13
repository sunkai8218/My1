package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication1.utils.DataUtils;

public class ButtonClick extends AppCompatActivity implements View.OnClickListener{

    private TextView result_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);
        result_tv = findViewById(R.id.tv_result);
        Button btn_click_single = findViewById(R.id.btn_click_single);
        Button btn_click_public =findViewById(R.id.btn_click_public);
        btn_click_single.setOnClickListener(new MyOnclickListener(result_tv));
        btn_click_public.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_click_public){
            String desc = String.format("%s 您点击了按钮 %s", DataUtils.getNowTime(),((Button)view).getText());
            result_tv.setText(desc);
        }
    }

    static class MyOnclickListener implements View.OnClickListener{

        private final TextView result_tv;

        public MyOnclickListener(TextView result_tv) {
            this.result_tv = result_tv;
        }

        @Override
        public  void  onClick(View v){
            String desc = String.format("%s 您点击了按钮 %s", DataUtils.getNowTime(),((Button)v).getText());
            result_tv.setText(desc);

        }
    }
}