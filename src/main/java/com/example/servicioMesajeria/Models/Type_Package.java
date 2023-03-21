package com.example.servicioMesajeria.Models;

public enum Type_Package {
    ;

    private final String LIVIANO;
    private  final String GRANDE;
    private  final String MEDIANO;

    Type_Package(String LIVIANO, String GRANDE, String MEDIANO) {
        this.LIVIANO = LIVIANO;
        this.GRANDE = GRANDE;
        this.MEDIANO = MEDIANO;
    }
}
