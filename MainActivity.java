package com.example.daftarmahasiswa;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMahasiswa = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> infoMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMahasiswa, namaMahasiswa, infoMahasiswa, kelasMahasiswa, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namaMahasiswa.add("Nama    : Afif");
        fotoMahasiswa.add("https://cdn1-production-images-kly.akamaized.net/RceYY0ChTJyHiOewfRBvbg7FIJM=/1280x720/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2840505/original/025951700_1561814970-Untitled.jpg");
        infoMahasiswa.add("No. Tlp : 08988981908");
        kelasMahasiswa.add("NIM    : 311710752");

        namaMahasiswa.add("Nama    : Mahar");
        fotoMahasiswa.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRadtyA-4a9KDDEx8vbcZC3wuLJd8aUl56ShxQkk0kmG9o2N91H&usqp=CAU");
        infoMahasiswa.add("No. Tlp : 08787871548");
        kelasMahasiswa.add("NIM    : 311710999");

        namaMahasiswa.add("Nama    : Widodo");
        fotoMahasiswa.add("https://www.kenangan.com/upload/biografi/wide/bambang-pamungkas.jpg");
        infoMahasiswa.add("No. Tlp : 0847255455");
        kelasMahasiswa.add("NIM    :311710555");




        prosesRecyclerViewAdapter();

    }
}
