package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

import static android.widget.Toast.LENGTH_SHORT;

public class Select_sem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sem);
        getSupportActionBar().setTitle("Select Year");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void sem3(View view) {

        Intent intent = new Intent(Select_sem.this, comp.class);
        startActivity(intent);
    }

    public void third(View view) {
        StyleableToast.makeText(Select_sem.this, "Updating soon", Toast.LENGTH_LONG, R.style.mytoast).show();
    }

    public void forth(View view) {

        StyleableToast.makeText(Select_sem.this, "Updating soon", Toast.LENGTH_LONG, R.style.mytoast).show();
    }
}
