package com.pecera.v2;

public class EstadoPecera extends Subject {

    // Método actualizarVersion: simula la actualización del estado de la pecera y notifica a los observadores.
    void actualizarVersion() {

        System.out.println("Empieza a actualizar estado de la pecera");

        try {
            Thread.sleep(3000); // Simulación de proceso de actualización que toma 3 segundos.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        notificar(); // Notifica a todos los observadores registrados sobre la actualización.

        System.out.println("Fin actualización");
    }
}