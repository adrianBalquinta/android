package com.tpandroid;
import android.app.Activity;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class AdaptadorCategorias extends ArrayAdapter<Categoria> {

    Activity context;
    List<Categoria> categorias;
    public AdaptadorCategorias(@NonNull  Activity context,int idListItem, @NonNull List<Categoria> categorias) {
        super(context, idListItem,  categorias);
        this.context = context;
        this.categorias = categorias;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.item, null);
        TextView texto = (TextView)item.findViewById(R.id.textoItem);
        texto.setText(categorias.get(position).getNombreCategoria());


        return (item);
    }
}
