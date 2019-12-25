package com.example.one_touch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.pdf.PdfDocument;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.print.pdf.PrintedPdfDocument;

import com.github.barteksc.pdfviewer.PDFView;

public class Oopsyllabi extends AppCompatActivity {
    PDFView printedPdfDocument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oopsyllabi);
        getSupportActionBar().setTitle("Syllabi");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        printedPdfDocument=(PDFView) findViewById(R.id.pdfview);

        printedPdfDocument.fromAsset("OOP.pdf").load();


    }
}
