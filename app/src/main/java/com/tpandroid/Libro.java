package com.tpandroid;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

import java.io.Serializable;

public class Libro extends SugarRecord {
    @Unique
    int idLibro;
    String titulo;
    String autor;
    String snpsis;
    int cantPag;
    String fechaDePublicacion;
    String editorial;
    String idioma;
    Categoria categoria;
    int favorito ;


    // Default constructor is necessary for SugarRecord
    public Libro() {

    }

    public Libro( int id, String titulo, String autor,String snpsis, int cantPag,
                  String fechaDePublicacion, String editorial, String idioma, Categoria categoria,int favorito) {
        this.idLibro =  id;
        this.titulo = titulo;
        this.autor = autor;
        this.snpsis = snpsis;
        this.cantPag = cantPag;
        this.fechaDePublicacion = fechaDePublicacion;
        this.editorial = editorial;
        this.idioma = idioma;
        this.categoria = categoria;
        this.favorito = favorito;
    }


    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getSnpsis() {
        return snpsis;
    }

    public int getCantPag() {
        return cantPag;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setIdLibro(int id) {
        this.idLibro = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setSnpsis(String snpsis) {
        this.snpsis = snpsis;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return "Libro: " +
                "\nid: " + idLibro +
                "\ntitulo='" + titulo +
                "\nautor='" + autor  +
                "\nsnpsis='" + snpsis  +
                "\ncantPag=" + cantPag +
                "\nfechaDePublicacion='" + fechaDePublicacion +
                "\neditorial='" + editorial  +
                "\nidioma='" + idioma +
                "\ncategoria=" + categoria;
    }
}

