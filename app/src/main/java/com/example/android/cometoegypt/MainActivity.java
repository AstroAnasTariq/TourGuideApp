package com.example.android.cometoegypt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout hotelsLinearLayout = findViewById(R.id.hotels);
        hotelsLinearLayout.setOnClickListener(this);
        LinearLayout locationLinearLayout = findViewById(R.id.location);
        locationLinearLayout.setOnClickListener(this);
        LinearLayout hospitalsLinearLayout = findViewById(R.id.hospitals);
        hospitalsLinearLayout.setOnClickListener(this);
        LinearLayout metroLinearLayout = findViewById(R.id.entertainment);
        metroLinearLayout.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hotels:
                Intent hotelsIntent = new Intent(MainActivity.this, StayRoomActivity.class);
                startActivity(hotelsIntent);
                break;
            case R.id.location:
                Intent locationIntent = new Intent(MainActivity.this, HistoricalLocationsActivity.class);
                startActivity(locationIntent);
                break;
            case R.id.hospitals:
                Intent hospitalsIntent = new Intent(MainActivity.this, HospitalsActivity.class);
                startActivity(hospitalsIntent);
                break;
            case R.id.entertainment:
                Intent enterIntent = new Intent(MainActivity.this, EntertaimentActivity.class);
                startActivity(enterIntent);
                break;
        }
    }
}