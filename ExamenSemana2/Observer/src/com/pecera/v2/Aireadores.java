// Clase Aireadores: representa un observador de aireadores que reacciona ante actualizaciones del estado de la pecera.
package com.pecera.v2;

public class Aireadores extends Observer {

    public Aireadores(Subject sub) {
        super(sub);
    }

    // Método activacionAireadores: muestra el estado de los aireadores.
    void activacionAireadores(String estado) {
        System.out.println("Aireadores: " + estado);
    }

    @Override
    public void update() {
        activacionAireadores("encendidos"); // Al actualizarse, los aireadores se consideran encendidos.
    }
}