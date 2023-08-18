package com.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class CloudCalculoFiniquitoImplTest {

    @InjectMocks
    private Operacion operacion;

    @Mock
    private CloudCalculoAzure cloudCalculoAzure;

    // Nos ayudara a inicializar los mocks
    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCalcularFiniquito(){
        int salario = 100;
        int diasLaborados = 200;

        // Se define el comportaiento del mock
        Mockito.when(cloudCalculoAzure.calcularFiniquito(salario,diasLaborados)).thenReturn(20000);

        // Se invoca al metodo que deseamos probar
        int res = operacion.calcularFiniquito(salario,diasLaborados);

        System.out.println(res);
        // Se realiza la comparacion y verificacion
        Assertions.assertEquals(200001,res);
    }




}