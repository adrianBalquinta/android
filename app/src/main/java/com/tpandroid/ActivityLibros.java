package com.tpandroid;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityLibros extends Activity implements AdapterView.OnItemClickListener {
    

    ListView lw;
    List<Libro> libros;
    ArrayList<Libro> miArrayL;
    TextView tV;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros);



        Intent intent = getIntent();

        String categoria = intent.getStringExtra("categoria");
        int tp = intent.getIntExtra("tp",0);

        Log.i("mensaje","categoria: "+categoria);
        Log.i("mensaje","to: "+tp);
        libros = Libro.listAll(Libro.class);


        miArrayL = new ArrayList<>();
        for (Libro libro: libros) {

            if (libro.getCategoria().getNombreCategoria().equalsIgnoreCase(categoria)){
                miArrayL.add(libro);
                Log.v("Resultados",libro.toString());
            }

        }

        lw = findViewById(R.id.listaT);


        AdaptadorLibros adaptador = new AdaptadorLibros(this,R.layout.item2,miArrayL);

        lw.setAdapter(adaptador);

        lw.setOnItemClickListener(this);

        tV = findViewById(R.id.tView);
        tV.setText(categoria);
    }


    @Override
    public void onItemClick(AdapterView<?> padre, View view, int posicion, long l) {
        AdaptadorLibros adaptador = ( AdaptadorLibros) padre.getAdapter();
       // Libro lib = new Libro();
       // lib=
        Long id = adaptador.libros.get(posicion).getId();
        String titulo = adaptador.libros.get(posicion).getTitulo();
        Log.v("Id libro",id.toString());
        Log.v("titulo libro",titulo);


        Intent i = new Intent(this,ActivityDetalle.class);
        i.putExtra("Titulo libro",titulo);
        i.putExtra("id libro",id);
        startActivity(i);


    }





}

