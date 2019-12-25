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

import static android.widget.Toast.LENGTH_SHORT;

public class Programms2 extends AppCompatActivity {

    Button down1,down2,down3,down4,down5,down6,down7,down8,down9,down10,down11,down12,down13;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;
    StorageReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programms2);


        down1=findViewById(R.id.d1);
        down2=findViewById(R.id.d2);
        down3=findViewById(R.id.d3);
        down4=findViewById(R.id.d4);
        down5=findViewById(R.id.d5);
        down6=findViewById(R.id.d6);
        down7=findViewById(R.id.d7);
        down8=findViewById(R.id.d8);
        down9=findViewById(R.id.d9);
        down10=findViewById(R.id.d10);
        down11=findViewById(R.id.d11);
        down12=findViewById(R.id.d12);
        down13=findViewById(R.id.d13);





        down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("dsl/binarysearch.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms2.this,"binarysearch",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms2.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });
            }
        });


        down2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("dsl/bubblenselection.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms2.this,"bubblenselection",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms2.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });




        down3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("dsl/dsa.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms2.this,"dsa",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms2.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("dsl/linearsearch.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms2.this,"linearsearch",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms2.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("dsl/quicksort.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms2.this,"quicksort",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms2.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("dsl/set.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms2.this,"set",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms2.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("dsl/Stringop.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms2.this,"Stringop",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms2.this, "Downloading Failed ", LENGTH_SHORT).show();

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
