package com.example.servicioMesajeria.Models;

public enum State_Send_Package {
    ;


    private String recibido;
    private String enRuta;
    private String entregado;


    State_Send_Package(String recibido, String enRuta, String entregado) {
        this.recibido = recibido;
        this.enRuta = enRuta;
        this.entregado = entregado;
    }
}
