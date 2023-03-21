package com.example.servicioMesajeria.Services;


import com.example.servicioMesajeria.Models.Employee;
import com.example.servicioMesajeria.Repository.EmpleoyeDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmployee {


    private EmpleoyeDatabase empleoyeDatabase;


    @Autowired
    public ServiceEmployee(EmpleoyeDatabase empleoyeDatabase) {
        this.empleoyeDatabase = empleoyeDatabase;
    }


    public boolean createEmployee(Object element) {
        return false;
    }

    public boolean deleteEmployee(String id) {
        return false;
    }

    public List<Employee> getEmployeeAll() {
        return null;
    }

    public Employee getEmployee(String id) {
        return null;
    }


    public boolean updateEmployee(Employee employee, String id) {
        return false;
    }
}
