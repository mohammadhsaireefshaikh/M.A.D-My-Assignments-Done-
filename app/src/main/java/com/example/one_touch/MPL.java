package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MPL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpl);

        getSupportActionBar().setTitle("MPL");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void Programs(View view) {



    }

    public void view(View view) {

       /* Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/wiXV-n5beSo"));
        startActivity(intent);*/
    }
}
