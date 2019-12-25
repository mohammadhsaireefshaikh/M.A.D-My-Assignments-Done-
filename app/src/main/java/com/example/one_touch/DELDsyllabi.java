package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DELDsyllabi extends AppCompatActivity {

        PDFView printedPdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deldsyllabi);

        getSupportActionBar().setTitle("DELD");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        printedPdf=(PDFView) findViewById(R.id.pdfviewdeld);

        printedPdf.fromAsset("DELD.pdf").load();
    }
}
