package com.InyeccionDeDependencias;

public class Cafe implements Bebida  {

    @Override
    public String preparar() {
        return "preparando café";
    }
}
