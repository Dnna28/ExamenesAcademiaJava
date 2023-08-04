package com.lambdas.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

// Clase ProductSupplier: contiene ejemplos de uso de Supplier e IntSupplier
public class ProductSupplier {

    public static void main(String[] args) {
        Supplier<StringBuilder> sup1 = () -> new StringBuilder("Product Supplier Example");
        System.out.println(sup1.get());

        Supplier<Integer> sup2 = () -> Integer.valueOf(9);
        Integer integer = sup2.get();
        System.out.println(integer);

        IntSupplier supint1 = () -> Integer.valueOf(8);
        integer = supint1.getAsInt();
        System.out.println(integer);

        Supplier<Integer> sup3 = () -> 8;
        int i = sup3.get();
        System.out.println(i);

        Supplier<Product> sup4 = () -> new Product(4, "Laptop", 1000.0, "Electronics");
        System.out.println(sup4.get());

        Supplier<List<String>> sup5 = () -> new ArrayList<String>();
        System.out.println(sup5.get());
    }
}
