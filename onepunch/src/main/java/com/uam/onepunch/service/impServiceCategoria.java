package com.uam.onepunch.service;


import com.uam.onepunch.model.Categoria;
import com.uam.onepunch.repository.ICategoriaRepository;
import com.uam.onepunch.repository.IOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ServiceCategoria")
public class impServiceCategoria implements IServiceCategoria {

    @Autowired
    private ICategoriaRepository repoCat;

    @Override
    public List<Categoria> getListCategoria(){
        return repoCat.findAll();
    }

    @Override
    public Categoria findById(Long idCategoria) {
        return repoCat.findById(idCategoria).get()  ;
    }

    @Override
    public Categoria saveCategoria(Categoria categoria){
        return repoCat.save(categoria);
    }

    @Override
    public void deleteCategoria(Long idCategoria) {
        repoCat.deleteById(idCategoria);
    }
}
