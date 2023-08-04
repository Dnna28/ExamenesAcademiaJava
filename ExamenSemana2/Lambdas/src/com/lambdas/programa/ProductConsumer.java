package com.lambdas.programa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.BiConsumer;

// Clase ProductConsumer: contiene ejemplos de uso de Consumer y BiConsumer
public class ProductConsumer {

    public static void main(String[] args) {
        Consumer<Product> con2 = w -> w.setPrice(w.getPrice() + 200);

        Product p = new Product(4, "Laptop", 1000.0, "Electronics");
        con2.accept(p);

        System.out.println(p);

        List<Product> listOfProducts = Arrays.asList(
                new Product(0, "TV", 500.0, "Electronics"),
                new Product(1, "Chair", 200.0, "Furniture"),
                new Product(2, "Shirt", 30.0, "Clothing"),
                new Product(3, "Book", 15.0, "Books"),
                new Product(4, "Laptop", 1000.0, "Electronics")
        );

        listOfProducts.forEach(p1 -> p1.setPrice(p1.getPrice() * 1.1));
        listOfProducts.forEach(product -> System.out.println(product));

        System.out.println("**BiConsumer**");

        Product product1 = new Product(4, "Laptop", 1000.0, "Electronics");

        BiConsumer<Product, Double> biCons = (u, v) -> u.setPrice(u.getPrice() + v);

        biCons.accept(product1, 50.0);

        System.out.println(product1);
    }
}
