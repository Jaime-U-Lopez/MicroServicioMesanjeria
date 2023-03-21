package com.example.servicioMesajeria.Repository;

import com.example.servicioMesajeria.Models.Customer;

import java.util.List;

public class CustomerDatabase implements metodosDatabase {

    public CustomerDatabase() {
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
