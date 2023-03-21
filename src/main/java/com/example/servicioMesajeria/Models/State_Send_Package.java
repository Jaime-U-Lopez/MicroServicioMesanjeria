package com.example.servicioMesajeria.Models;

public enum State_Send_Package {
    ;


    private final String recibido;
    private  final String enRuta;
    private final   String entregado;

    State_Send_Package(String recibido, String enRuta, String entregado) {
        this.recibido = recibido;
        this.enRuta = enRuta;
        this.entregado = entregado;
    }
}
