package com.tpandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.orm.SugarRecord;

public class ActivityDetalle extends Activity {
    Button btnFavorito;
    Libro libroActual;
    TextView titulo,autor,cPag,fechaPublicacion,editorial,idioma,sinop;
    ImageView tapaLibro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intent = getIntent();

        String t = intent.getStringExtra("Titulo libro");
        Long id = intent.getLongExtra("id libro",0);

        Log.i("mensaje","titulo libro"+t);
        Log.i("mensaje","id libro: "+id);

        libroActual = new Libro();
        libroActual = Libro.findById(Libro.class,id);

        Log.i("libro Actual",libroActual.toString());


        tapaLibro=findViewById(R.id.imagenLibro);
        btnFavorito=findViewById(R.id.botonFavorito);
        titulo=findViewById(R.id.tituloDetalle);

        autor=findViewById(R.id.autor_libro);
     //   cPag=findViewById(R.id.cantPagDetalle);
        fechaPublicacion=findViewById(R.id.fechaPublicacionDetalle);


        editorial=findViewById(R.id.editDetalle);
        idioma=findViewById(R.id.idiomaDetalle);
        sinop=findViewById(R.id.sinopsisDetalle);

        tapaLibro.setImageResource(R.drawable.ic_launcher);


      titulo.setText(libroActual.getTitulo());
       autor.setText(libroActual.getAutor());
      //  cPag.setText(libroActual.getCantPag());
        fechaPublicacion.setText(libroActual.getFechaDePublicacion());
        editorial.setText(libroActual.getEditorial());
        idioma.setText(libroActual.getIdioma());
        sinop.setText(libroActual.getSnpsis());

        if (libroActual.getFavorito()==1){
            btnFavorito.setText("Eliminar de favoritos");
        }



        btnFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(libroActual.getFavorito()==1){
                    Libro libroFavorito = SugarRecord.findById(Libro.class,libroActual.getId());
                    libroFavorito.setFavorito(0);
                    libroFavorito.save();
                    Toast.makeText(ActivityDetalle.this,"Eliminado de favoritos", Toast.LENGTH_SHORT).show();
                } else{

                    Libro libroFavorito = SugarRecord.findById(Libro.class,libroActual.getId());
                    libroFavorito.setFavorito(1);
                    libroFavorito.save();
                    Toast.makeText(ActivityDetalle.this,"Agregado de favoritos", Toast.LENGTH_SHORT).show();

                }




            }
        });








    }






































}
