package com.example.servicioMesajeria.Repository;

import com.example.servicioMesajeria.Models.Employee;

import java.util.List;

public class EmpleoyeDatabase implements metodosDatabase{

    private Employee employer;


    public EmpleoyeDatabase(Employee employer){
        this.employer=employer;
    }


    @Override
    public boolean createElement(Object element) {
        return false;
    }

    @Override
    public boolean deleteElement(String id) {
        return false;
    }

    @Override
    public List<Object> getElementAll() {
        return null;
    }

    @Override
    public Object getElement(String id) {
        return null;
    }

    @Override
    public boolean UpdateElement(Object elemento) {
        return false;
    }
}
