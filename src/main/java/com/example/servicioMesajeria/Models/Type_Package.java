package com.example.servicioMesajeria.Models;

public enum Type_Package {
    ;

    private  String liviano;
    private String grande;
    private String mediano;

    Type_Package(String liviano, String grande, String mediano) {
        this.liviano = liviano;
        this.grande = grande;
        this.mediano = mediano;
    }
}
