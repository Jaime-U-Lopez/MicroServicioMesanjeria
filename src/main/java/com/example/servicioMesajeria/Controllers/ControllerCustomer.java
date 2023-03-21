package com.example.servicioMesajeria.Controllers;


import com.example.servicioMesajeria.Models.Customer;
import com.example.servicioMesajeria.Services.ServicerCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ApiMensajeria/v1/")
public class ControllerCustomer {



    private ServicerCustomer servicerCustomer;

    @Autowired
    public ControllerCustomer(ServicerCustomer servicerCustomer){
        this.servicerCustomer=servicerCustomer;

    }





    @PostMapping("createCustomer")
    public void createCustomer(@RequestBody Customer customer) {
        System.out.println("customer = " + customer);
    }

    @GetMapping("getCustomer/{id}")
    public void getCustomer(@PathVariable String id) {
        System.out.println("id = " + id);
    }


    @GetMapping("getCustomers")
    public void getCustomers() {
        System.out.println("getCustomers = ");
    }


    @DeleteMapping("deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable String id) {
        System.out.println(id);

    }

    @PutMapping("updateCustomer/{id}")
    public void updateCustomer(@RequestBody String body , @PathVariable String id ){
        System.out.println(" update  " );
}

}
