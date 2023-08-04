package com.lambdas.nuevos;

import java.util.Random;
import java.util.function.Supplier;

public class Principal4 {
    public static void main(String[] args) {

        // Vamos a utilizar una lambda Supplier para generar números aleatorios.

        Supplier<Integer> numeroAleatorio = () -> new Random().nextInt(100);

        int num1 = numeroAleatorio.get();
        int num2 = numeroAleatorio.get();

        System.out.println("Número aleatorio 1: " + num1);
        System.out.println("Número aleatorio 2: " + num2);

        System.out.println("**********");

        // Vamos a utilizar una lambda Supplier para generar números aleatorios.

        Supplier<Integer> otroNumeroAleatorio = () -> new Random().nextInt(50);

        int num3 = otroNumeroAleatorio.get();
        int num4 = otroNumeroAleatorio.get();

        System.out.println("Otro número aleatorio 1: " + num3);
        System.out.println("Otro número aleatorio 2: " + num4);
    }
}
