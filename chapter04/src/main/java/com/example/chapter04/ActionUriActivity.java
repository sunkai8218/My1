package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ActionUriActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_uri);
        findViewById(R.id.btn_detail).setOnClickListener(this);
        findViewById(R.id.btn_email).setOnClickListener(this);
        findViewById(R.id.btn_myActivity).setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        String phoneNumber ="123445";
       switch (view.getId()){
           case R.id.btn_detail:
               Intent intent = new Intent();
               intent.setAction(Intent.ACTION_DIAL);
               Uri uri = Uri.parse("tel"+phoneNumber);
               intent.setData(uri);
               startActivity(intent);
               break;
       }
    }
}