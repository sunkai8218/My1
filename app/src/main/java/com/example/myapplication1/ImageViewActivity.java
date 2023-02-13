package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        ImageView imageViewActivity = findViewById(R.id.iv_scale);
        imageViewActivity.setImageResource(R.drawable.sk);
        imageViewActivity.setScaleType(ImageView.ScaleType.CENTER);
    }
}