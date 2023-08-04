// Clase Subject: representa el sujeto observado (la pecera) y mantiene una lista de observadores registrados.
package com.pecera.v2;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {

    List<Observer> listaElementos = new ArrayList<>();

    // Método attach: registra un observador en la lista de observadores.
    void attach(Observer o) {
        listaElementos.add(o);
    }

    // Método detach: elimina un observador de la lista de observadores.
    void detach(Observer o) {
        listaElementos.remove(o);
    }

    // Método notificar: notifica a todos los observadores registrados llamando a su método update.
    void notificar() {
        for (Observer o: listaElementos) {
            o.update();
        }
    }
}
