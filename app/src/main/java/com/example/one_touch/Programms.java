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

public class Programms extends AppCompatActivity {
    Button down1,down2,down3,down4,down5,down6,down7,down8,down9,down10,down11,down12,down13;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;

    StorageReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programms);


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



        getSupportActionBar().setTitle("Programs");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/A1- Calculator.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A1- Calculator",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });
            }
        });


        down2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/A2-StudentDatabase.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A2-StudentDatabase",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });




        down3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/A3- Bookshop.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A3- Bookshop",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/A4- Complex.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A4- Complex",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/A5- MultipleInheritance.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A5- MultipleInheritance",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/B1Exception-Handling.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A6-Exception-Handling",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/B2- selection sort using class template.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A7-selection sort using class template",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });


        down8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/B2-selection-Sort-Function-Templete.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A8-selection-Sort-Function-Templete",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/C-3.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A9-C-3",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });

        down10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/C1-queue.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A10-queue",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });


        down11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/C1-Stack.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A11-Stack",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });



        down12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/C2-dequeue.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A12-dequeue",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

                    }
                });

            }
        });


        down13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storageReference=firebaseStorage.getInstance().getReference();
                ref=storageReference.child("comp/SE/SEM1/OOP_ASSIGNMENT/Programs/List.txt");

                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        String url=uri.toString();
                        downloadFile(Programms.this,"A13-List",".txt",DOWNLOAD_SERVICE,url);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Programms.this, "Downloading Failed ", LENGTH_SHORT).show();

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
