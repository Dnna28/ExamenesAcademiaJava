package com.lambdas.nuevos;

import java.util.function.Predicate;

public class Principal {
    public static void main(String[] args) {

        // Vamos a evaluar una lambda Predicate donde vamos a pasar
        // un valor entero y la lambda va a evaluar si es positivo (true)
        // o negativo (false)

        Predicate<Integer> pre = i -> i >= 0;

        boolean r = pre.test(-3);

        if (r)
            System.out.println("Es positivo");
        else
            System.out.println("Es negativo");

        System.out.println("**********");

        // Vamos a evaluar una lambda Predicate donde vamos a pasar
        // un valor entero y la lambda va a evaluar si es positivo (true)
        // o negativo (false)

        Predicate<Integer> pre2 = i -> i >= 0;

        boolean r2 = pre2.test(5);

        if (r2)
            System.out.println("Es positivo");
        else
            System.out.println("Es negativo");
    }
}
