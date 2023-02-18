package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReadStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_string);
        TextView tv_resources = findViewById(R.id.tv_resources);
        String string = getString(R.string.sunny_day);
        tv_resources.setText(string);
    }
}