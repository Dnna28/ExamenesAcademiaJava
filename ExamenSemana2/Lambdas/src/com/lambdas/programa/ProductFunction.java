package com.lambdas.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

// Clase ProductFunction: contiene ejemplos de uso de Function y UnaryOperator
public class ProductFunction {

    public static void main(String[] args) {
        Function<String, Integer> calculateLength = str -> str.length();
        int length = calculateLength.apply("This is a sample string.");
        System.out.println("Length of the string: " + length);

        Function<String, Product> createProduct = name -> new Product(0, name, 1000.0, "Misc");
        Product laptop = createProduct.apply("Laptop");
        System.out.println("New Product: " + laptop);

        Function<String, String> addGreeting = name -> "Hello, " + name;
        String greeting = addGreeting.apply("John");
        System.out.println(greeting);

        System.out.println("****************");

        UnaryOperator<String> capitalize = str -> str.toUpperCase();
        System.out.println(capitalize.apply("convert this to uppercase"));

        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product(0, "TV", 500.0, "Electronics"));
        listOfProducts.add(new Product(1, "Chair", 200.0, "Furniture"));
        listOfProducts.add(new Product(2, "Shirt", 30.0, "Clothing"));
        listOfProducts.add(new Product(3, "Book", 15.0, "Books"));
        listOfProducts.add(new Product(4, "Laptop", 1000.0, "Electronics"));

        listOfProducts.replaceAll(product -> {
            product.setPrice(product.getPrice() * 1.15);
            return product;
        });

        System.out.println("Updated Prices of Products:");
        listOfProducts.forEach(product -> System.out.println(product));
    }
}
