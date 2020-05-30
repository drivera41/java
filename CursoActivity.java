package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CursoActivity extends AppCompatActivity {

    private RecyclerView recyclerViewComida;
    private RecyclerViewAdaptador AdaptadorComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewComida = (RecyclerView)findViewById(R.id.recyclerComida);
        recyclerViewComida.setLayoutManager(new LinearLayoutManager(this));

        AdaptadorComida = new RecyclerViewAdaptador(obtenerComida());
        recyclerViewComida.setAdapter(AdaptadorComida);
    }

    public List<Comida_Modelo> obtenerComida(){
        List<Comida_Modelo> comida = new ArrayList<>();
        comida.add(new Comida_Modelo("Lugar 1","Prueba",R.drawable.ejemplo1));
        comida.add(new Comida_Modelo("Lugar 2","Prueba",R.drawable.ejemplo2));
        comida.add(new Comida_Modelo("Lugar 1","Prueba",R.drawable.ejemplo1));
        comida.add(new Comida_Modelo("Lugar 2","Prueba",R.drawable.ejemplo2));
        comida.add(new Comida_Modelo("Lugar 1","Prueba",R.drawable.ejemplo1));
        comida.add(new Comida_Modelo("Lugar 2","Prueba",R.drawable.ejemplo2));


        return comida;
    }

}
