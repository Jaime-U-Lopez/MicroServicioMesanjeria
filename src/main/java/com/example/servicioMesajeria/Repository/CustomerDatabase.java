package com.example.servicioMesajeria.Repository;

import com.example.servicioMesajeria.Models.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerDatabase implements metodosDatabase {


    private Customer customer;
    private List<Customer> listcustomers;

    public CustomerDatabase(Customer customer) {
        this.customer = customer;
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
    public Customer getElement(int id) {
        return null;
    }

    @Override
    public boolean UpdateCustomer(Object elemento) {
        return false;
    }
}
