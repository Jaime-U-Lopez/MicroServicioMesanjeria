package com.example.servicioMesajeria.Repository;

import com.example.servicioMesajeria.Models.Customer;

import java.util.LinkedList;
import java.util.List;

public interface metodosDatabase {


    public boolean createElement(Object element);

    public boolean deleteElement(int id);

    public List<Object> getElementAll();

    public Object getElement(int id);

    public boolean UpdateCustomer(Object elemento);



}
