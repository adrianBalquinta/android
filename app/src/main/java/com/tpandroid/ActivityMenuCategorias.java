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

public class ActivityMenuCategorias extends Activity implements AdapterView.OnItemClickListener {
    ListView lv;
    List<Categoria> categorias;
   // ArrayList<Categoria>miArrayC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);



        Intent intent = getIntent();

       String materia = intent.getStringExtra("materia");
       int aula = intent.getIntExtra("aula",0);
        Log.i("mensaje","la materia: "+materia);
        Log.i("mensaje","en el aula: "+aula);

       categorias = Categoria.listAll(Categoria.class);
    //   miArrayC = new ArrayList<>();

/*
        for (Categoria categoria: categorias) {
            Log.v("Resultados",categoria.toString());
            Categoria c = new Categoria(categoria.getIdCat(),categoria.getNombreCategoria());
            miArrayC.add(c);
        }
*/
        lv = findViewById(R.id.lista);

        AdaptadorCategorias adaptador = new AdaptadorCategorias(this,R.layout.item,categorias);


        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> padre, View view, int posicion, long id) {

        AdaptadorCategorias adaptador = ( AdaptadorCategorias) padre.getAdapter();
       String categoriaIntent = adaptador.categorias.get(posicion).getNombreCategoria();

           Intent intentT = new Intent(this, ActivityLibros.class);

            intentT.putExtra("categoria",categoriaIntent);
            intentT.putExtra("tp",1);
            startActivity(intentT);

    }


}

