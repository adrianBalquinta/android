package com.tpandroid;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

import java.io.Serializable;

public class Categoria extends SugarRecord  {

    @Unique
    int idCat;
    String nombreCategoria;


    // Default constructor is necessary for SugarRecord
    public Categoria() {

    }

    public Categoria(int id,String nombreCategoria) {
        this.idCat = id;
        this.nombreCategoria = nombreCategoria;

    }

    public int getIdCat() {
        return idCat;
    }

    public void setId(int id) {
        this.idCat = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCat=" + idCat +
                ", nombreCategoria='" + nombreCategoria + '\'' +
                '}';
    }
}

