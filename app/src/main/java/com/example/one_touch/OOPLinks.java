package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OOPLinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ooplinks);

        getSupportActionBar().setTitle("Learn");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void button1(View view) {

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/wiXV-n5beSo"));
        startActivity(intent);
    }

    public void button2(View view) {

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/sQTi2jT4uD0"));
        startActivity(intent);
    }

    public void button3(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/lmxuN-QPRXk"));
        startActivity(intent);

    }

    public void button4(View view) {

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/SEgY7ZpoHEc"));
        startActivity(intent);
    }

    public void button5(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/xqihfJ5t4Ml"));
        startActivity(intent);
    }

    public void button6(View view) {

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/US3CHSwFCGo"));
        startActivity(intent);
    }

    public void button7(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/pomaHMtLmRI"));
        startActivity(intent);
    }


    public void button8(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/J-RaOTF5oBk"));
        startActivity(intent);

    }


    public void button9(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/gQxeGX2KkNk"));
        startActivity(intent);
    }

    public void button10(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/J6WqSs_9xZI"));
        startActivity(intent);
    }

    public void button11(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/oB2ZUDvg4oU"));
        startActivity(intent);
    }

    public void button12(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/FoHkpXjJhYg"));
        startActivity(intent);
    }

    public void button13(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/aIVjQQ1Nfe4"));
        startActivity(intent);
    }

    public void button14(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/WjSIHXwKs1Q"));
        startActivity(intent);
    }
}
