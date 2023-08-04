package com.pecera.v2;

public class Iluminacion extends Observer {

    public Iluminacion(Subject sub) {
        super(sub);
    }

    // Método ajusteIluminacion: muestra el ajuste de iluminación.
    void ajusteIluminacion() {
        System.out.println("Se hace ajuste de iluminacion");
    }

    @Override
    public void update() {
        ajusteIluminacion(); // Al actualizarse, se ajusta la iluminación.
        cambiarTonalidad(); // Al actualizarse, se cambia la tonalidad de la luz.
    }

    // Método cambiarTonalidad: muestra el cambio de tonalidad de la luz.
    void cambiarTonalidad() {
        System.out.println("Se cambia tonalidad de la luz");
    }
}