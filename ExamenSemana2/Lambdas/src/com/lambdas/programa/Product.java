package com.lambdas.programa;

// Clase Product: representa un producto con id, nombre, precio y categoría
public class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters y setters para acceder y modificar los atributos del producto
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
    }

    // Método estático para agregar un incremento al precio de un producto
    static Product addPrice(Product p, double inc) {
        p.setPrice(p.getPrice() * inc);
        return p;
    }

    // Método para incrementar el precio de un producto actual en base a un incremento
    Product increasePrice(double inc) {
        this.setPrice(this.getPrice() * inc);
        return this;
    }
}
