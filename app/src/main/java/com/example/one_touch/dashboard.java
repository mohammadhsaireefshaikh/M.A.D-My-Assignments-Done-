package com.example.one_touch;

import androidx.annotation.StyleableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

import static android.widget.Toast.LENGTH_SHORT;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);;

        getSupportActionBar().setTitle("Select Branch");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void comp(View view) {
        Intent intent = new Intent(dashboard.this, Select_sem.class);
        startActivity(intent);
    }

    public void IT(View view) {

        StyleableToast.makeText(dashboard.this, "Updating soon", Toast.LENGTH_LONG, R.style.mytoast).show();
    }

    public void civil(View view) {

        StyleableToast.makeText(dashboard.this, "Updating soon", Toast.LENGTH_LONG, R.style.mytoast).show();
    }

    public void mech(View view) {

        StyleableToast.makeText(dashboard.this, "Updating soon", Toast.LENGTH_LONG, R.style.mytoast).show();
    }

    public void aboutus(View view) {

        Intent intent = new Intent(dashboard.this, aboutus.class);
        startActivity(intent);
    }
}
