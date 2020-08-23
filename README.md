# android
Desarrollo de una App para una librería. Implementación de ORM Sugar. (https://satyan.github.io/sugar/)

Se debe desarrollar una aplicación para dispositivos Android, utilizando
lenguaje Java y respetando la siguiente pauta:

Desarrollo de una aplicación para Android, la cual deberá ser un
sistema de “Lista de deseos de libros”, respetando los siguientes
puntos:

* Los libros disponibles para marcar como “favorito”, deben
obtenerse de una tabla en SQLite.
* En la base de datos tiene que haber cargados al menos 10
libros a elección del alumno.
* Los datos de un libro son:
  * Id
  * Titulo
  * Autor
  * Sinopsis
  * FechaDePublicacion
  * Editorial
  * CantidadDePaginas
  * Idioma
  * Categorias (Array)

* La pantalla de inicio debe tener las opciones de “ver libros
por categoría” y “ver listado de favoritos”.
* En “ver libros por categoría” se deben listar todas las
categorías de libros, pudiendo navegar dentro de ellas y ver
los libros pertenecientes a dicha categoría.
* Se debe poder ingresar a cualquier libro y ver todos los datos
relacionados al mismo
* Desde la pantalla de descripción, se debe poder agregar el
libro a una “lista de favoritos”, que debe estar almacenada de
manera local en SQLite.
* En la pantalla de “ver listado de favoritos” se deben poder ver
todos los libros guardados en favoritos y se deben poder
eliminar libros del listado.
* Las activities deben extender de “Activity” y no de
“AppCompatActivity”
