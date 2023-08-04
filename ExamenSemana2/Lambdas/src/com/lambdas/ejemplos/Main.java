package com.lambdas.ejemplos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Ejemplo 1 - Runnable
        // Runnable representa una tarea que se ejecuta en un hilo separado.
        // Aquí creamos un Runnable que imprime "Hello, this is a thread!" cinco veces.
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, this is a thread!");
            }
        };
        new Thread(task).start();

        System.out.println("****************************************************");

        // Ejemplo 2 - Comparator
        // Comparator es una interfaz funcional para comparar elementos.
        // Aquí usamos un lambda para ordenar una lista de números enteros en orden descendente.
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        numbers.sort(Comparator.reverseOrder());
        System.out.println("****************************************************");

        System.out.println(numbers);


        System.out.println("****************************************************");

        // Ejemplo 3 - Function
        // Function representa una función que toma un argumento y devuelve un resultado.
        // Aquí usamos un lambda para convertir una cadena a mayúsculas.

        Function<String, String> toUpperCase = String::toUpperCase;
        String original = "Hello, Lambda!";
        String upperCase = toUpperCase.apply(original);
        System.out.println(upperCase);

        System.out.println("****************************************************");


        // Ejemplo 4 - Predicate
        // Predicate representa un predicado o condición que se evalúa a verdadero o falso.
        // Aquí usamos un lambda para filtrar elementos pares de una lista de números enteros.
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> evenNumbers = numbersList.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenNumbers);

        System.out.println("****************************************************");


        // Ejemplo 5 - Consumer
        // Consumer representa una operación que toma un argumento y no devuelve ningún resultado.
        // Aquí usamos un lambda para imprimir los elementos de una lista de cadenas.
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");
        Consumer<String> printFruit = fruit -> System.out.println("I like " + fruit);
        fruits.forEach(printFruit);

        System.out.println("****************************************************");


        // Ejemplo 6 - BiFunction
        // BiFunction representa una función que toma dos argumentos y devuelve un resultado.
        // Aquí usamos un lambda para concatenar dos cadenas.
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + " " + str2;
        String result = concatenate.apply("Hello", "Lambda!");
        System.out.println(result);

        System.out.println("****************************************************");


        // Ejemplo 7 - BiPredicate
        // BiPredicate representa un predicado con dos argumentos que se evalúa a verdadero o falso.
        // Aquí usamos un lambda para verificar si dos cadenas tienen la misma longitud.
        String str1 = "Hello";
        String str2 = "Lambda";
        BiPredicate<String, String> sameLength = (s1, s2) -> false;
        System.out.println(sameLength.test(str1, str2));

        System.out.println("****************************************************");


        // Ejemplo 8 - UnaryOperator
        // UnaryOperator representa una operación que toma un argumento y devuelve un resultado del mismo tipo.
        // Aquí usamos un lambda para sumar un valor a todos los elementos de una lista.
        List<Integer> numbersUnary = Arrays.asList(1, 2, 3, 4, 5);
        UnaryOperator<Integer> addFive = num -> num + 5;
        List<Integer> updatedNumbers = numbersUnary.stream().map(addFive).collect(Collectors.toList());
        System.out.println(updatedNumbers);

        System.out.println("****************************************************");


        // Ejemplo 9 - BinaryOperator
        // BinaryOperator representa una operación que toma dos argumentos del mismo tipo y devuelve un resultado del mismo tipo.
        // Aquí usamos un lambda para sumar dos números enteros.
        BinaryOperator<Integer> sum = Integer::sum;
        int resultBinary = sum.apply(5, 10);
        System.out.println(resultBinary);

        System.out.println("****************************************************");


        // Ejemplo 10 - Supplier
        // Supplier representa una función que no toma argumentos y devuelve un resultado.
        // Aquí usamos un lambda para obtener la fecha actual.
        Supplier<Date> getCurrentDate = Date::new;
        Date currentDate = getCurrentDate.get();
        System.out.println(currentDate);
    }
}
