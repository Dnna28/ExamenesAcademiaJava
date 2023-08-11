package com.tienda;

import java.util.HashMap;
import java.util.Map;

public class TiendaServicio {

    private final Map<String, Producto> productos = new HashMap<>();

    public Producto agregarProducto(String codigo, String nombre, double precio) {
        Producto nuevoProducto = new Producto(codigo, nombre, precio);
        productos.put(codigo, nuevoProducto);
        return nuevoProducto;
    }

    public Producto obtenerProducto(String codigo) {
        return productos.get(codigo);
    }

    public Producto actualizarPrecio(String codigo, double nuevoPrecio) {
        if (productos.containsKey(codigo)) {
            Producto productoActualizado = productos.get(codigo);
            productoActualizado = new Producto(codigo, productoActualizado.getNombre(), nuevoPrecio);
            productos.put(codigo, productoActualizado);
            return productoActualizado;
        } else {
            throw new IllegalArgumentException("El producto con el código dado no existe.");
        }
    }
}
