package com.pecera.v2;

public class Termometro extends Observer {

    public Termometro(Subject sub) {
        super(sub);
    }

    // Método ajusteTemperatura: muestra el ajuste de la temperatura.
    void ajusteTemperatura() {
        System.out.println("Se ajusta la temperatura general");
    }

    @Override
    public void update() {
        ajusteTemperatura(); // Al actualizarse, se ajusta la temperatura.
    }
}
