package com.example.servicioMesajeria.Models;


import org.springframework.stereotype.Component;

@Component
public class Package {

    private int id;
    private  static int contadorPaquetes;
    private Type_Package typePackage;
    private int pesoPaquete;
    private int valorPaquete;

    public Package(int id, Type_Package typePackage, int pesoPaquete, int valorPaquete) {
        this.id = id;
        this.typePackage = typePackage;
        this.pesoPaquete = pesoPaquete;
        this.valorPaquete = valorPaquete;
    }

    public int getId() {
        return id;
    }

    public Type_Package getTypePackage() {
        return typePackage;
    }

    public void setTypePackage(Type_Package typePackage) {
        this.typePackage = typePackage;
    }

    public int getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(int pesoPaquete) {
        this.pesoPaquete = pesoPaquete;
    }

    public int getValorPaquete() {
        return valorPaquete;
    }

    public void setValorPaquete(int valorPaquete) {
        this.valorPaquete = valorPaquete;
    }
}
