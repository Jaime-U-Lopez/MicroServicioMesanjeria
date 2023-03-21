package com.example.servicioMesajeria.Repository;

import com.example.servicioMesajeria.Models.Employer;

import java.util.List;

public class EmpleoyeDatabase implements metodosDatabase{

    private Employer employer;


    public EmpleoyeDatabase(Employer employer){
        this.employer=employer;
    }


    @Override
    public boolean createElement(Object element) {
        return false;
    }

    @Override
    public boolean deleteElement(int id) {
        return false;
    }

    @Override
    public List<Object> getElementAll() {
        return null;
    }

    @Override
    public Object getElement(int id) {
        return null;
    }

    @Override
    public boolean UpdateCustomer(Object elemento) {
        return false;
    }
}
