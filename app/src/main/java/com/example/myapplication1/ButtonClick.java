package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication1.utils.DataUtils;

public class ButtonClick extends AppCompatActivity {

    private TextView result_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);
        result_tv = findViewById(R.id.tv_result);
        Button btn_click_single = findViewById(R.id.btn_click_single);
        btn_click_single.setOnClickListener(new MyOnclickListener(result_tv));
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