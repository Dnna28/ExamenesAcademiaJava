package com.pecera.v1;

class EstadoPecera {
    Termometro termometro = new Termometro();
    Iluminacion iluminacion = new Iluminacion();
    AlimentadorAutomatico alimentadorAutomatico = new AlimentadorAutomatico();

    EstadoPecera() {
    }

    // Método actualizarEstado: actualiza el estado de la pecera, ajustando la temperatura,
    // activando el alimentador, ajustando la iluminación y mostrando mensajes informativos.
    void actualizarEstado() {
        System.out.println("Actualización del estado de la pecera");
        this.termometro.ajusteTemperatura();
        this.alimentadorAutomatico.activarAlimentador();

        try {
            Thread.sleep(3000L); // Espera de 3 segundos para simular el proceso de actualización.
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

        this.iluminacion.ajusteIluminacion();
        System.out.println("Fin actualización");
    }
}