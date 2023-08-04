// Clase Principal: clase principal del programa para ejecutar las actualizaciones del estado de la pecera.
package com.pecera.v1;

public class Principal {
    public Principal() {
    }

    // Método main: crea una instancia de EstadoPecera y llama al método actualizarEstado para iniciar las actualizaciones.
    public static void main(String[] args) {
        EstadoPecera funciones = new EstadoPecera();
        funciones.actualizarEstado();
    }
}