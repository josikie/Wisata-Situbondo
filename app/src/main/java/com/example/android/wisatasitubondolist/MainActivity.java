package com.example.android.wisatasitubondolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // arraylist untuk menampung data tempat wisata
        final ArrayList<TempatWisata> tempatWisataArrayList = new ArrayList<TempatWisata>();
        //menambahkan data tempatwisata ke tempatWisataArrayList
        tempatWisataArrayList.add(new TempatWisata(R.drawable.pasirputih, "Pasir Putih", "Jln. Raya Pasir Putih No.87, Selomukti, Mlandingan, Pandansari, Bungatan, Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.pathek, "Pathek", "Jalan Pantai Pathek, Gelung Selatan, Gelung, Kecamatan Situbondo, Kabupaten Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.tampora, "Tampora", "Jalan Tampora, Besuki, Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.balanan, "Balanan", "Desa Wonorejo, Kecamatan Banyu Putih, Kabupaten Situbondo, Jawa Timur"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.lempuyang, "Lempuyang", "Pintu masuk Karangtekok, Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.tangsi, "Tangsi", "Desa Pecinan/Simiring, Mangaran, Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.bama, "Bama", "Banyuputih, Kabupaten Situbondo, Jawa Timur, Indonesia"));
        tempatWisataArrayList.add(new TempatWisata(R.drawable.jangkar, "Jangkar", "Desa Jangkar, Situbondo, Jawa Timur, Indonesia"));

        // Memasang TempatWisataAdapter
        TempatWisataAdapter tempatWisataAdapter = new TempatWisataAdapter(this, tempatWisataArrayList);

        // Menemukan ListView menggunakan id
        ListView listView = findViewById(R.id.listview);

        // pasang tempatWisataAdapter ke listview.
        listView.setAdapter(tempatWisataAdapter);
    }
}
