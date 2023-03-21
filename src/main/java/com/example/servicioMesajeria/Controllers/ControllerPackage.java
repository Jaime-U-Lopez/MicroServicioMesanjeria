package com.example.servicioMesajeria.Controllers;


import com.example.servicioMesajeria.Services.ServicePackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ApiMensajeria/v1/")
public class ControllerPackage {


private ServicePackage servicePackage;

    @Autowired
    public ControllerPackage(ServicePackage servicePackage) {
        this.servicePackage = servicePackage;
    }




}
