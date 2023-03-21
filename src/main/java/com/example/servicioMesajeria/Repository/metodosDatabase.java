package com.example.servicioMesajeria.Repository;

import com.example.servicioMesajeria.Models.Customer;

import java.util.LinkedList;
import java.util.List;

public interface metodosDatabase {


    public boolean createElement(Object element);

    public boolean deleteElement(String id);

    public List<Object> getElementAll();

    public Object getElement(String id);

    public boolean UpdateElement(Object elemento);



}
