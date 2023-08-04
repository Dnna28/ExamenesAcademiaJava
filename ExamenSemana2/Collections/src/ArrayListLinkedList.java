import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor;
    }
}

public class ArrayListLinkedList {
    public static void main(String[] args) {

        // Ejemplo con ArrayList para almacenar libros
        List<Libro> arrayListLibros = new ArrayList<>();

        // Agregar libros al ArrayList
        arrayListLibros.add(new Libro("El principito", "Antoine de Saint-Exupéry"));
        arrayListLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        arrayListLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));

        // Mostrar contenido del ArrayList
        System.out.println("Contenido del ArrayList de libros:");
        for (Libro libro : arrayListLibros) {
            System.out.println(libro);
        }

        // Eliminar un libro del ArrayList
        arrayListLibros.remove(1);

        // Mostrar contenido actualizado del ArrayList
        System.out.println("Contenido actualizado del ArrayList de libros:");
        for (Libro libro : arrayListLibros) {
            System.out.println(libro);
        }

        System.out.println("**********");

        // Ejemplo con LinkedList para almacenar libros
        List<Libro> linkedListLibros = new LinkedList<>();

        // Agregar libros al LinkedList
        linkedListLibros.add(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling"));
        linkedListLibros.add(new Libro("Orgullo y prejuicio", "Jane Austen"));
        linkedListLibros.add(new Libro("1984", "George Orwell"));

        // Mostrar contenido del LinkedList
        System.out.println("Contenido del LinkedList de libros:");
        for (Libro libro : linkedListLibros) {
            System.out.println(libro);
        }

        // Eliminar un libro del LinkedList
        linkedListLibros.remove(0);

        // Mostrar contenido actualizado del LinkedList
        System.out.println("Contenido actualizado del LinkedList de libros:");
        for (Libro libro : linkedListLibros) {
            System.out.println(libro);
        }
    }
}
