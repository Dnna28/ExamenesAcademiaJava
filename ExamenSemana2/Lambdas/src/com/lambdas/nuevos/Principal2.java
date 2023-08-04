package com.lambdas.nuevos;

import java.util.function.Function;

public class Principal2 {
    public static void main(String[] args) {

        // Vamos a evaluar una lambda Function donde vamos a pasar
        // un valor decimal y regresar un String con dos decimales.

        Function<Double, String> fun = d -> String.format("%.2f", d);

        System.out.println(fun.apply(3.14159));

        System.out.println("**********");

        // Vamos a evaluar una lambda Function donde vamos a pasar
        // un valor decimal y regresar un String con dos decimales.

        Function<Double, String> fun2 = d -> String.format("%.2f", d);

        System.out.println(fun2.apply(2.71828));
    }
}
