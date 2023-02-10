package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.tx);
        Button button = findViewById(R.id.bt);
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });

        Button button1= findViewById(R.id.bt1);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,TextActivity.class);
            startActivity(intent);
        });

        Button button2 = findViewById(R.id.bt2);
        button2.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,TestFrontMainActivity.class);
            startActivity(intent);
        });
        Button button3 = findViewById(R.id.bt3);
        button3.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,TextColorMainActivity.class);
            startActivity(intent);
        });
        Button button4 = findViewById(R.id.bt4);
        button4.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,ViewBorderMainActivity.class);
            startActivity(intent);
        });
    }
}