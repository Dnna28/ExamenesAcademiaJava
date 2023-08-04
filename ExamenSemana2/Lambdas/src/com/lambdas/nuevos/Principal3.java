package com.lambdas.nuevos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Principal3 {
    public static void main(String[] args) {

        // Vamos a utilizar una lambda Consumer para imprimir los elementos de una lista.

        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");

        Consumer<String> imprimir = s -> System.out.println(s);
        frutas.forEach(imprimir);

        System.out.println("**********");

        // Vamos a utilizar una lambda Consumer para imprimir los elementos de una lista.

        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        Consumer<String> imprimirColores = s -> System.out.println(s);
        colores.forEach(imprimirColores);
    }
}
