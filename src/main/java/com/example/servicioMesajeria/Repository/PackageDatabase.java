package com.example.servicioMesajeria.Repository;

import com.example.servicioMesajeria.Models.Packages;

import java.util.List;

public class PackageDatabase implements metodosDatabase {

    private Packages packages;

    public PackageDatabase(Packages packages) {
        this.packages = packages;
    }

    @Override
    public boolean createElement(Object element) {
        return false;
    }

    @Override
    public boolean deleteElement(String id) {
        return false;
    }

    @Override
    public List<Object> getElementAll() {
        return null;
    }

    @Override
    public Object getElement(String id) {
        return null;
    }

    @Override
    public boolean UpdateElement(Object elemento) {
        return false;
    }


}
