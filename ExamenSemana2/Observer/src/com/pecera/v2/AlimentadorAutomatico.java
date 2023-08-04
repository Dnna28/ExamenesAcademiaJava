package com.pecera.v2;

public class AlimentadorAutomatico extends Observer {

    public AlimentadorAutomatico(Subject sub) {
        super(sub);
    }

    // Método activarAlimentador: muestra el tipo de comida que sale del alimentador.
    void activarAlimentador(String comida) {
        System.out.println("Sale comida: " + comida);
    }

    @Override
    public void update() {
        activarAlimentador("Camarones"); // Al actualizarse, el alimentador dispensa camarones.
    }
}