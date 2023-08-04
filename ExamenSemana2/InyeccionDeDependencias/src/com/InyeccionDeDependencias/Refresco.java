package com.InyeccionDeDependencias;

public class Refresco implements Bebida {

    @Override
    public String preparar() {
        return "preparando refresco";
    }
}
