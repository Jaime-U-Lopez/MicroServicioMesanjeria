package com.example.servicioMesajeria.Controllers;

import com.example.servicioMesajeria.Services.ServiceEmpleoyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ApiMensajeria/v1/")
public class ControllerEmpleoyer {

    private ServiceEmpleoyer serviceEmpleoyer;


    @Autowired
    public ControllerEmpleoyer(ServiceEmpleoyer serviceEmpleoyer) {
        this.serviceEmpleoyer = serviceEmpleoyer;
    }





}
