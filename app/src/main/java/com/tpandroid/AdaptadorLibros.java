package com.tpandroid;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorLibros extends ArrayAdapter<Libro> {

    Activity context;
    ArrayList<Libro> libros;

    public AdaptadorLibros(@NonNull Activity context,int idListItem, @NonNull  ArrayList<Libro> libros) {
        super(context, idListItem, libros);
        this.context = context;
        this.libros = libros;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.item2, null);
        ImageView tapaLibro = (ImageView) item.findViewById(R.id.imagen);
        TextView titulo = item.findViewById(R.id.tituloLibro);
        TextView autorLibro = item.findViewById(R.id.autorLibro);
        TextView editorial = item.findViewById(R.id.editorial);
        TextView cat = item.findViewById(R.id.tView);
        /*
        if(libros.get(position).getTitulo().equalsIgnoreCase("El señor de los anillos, la comunidad del anillo")){
            tapaLibro.setImageResource(R.drawable.elseniordelosanillos);
        }
        if(libros.get(position).getTitulo().equalsIgnoreCase("Harry Potter y el prisionero de Azkaban")){
            tapaLibro.setImageResource(R.drawable.harry);
        }
            if(libros.get(position).getTitulo().equalsIgnoreCase("Drácula")){
                tapaLibro.setImageResource(R.drawable.dracula);
            }
            if(libros.get(position).getTitulo().equalsIgnoreCase("It")){
            tapaLibro.setImageResource(R.drawable.it);
            }
        if(libros.get(position).getTitulo().equalsIgnoreCase("Wilt")){
            tapaLibro.setImageResource(R.drawable.wilt);
        }
        if(libros.get(position).getTitulo().equalsIgnoreCase("La conjura de los necios")){
            tapaLibro.setImageResource(R.drawable.laconjuradelosnecios);
        }
        if(libros.get(position).getTitulo().equalsIgnoreCase("Orgullo y prejuicio")){
            tapaLibro.setImageResource(R.drawable.orgulloyprejuicio);
        }
        if(libros.get(position).getTitulo().equalsIgnoreCase("El amor en los tiempos del cólera")){
            tapaLibro.setImageResource(R.drawable.elamorenlostiemposdelcolera);
        }
        if(libros.get(position).getTitulo().equalsIgnoreCase("Los crímenes de la calle Morgue")){
            tapaLibro.setImageResource(R.drawable.loscrimenesenlacallemorgue);
        }
        if(libros.get(position).getTitulo().equalsIgnoreCase("Adios, muñeca")){
            tapaLibro.setImageResource(R.drawable.adiosmunieca);
        }
*/

            tapaLibro.setImageResource(R.drawable.ic_launcher);
            titulo.setText(libros.get(position).getTitulo());
            autorLibro.setText(libros.get(position).getAutor());
            editorial.setText(libros.get(position).getEditorial());
           // cat.setText(libros.get(position).getCategoria().getNombreCategoria());

        return (item);
    }



}
