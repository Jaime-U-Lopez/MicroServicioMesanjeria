package com.example.servicioMesajeria.Models;

public enum Type_empleoyer {
    ;

    private String conductor;
    private String repartidor;
    private String coordinador;

    Type_empleoyer(String conductor, String repartidor, String coordinador) {
        this.conductor = conductor;
        this.repartidor = repartidor;
        this.coordinador = coordinador;
    }
}
