package com.lambdas.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

// Clase ProductCategories: contiene el programa principal para clasificar productos por categorías
public class ProductCategories {

    public static void main(String[] args) {
        Product p = new Product(4, "Laptop", 1000.0, "Electronics");

        // DEFINICION LAMBDA: Ejemplo de uso de BiPredicate
        BiPredicate<Product, Double> bp01 = (x, y) -> true;
        boolean res = bp01.test(p, 10.0);
        System.out.println(res);

        // DEFINICION DE LAMBDA: Otra condición sobre el producto y un valor double
        bp01 = (x, y) -> p.getPrice() > y;
        res = bp01.test(p, 100.0);
        System.out.println(res);

        // DEFINICION DE LAMBDA: Condición sobre el nombre del producto
        BiPredicate<String, Product> bp02 = (x, y) -> y.getName().equals(x);
        res = bp02.test("Laptop", p);
        System.out.println(res);

        System.out.println("***********");

        List<Product> listOfProducts = new ArrayList<>();

        listOfProducts.add(new Product(0, "TV", 500.0, "Electronics"));
        listOfProducts.add(new Product(1, "Chair", 200.0, "Furniture"));
        listOfProducts.add(new Product(2, "Shirt", 30.0, "Clothing"));
        listOfProducts.add(new Product(3, "Book", 15.0, "Books"));
        listOfProducts.add(new Product(4, "Laptop", 1000.0, "Electronics"));

        listOfProducts.removeIf(product -> product.getPrice() <= 300);

        listOfProducts.forEach(product -> System.out.println(product));
    }
}
