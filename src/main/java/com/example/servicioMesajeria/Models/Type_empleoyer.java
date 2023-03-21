package com.example.servicioMesajeria.Models;

public enum Type_empleoyer {
    ;

    private final String CONTADOR;
    private  final String REPARTIDOR;
    private final String COORDINADOR;


    Type_empleoyer(String CONTADOR, String REPARTIDOR, String COORDINADOR) {
        this.CONTADOR = CONTADOR;
        this.REPARTIDOR = REPARTIDOR;
        this.COORDINADOR = COORDINADOR;
    }
}
