package com.lambdas.nuevos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal5 {
    public static void main(String[] args) {

        // Vamos a utilizar una lambda Comparator para ordenar una lista de objetos.

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Pedro", 20));

        Comparator<Persona> comparadorPorEdad = (p1, p2) -> p1.getEdad() - p2.getEdad();
        Collections.sort(personas, comparadorPorEdad);

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad() + " años");
        }

        System.out.println("**********");

        // Vamos a utilizar una lambda Comparator para ordenar una lista de objetos.

        List<Persona> otrasPersonas = new ArrayList<>();
        otrasPersonas.add(new Persona("Ana", 28));
        otrasPersonas.add(new Persona("Carlos", 22));
        otrasPersonas.add(new Persona("Luis", 26));

        Comparator<Persona> comparadorPorNombre = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
        Collections.sort(otrasPersonas, comparadorPorNombre);

        for (Persona persona : otrasPersonas) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad() + " años");
        }
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
