package com.tpandroid;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivityFavoritos extends Activity implements AdapterView.OnItemClickListener {
    ListView lw;
    List<Libro> libros;
    ArrayList<Libro> miArrayL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Intent intent = getIntent();

        String consigna = intent.getStringExtra("consigna");

        libros = Libro.listAll(Libro.class);

        miArrayL = new ArrayList<>();
        for (Libro libro: libros) {

            if (libro.getFavorito()==1){
                miArrayL.add(libro);
                Log.v("Resultados favoritos",libro.toString());
            }

        }

        lw = findViewById(R.id.listaFavoritos);
        AdaptadorLibros adaptador = new AdaptadorLibros(this,R.layout.item2,miArrayL);

        lw.setAdapter(adaptador);
        lw.setOnItemClickListener(this);


      /*
        libros = Libro.listAll(Libro.class);
        miArrayL = new ArrayList<>();
        for (Libro libro: libros) {

            if (libro.getFavorito()==1){
                miArrayL.add(libro);
            }
            Log.v("Resultados",libro.toString());
        }

        lw = findViewById(R.id.listaFavoritos);




*/

    }

    @Override
    public void onResume(){
        super.onResume();
        libros = Libro.listAll(Libro.class);

        miArrayL = new ArrayList<>();
        for (Libro libro: libros) {

            if (libro.getFavorito()==1){
                miArrayL.add(libro);
                Log.v("Resultados favoritos",libro.toString());
            }

        }

        lw = findViewById(R.id.listaFavoritos);
        AdaptadorLibros adaptador = new AdaptadorLibros(this,R.layout.item2,miArrayL);

        lw.setAdapter(adaptador);
        lw.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> padre, View view, int posicion, long l) {
        AdaptadorLibros adaptador = ( AdaptadorLibros) padre.getAdapter();
        Long id = adaptador.libros.get(posicion).getId();
        String titulo = adaptador.libros.get(posicion).getTitulo();
        Log.v("Id libro",id.toString());
        Log.v("titulo libro",titulo);


        Intent inte = new Intent(this,ActivityDetalle.class);
        inte.putExtra("Titulo libro",titulo);
        inte.putExtra("id libro",id);
        startActivity(inte);


    }
}
