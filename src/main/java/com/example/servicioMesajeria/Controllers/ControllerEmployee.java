package com.example.servicioMesajeria.Controllers;

import com.example.servicioMesajeria.Models.Employee;
import com.example.servicioMesajeria.Services.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-mensajeria/v1/")
public class ControllerEmployee {

    private ServiceEmployee serviceEmployee;


    @Autowired
    public ControllerEmployee(ServiceEmployee serviceEmployee) {
        this.serviceEmployee = serviceEmployee;
    }


    @PostMapping("employee")
    public Boolean createEmployee(@RequestBody Employee employee) {
        return this.serviceEmployee.createEmployee(employee);
    }

    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return this.serviceEmployee.getEmployee(id);
    }


    @GetMapping("employee-all")
    public List<Employee> getEmployeeAll() {
        return this.serviceEmployee.getEmployeeAll();
    }


    @DeleteMapping("employee/{id}")
    public Boolean deleteEmployee(@PathVariable String id) {
        return this.serviceEmployee.deleteEmployee(id);
    }

    @PutMapping("employee/{id}")
    public boolean updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
        return this.serviceEmployee.updateEmployee(employee, id);
    }


}
