package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DSAsyllabi extends AppCompatActivity {
    PDFView printedPdfDocument2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsasyllabi);

        getSupportActionBar().setTitle("Syllabi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        printedPdfDocument2=(PDFView) findViewById(R.id.pdfview2);

        printedPdfDocument2.fromAsset("DSA.pdf").load();
    }
}
