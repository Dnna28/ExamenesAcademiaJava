package com.example.services;

public class Operacion {

    CloudCalculoAzure cloudCalculoAzure;

    public int calcularFiniquito(int salario, int diasLaborando) {
        System.out.println("Calculando el finiquito");
        return salario * diasLaborando;
    }
}
