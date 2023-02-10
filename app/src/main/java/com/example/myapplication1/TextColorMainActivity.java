package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class TextColorMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color_main);
        TextView textView = findViewById(R.id.text_color);
        textView.setTextColor(Color.GREEN);
        TextView textView1 = findViewById(R.id.text_color1);
        textView1.setTextColor(0x00ff00);
        textView.setBackgroundResource(R.color.black);
        textView1.setBackgroundColor(Color.BLACK);
    }
}