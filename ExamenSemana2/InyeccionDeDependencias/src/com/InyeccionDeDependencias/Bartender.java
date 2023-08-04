package com.InyeccionDeDependencias;

public class Bartender {

    private String nombre;
    private Bebida bebida;

    public Bartender(String nombre) {
        this.nombre = nombre;
    }

    // Método para preparar la bebida
    void prepararBebida() {
        System.out.println(nombre + " prepara: " + bebida.preparar());
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
}
