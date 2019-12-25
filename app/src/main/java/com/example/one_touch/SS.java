package com.example.one_touch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
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

public class SS extends AppCompatActivity {
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;
    StorageReference ref;
    Button download2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        download2=findViewById(R.id.sswriteups);
        getSupportActionBar().setTitle("SS");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);




            download2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    storageReference=firebaseStorage.getInstance().getReference();
                    ref=storageReference.child("comp/SE/SEM1/SS_ASSIGNMENTS/Soft_Skills_Lab_Manual.docx");

                    ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {
                            String url=uri.toString();
                            downloadFile(SS.this,"OOP_writeups",".docx",DOWNLOAD_SERVICE,url);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(SS.this, "Downloading Failed ", LENGTH_SHORT).show();

                        }
                    });
                }
            });


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
