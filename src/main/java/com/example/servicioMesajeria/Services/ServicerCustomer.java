package com.example.servicioMesajeria.Services;


import com.example.servicioMesajeria.Models.Customer;
import com.example.servicioMesajeria.Repository.CustomerDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicerCustomer  {


    private CustomerDatabase customerDatabase;

    @Autowired
    public ServicerCustomer(CustomerDatabase customerDatabase) {
        this.customerDatabase = customerDatabase;
    }



    public boolean deleteCustomer(String id) {
        return this.customerDatabase.deleteElement(id);
    }


    public boolean createCustomer(Customer customer ) {
        return false;
    }


    public List<Customer> getCustomerAll() {
        return null;
    }


    public Customer getCustomer(String id) {
        return null;
    }


    public boolean updateCustomer(Customer customer, String id) {
        return false;
    }
}
