package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ADS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads);

        getSupportActionBar().setTitle("ADS");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
