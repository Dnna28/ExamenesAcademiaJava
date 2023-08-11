package com.libros;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipalLibros {
    public static void main(String[] args) {
        Libro libro1 = new Libro(1, "Cien años de soledad", 350, Nacionalidad.ESPAÑOL);
        Libro libro2 = new Libro(2, "Pride and Prejudice", 400, Nacionalidad.INGLES);
        Libro libro3 = new Libro(3, "Le Petit Prince", 150, Nacionalidad.FRANCES);

        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);

        List<String> titulosInteresantes = listaLibros.stream()
                .filter(libro -> libro.getPaginas() > 300 && libro.getAutorNacionalidad() == Nacionalidad.ESPAÑOL)
                .sorted(Comparator.comparing(Libro::getPaginas).reversed())
                .map(Libro::getTitulo)
                .collect(Collectors.toList());

        titulosInteresantes.forEach(System.out::println);
    }
}
