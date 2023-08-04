package com.InyeccionDeDependencias;

public class Principal {

    public static void main(String[] args) {

        // Creamos un Bartender llamado "Lucia"
        Bartender bartender1 = new Bartender("Lucia");
        // Inyectamos la bebida tipo "cafe" al bartender1
        Inyector.inyectarBebida(bartender1, "cafe");
        // El bartender1 prepara la bebida
        bartender1.prepararBebida();

        // Creamos un Bartender llamado "Carlos"
        Bartender bartender2 = new Bartender("Carlos");
        // Inyectamos la bebida tipo "te" al bartender2
        Inyector.inyectarBebida(bartender2, "te");
        // El bartender2 prepara la bebida
        bartender2.prepararBebida();

        // Creamos un Bartender llamado "Luis"
        Bartender bartender3 = new Bartender("Luis");
        // Inyectamos la bebida tipo "refresco" al bartender3
        Inyector.inyectarBebida(bartender3, "refresco");
        // El bartender3 prepara la bebida
        bartender3.prepararBebida();

        // Puedes seguir añadiendo más bartenders y tipos de bebidas aquí.

    }

}
