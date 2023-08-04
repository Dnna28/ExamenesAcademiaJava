package com.InyeccionDeDependencias;

public class Inyector {

    // Método para inyectar el tipo de bebida al bartender
    static void inyectarBebida(Bartender bartender, String tipo) {
        if (tipo.equalsIgnoreCase("cafe"))
            bartender.setBebida(new Cafe());
        else if (tipo.equalsIgnoreCase("te"))
            bartender.setBebida(new Te());
        else if (tipo.equalsIgnoreCase("refresco"))
            bartender.setBebida(new Refresco());
    }
}
