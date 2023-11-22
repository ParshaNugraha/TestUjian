package com.example.ujianandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lvNama = findViewById(R.id.lvNama);

        ArrayList<String> daftar_nama = getIntent().getExtras().getStringArrayList("daftar_nama");

        if (daftar_nama.isEmpty()) {
            daftar_nama.add("data masih kosong");
        }

        // Repeat the names up to 20 times
        ArrayList<String> repeatedNames = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            repeatedNames.addAll(daftar_nama);
        }

        ArrayAdapter<String> ad_nama = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, repeatedNames);

        lvNama.setAdapter(ad_nama);
    }
}
