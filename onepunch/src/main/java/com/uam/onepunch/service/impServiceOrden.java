package com.uam.onepunch.service;

import com.uam.onepunch.model.Orden;
import com.uam.onepunch.repository.IOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class impServiceOrden implements IServiceOrden {
    @Autowired
    private IOrdenRepository repoOrd;

    @Override
    public List<Orden> getListOrden(){
        return repoOrd.findAll();
    }

    @Override
        public Orden findById(Long idorden) {
        return repoOrd.findById(idorden).get()  ;
    }

    @Override
    public Orden saveOrden(Orden orden){
        return repoOrd.save(orden);
    }

    @Override
    public void deleteOrden(Long idorden) {
        repoOrd.deleteById(idorden);
    }

}
