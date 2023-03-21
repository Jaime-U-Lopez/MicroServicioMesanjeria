package com.example.servicioMesajeria.Models;

import org.springframework.stereotype.Component;

@Component
public class Customer extends Person {

    private int id;
    private long celular;
    private String correoElectronico;
    private String direccionResidencia;
    private String ciudad;

    public Customer(int id, int cedula, String name, String lastName, long celular, String correoElectronico, String direccionResidencia, String ciudad) {
        super(cedula, name, lastName);
        this.id = id;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }


    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
