package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class DrawableShapeActivity extends AppCompatActivity implements View.OnClickListener {

    private View viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_shape);
        viewById = findViewById(R.id.v_content);
        findViewById(R.id.btn_rect).setOnClickListener(this);
        findViewById(R.id.btn_oval).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.btn_rect:
              viewById.setBackgroundResource(R.drawable.shape_rect_gold);
                break;
            case R.id.btn_oval:
                viewById.setBackgroundResource(R.drawable.shape_oval_rose);
                break;
        }
    }
}