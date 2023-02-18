package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MetaDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meta_data);
        TextView btn_metaData = findViewById(R.id.tv_metaData);
        PackageManager packageManager = getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(getComponentName(),PackageManager.GET_META_DATA);
            Bundle bundle = activityInfo.metaData;
            String weather = bundle.getString("weather");
            btn_metaData.setText(weather);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}