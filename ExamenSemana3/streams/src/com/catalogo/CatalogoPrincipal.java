package com.catalogo;

import java.util.*;
import java.util.stream.Collectors;

public class CatalogoPrincipal {

    private static Product[] arrayOfProducts = {
            new Product(101, "Smartphone", 399.99),
            new Product(102, "Laptop", 999.99),
            new Product(103, "Headphones", 89.99),
            new Product(104, "Tablet", 299.99),
            new Product(105, "Smartwatch", 149.99)
    };

    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(arrayOfProducts);

        System.out.println("== Filtrado de productos ==");

        // Filtrar productos con precio menor a 300
        // Incrementar el precio en 50
        // Filtrar productos con nombre de longitud mayor a 8
        // Ordenar por nombre
        // Obtener una lista de nombres: List<String> productNames

        List<String> productNames = productList.stream()
                .filter(p -> p.getPrice() < 300)
                .peek(p -> p.setPrice(p.getPrice() + 50))
                .filter(p -> p.getName().length() > 8)
                .sorted(Comparator.comparing(Product::getName))
                .map(p -> p.getName())
                .collect(Collectors.toList());

        productNames.forEach(name -> System.out.println(name));
    }
}

