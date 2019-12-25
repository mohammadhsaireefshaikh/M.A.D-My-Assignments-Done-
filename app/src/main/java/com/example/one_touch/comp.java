package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class comp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);

        getSupportActionBar().setTitle("SECOND YEAR");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }

    public void DSA(View view) {
        Intent intent = new Intent(comp.this, DSA.class);
        startActivity(intent);
    }

    public void btn_OOP(View view) {
        Intent intent = new Intent(comp.this, OOP.class);
        startActivity(intent);
    }

    public void DELD(View view) {
        Intent intent = new Intent(comp.this, DELD.class);
        startActivity(intent);
    }


    public void SS(View view) {
        Intent intent = new Intent(comp.this, SS.class);
        startActivity(intent);
    }

    public void MPL(View view) {

        Intent intent = new Intent(comp.this, MPL.class);
        startActivity(intent);
    }

    public void ADS(View view) {

        Intent intent = new Intent(comp.this, ADS.class);
        startActivity(intent);
    }

    public void CG(View view) {

        Intent intent = new Intent(comp.this, CG.class);
        startActivity(intent);
    }
}
