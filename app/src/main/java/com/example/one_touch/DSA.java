package com.example.one_touch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.os.Environment.DIRECTORY_DOWNLOADS;
import static android.widget.Toast.LENGTH_SHORT;

public class DSA extends AppCompatActivity {
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;
    StorageReference ref;
    Button download;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);
        download=(Button)findViewById(R.id.dsaWriteup);
        getSupportActionBar().setTitle("DSA");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/DSA_ASSIGNMENT/writeups/DATA STRUCTURES USING.pdf");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(DSA.this,"DSA_writeups",".pdf",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(DSA.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });
            }
        });



    }

    public void Programs(View view) {

        Intent intent = new Intent(DSA.this, Programms2.class);
        startActivity(intent);
    }

    public void view(View view) {
        Intent intent = new Intent(DSA.this, DSAsyllabi.class);
        startActivity(intent);

    }


    public void downloadFile(Context context, String filename, String fileExtension, String fileDestination, String url)
    {




        DownloadManager downloadManager= (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri=     Uri.parse(url);
        DownloadManager.Request request;
        request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, fileDestination ,filename + fileExtension);
        downloadManager.enqueue(request);

    }
}
