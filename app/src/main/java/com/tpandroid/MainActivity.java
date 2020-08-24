package com.tpandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    Button botonCat;
    Button botonfav;
    ArrayList<Libro> libros;
    ArrayList<Categoria>categorias;
    List<Categoria> c;
    List<Libro> l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botonCat = findViewById(R.id.btcategorias);
        botonfav = findViewById(R.id.btfavoritos);


        //LLamamos a la bd, las tablas Categoria,Libro
        c = Categoria.listAll(Categoria.class);
        l = Libro.listAll(Libro.class);
        libros = new ArrayList<>();
        categorias = new ArrayList<>();
        //Consultamos si esta vacia, si no lo esta, pasamos a crear objetos de tipo categoria, luego de libro, para despues agregarlos a sus respectivas ArrayList.
        if (c.isEmpty()&&l.isEmpty()){


        categorias.add(new Categoria(1, "Terror"));
        categorias.add(new Categoria(2, "Fantasia"));
        categorias.add(new Categoria(3, "Comedia"));
        categorias.add(new Categoria(4, "Novela Romántica"));
        categorias.add(new Categoria(5, "Novela Policial"));

        libros.add(new Libro(1, "El señor de los anillos, la comunidad del anillo", "J. R. R. Tolkien", "Frodo Bolsón es un hobbit al que su tío Bilbo hace portador del poderoso Anillo Único, capaz de otorgar un poder ilimitado al que la posea,\n" +
                "con la finalidad de destruirlo. Sin embargo, fuerzas malignas muy poderosas quieren arrebatárselo.", 568,
                " 29 de julio de 1954", " George Allen & Unwin", "Español", categorias.get(1),0));

        libros.add(new Libro(2, "Harry Potter y el prisionero de Azkaban", " J. K. Rowling", "El tercer año de estudios de Harry en Hogwarts se ve amenazado por la fuga de Sirius Black de la prisión de Azkaban. Al parecer, se trata de un \n" +
                "peligroso mago que fue cómplice de Lord Voldemort y que intentará vengarse de Harry Potter.", 435,
                "8 de julio de 1999", "Bloomsbury Publishing", "español", categorias.get(1),0));

        libros.add(new Libro(3, "Drácula", "Bram Stoker", "Cuando Jonathan Harker viajó a Transilvania por asuntos de negocios, nunca imaginó el peligro que corría. Su cliente, el magnético conde Drácula, lo mantiene prisionero y \n" +
                    "Harker adivina sus oscuros propósitos: viajar a Londres para sembrar el terror y cosechar víctimas con las que saciar su apetito de sangre.", 576, "26 de mayo de 1897", "Constable & Robinson", "Español", categorias.get(0),0));

        libros.add(new Libro(4, "It", "Stephen King", "Varios niños de una pequeña ciudad del estado de Maine se alían para combatir a una entidad diabólica que adopta la forma de un payaso y desde\n" +
                "hace mucho tiempo emerge cada 27 años para saciarse de sangre infantil.", 1504,
                "03 de septiembre de 1986", "Viking press", "Español", categorias.get(0),0));

        libros.add(new Libro(5, "Wilt", "Tom Sharpe", "Mientras, las cosas no marchan mejor en casa, donde su maciza esposa, Eva, se entrega a imprevisibles arrebatos de entusiasmo por la meditación\n" +
                "trascendental, el yoga o la última novedad recién olfateada. Un día Eva conoce a los Pringsheim, una original pareja de americanos, que invitan al matrimonio\n" +
                "Wilt a una fiesta.", 589,
                    "15 de agosto de 1976", "Secker and Warburg", "Español", categorias.get(2),0));

        libros.add(new Libro(6, "La conjura de los necios", "John Kennedy Toole", "Ignatius J. Reilly es un ser inadaptado y anacrónico que sueña con que el modo de vida medieval, así como su moral, reinen de nuevo en el mundo. ... \n" +
                "Su actividad laboral y vital es el hilo que une y da sentido a toda la obra y lo que permite conocer a otros personajes, igual de estrambóticos y entrañables\n" +
                "que Ignatius.", 748,
                    "25 de julio de 1980", "Simon & Schuster", "Español", categorias.get(2),0));

        libros.add(new Libro(7, "Orgullo y prejuicio", "Jane Austen", "La señora Bennet ha criado a sus cinco hijas con el único deseo de encontrar marido. La llegada al vecindario de Charles Bingley, un joven rico y soltero,\n" +
                "con algunas amistades despierta el interés de las hermanas Bennet y de las familias vecinas, que verán una excelente oportunidad para cumplir su propósito.", 1023,
                    "27 de enero de 1813", "Thomas Egerton", "Español", categorias.get(3),0));

        libros.add(new Libro(8, "El amor en los tiempos del cólera", "Gabriel García Márquez", "De jóvenes, Florentino Ariza y Fermina Daza se enamoran apasionadamente, pero Fermina eventualmente decide casarse con un médico rico y de muy buena familia.\n" +
                "Florentino está anonadado, pero es un romántico.", 490,
                    "14 de febrero de 1985", "Penguin Random House", "Español", categorias.get(3),0));

        libros.add(new Libro(9, "Los crímenes de la calle Morgue", "Edgar Allan Poe", "La historia narrada en este relato gira en torno al brutal asesinato de Madame l”Espanaye y su hija Mademoiselle Camilla, un crimen cometido en un\n" +
                "departamento ubicado en la calle Morgue, una frecuentada calle parisina.", 894,
                    "25 de marzo de 1841", "Graham's Magazine", "Español", categorias.get(4),0));

        libros.add(new Libro(10, "Adios, muñeca", "Raymond Chandler", "El detective Philip Marlowe emprende la búsqueda apasionada de una cantante pelirroja, se ve envuelto en la escena de un crimen y debe desenredar\n" +
                "un turbio asunto de deudas de juego. No tardará en descubrir que la costumbre de quienes lo rodean es disparar primero y preguntar después.", 487,
                    "09 de septiembre de 2013", "DEBOLSILLO", "Español", categorias.get(4),0));


        for (int i=0;i<categorias.size();i++){

            Categoria categoria;
            categoria = categorias.get(i);
            categoria.save();
        }

        for (int i=0;i<libros.size();i++){

            Libro libro;
            libro = libros.get(i);
            libro.save();
        }


        }

    }


    public void cambiarCategorias(View v)
    {
        Intent intent = new Intent(this, ActivityMenuCategorias.class);
        intent.putExtra("materia","appMoviles");
        intent.putExtra("aula",333);
        startActivity(intent);
    }

    public void cambiarFavoritos(View v)
    {
        Intent intent = new Intent(this,ActivityFavoritos.class);
        intent.putExtra("consigna","trabajoPractico");
       // intent.putExtra("entrega",1911);
        startActivity(intent);
    }


}
