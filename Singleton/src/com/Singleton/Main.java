package com.Singleton;

public class Main {
    public static void main(String[] args) {

        // Obtener la única instancia de ConfiguracionIdioma mediante el método estático getInstance().
        ConfiguracionIdioma configuracionIdioma = ConfiguracionIdioma.getInstance();

        System.out.println("Idioma actual: " + configuracionIdioma.idioma);

        // Cambiar el idioma actual utilizando el método cambiarIdioma(String nuevoIdioma).
        configuracionIdioma.cambiarIdioma("es");

        System.out.println("Idioma actual: " + configuracionIdioma.idioma);

        // Obtener otra instancia de ConfiguracionIdioma, pero será la misma que la anterior debido a Singleton.
        ConfiguracionIdioma otraConfiguracion = ConfiguracionIdioma.getInstance();

        // Verificar si ambas instancias son la misma 
        System.out.println("¿Es la misma instancia? " + (configuracionIdioma == otraConfiguracion)); 
    }
}
