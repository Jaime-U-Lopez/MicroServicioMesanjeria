package com.example.servicioMesajeria.Services;

import com.example.servicioMesajeria.Models.Packages;
import com.example.servicioMesajeria.Repository.PackageDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ServicePackage {

    private PackageDatabase packageDatabase;
    private Package packages;


    @Autowired
    public ServicePackage(PackageDatabase packageDatabase, Package packages ) {
        this.packageDatabase = packageDatabase;
        this.packages=packages;
    }

    public boolean createPackage(Packages packages) {
        return false;
    }

    public boolean deletePackage(String id) {
        return false;
    }

    public List<Packages> getPackageAll() {
        return null;
    }

    public Packages getPackage(String id) {
        return null;
    }

    public boolean updatePackage(Packages packages, String id) {
        return false;
    }
}
