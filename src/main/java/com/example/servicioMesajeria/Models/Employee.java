package com.example.servicioMesajeria.Models;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Employee extends Person {


    private int id;
    private Date antiguedad;
    private char tipoSangreRH;
    private Type_empleoyer typeEmpleoyer;
    private long celular;
    private String correoElectronico;
    private String direccionResidencia;
    private String ciudad;


    public Employee(long cedula, String name, String lastName, int id, Date antiguedad, char tipoSangreRH, Type_empleoyer typeEmpleoyer, long celular, String correoElectronico, String direccionResidencia, String ciudad) {
        super(cedula, name, lastName);
        this.id = id;
        this.antiguedad = antiguedad;
        this.tipoSangreRH = tipoSangreRH;
        this.typeEmpleoyer = typeEmpleoyer;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public Date getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Date antiguedad) {
        this.antiguedad = antiguedad;
    }

    public char getTipoSangreRH() {
        return tipoSangreRH;
    }

    public void setTipoSangreRH(char tipoSangreRH) {
        this.tipoSangreRH = tipoSangreRH;
    }

    public Type_empleoyer getTypeEmpleoyer() {
        return typeEmpleoyer;
    }

    public void setTypeEmpleoyer(Type_empleoyer typeEmpleoyer) {
        this.typeEmpleoyer = typeEmpleoyer;
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
