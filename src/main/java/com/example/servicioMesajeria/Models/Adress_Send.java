package com.example.servicioMesajeria.Models;

public class Adress_Send {

    private String ciudadDestino;
    private String ciudadOrigen;
    private String direccion;
    private String ciudad;

    public Adress_Send(String ciudadDestino, String ciudadOrigen, String direccion, String ciudad) {
        this.ciudadDestino = ciudadDestino;
        this.ciudadOrigen = ciudadOrigen;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
}
