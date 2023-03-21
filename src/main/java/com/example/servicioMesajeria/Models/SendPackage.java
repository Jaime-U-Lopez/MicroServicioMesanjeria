package com.example.servicioMesajeria.Models;

public class SendPackage {


    private char numeroGuia;
    private Customer customer;
    private Package packages;
    private int valorEnvio;
    private long celularPersonaRecibe;
    private String nombrePersonaRecibe;
    private String horaEntrega;
    private State_Send_Package estadoEnvio;
    private Adress_Send adress_send;

    public SendPackage(char numeroGuia, Customer customer, Package packages, int valorEnvio, long celularPersonaRecibe, String nombrePersonaRecibe, String horaEntrega, State_Send_Package estadoEnvio, Adress_Send adress_send) {
        this.numeroGuia = numeroGuia;
        this.customer = customer;
        this.packages = packages;
        this.valorEnvio = valorEnvio;
        this.celularPersonaRecibe = celularPersonaRecibe;
        this.nombrePersonaRecibe = nombrePersonaRecibe;
        this.horaEntrega = horaEntrega;
        this.estadoEnvio = estadoEnvio;
        this.adress_send = adress_send;
    }
}


