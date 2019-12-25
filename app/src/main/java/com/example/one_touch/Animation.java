package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Animation extends AppCompatActivity {

        Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        timer = new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run() {
                Intent intent = new Intent(Animation.this, dashboard.class);
                startActivity(intent);
                finish();

            }
        },5000);
    }




}
