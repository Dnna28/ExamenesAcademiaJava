package com.example;

import com.example.services.Operacion;

public class Calculo {
    public static void main(String[] args) {


        Operacion operacion = new Operacion();

        int res = operacion.calcularFiniquito(200,100);
        System.out.println(res);




    }
}