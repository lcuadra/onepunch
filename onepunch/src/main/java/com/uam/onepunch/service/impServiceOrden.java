package com.uam.onepunch.service;

import com.uam.onepunch.model.Orden;
import com.uam.onepunch.repository.IOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ServiceOrden")
public class impServiceOrden implements IServiceOrden {

    @Autowired
    private IOrdenRepository repoOrd;

    @Override
    public List<Orden> getListOrden(){
        return repoOrd.findAll();
    }

    @Override
        public Orden findById(Long idOrden) {
        return repoOrd.findById(idOrden).get()  ;
    }

    @Override
    public Orden saveOrden(Orden orden){
        return repoOrd.save(orden);
    }

    @Override
    public void deleteOrden(Long idOrden) {
        repoOrd.deleteById(idOrden);
    }

}
