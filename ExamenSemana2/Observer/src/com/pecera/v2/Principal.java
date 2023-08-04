package com.pecera.v2;

public class Principal {

    public static void main(String[] args) {
        EstadoPecera estadoPecera = new EstadoPecera();

        // Se crean y registran observadores para iluminación y termómetro.
        Observer obs1 = new Iluminacion(estadoPecera);
        Observer obs2 = new Termometro(estadoPecera);

        // Se realiza la actualización del estado de la pecera y los observadores reaccionan.
        estadoPecera.actualizarVersion();

        System.out.println("******************************************************");

        // Se crean y registran observadores adicionales para alimentador automático y aireadores.
        Observer obs4 = new Aireadores(estadoPecera);
        Observer obs3 = new AlimentadorAutomatico(estadoPecera);

        // Se elimina el observador de iluminación (obs1) para que ya no reciba actualizaciones.
        estadoPecera.detach(obs1);

        // Se realiza otra actualización del estado de la pecera y los observadores reaccionan nuevamente.
        estadoPecera.actualizarVersion();

        System.out.println("******************************************************");
    }
}
