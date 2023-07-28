package com.Singleton;

public class ConfiguracionIdioma {

    private static ConfiguracionIdioma instance;

    // Variable pública para almacenar el idioma actual
    public String idioma;


    private ConfiguracionIdioma() {
        idioma = "en";
    }

    // un método público y estático para obtener la única instancia de ConfiguracionIdioma.
    public static ConfiguracionIdioma getInstance() {

        if (instance == null) {
            instance = new ConfiguracionIdioma();
        }

        return instance;
    }

    // Método para cambiar el idioma actual
    public void cambiarIdioma(String nuevoIdioma) {
        idioma = nuevoIdioma;
        System.out.println("Idioma cambiado a: " + idioma);
  
    }
}
