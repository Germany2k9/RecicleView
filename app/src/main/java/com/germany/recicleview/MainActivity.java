package com.germany.recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        private ArrayList<String> listaPalabra;
        private RecyclerView recicler;
        private PalabraAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPalabra = new ArrayList<String>();
             for (int i = 0; i < 7; i++){
                listaPalabra.add("Palabra "+i);
         }

             recicler = findViewById(R.id.idRecycle);
             adapter = new PalabraAdapter(listaPalabra, this);
             recicler.setAdapter(adapter);
             recicler.setLayoutManager(new LinearLayoutManager(this));

    }
}