package com.uam.onepunch.service;

import com.uam.onepunch.model.Producto;
import com.uam.onepunch.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class impServiceProducto implements IServiceProducto{

    @Autowired
    private IProductoRepository repoProd;

/* AÑADIR CONEXCION CON OTRA TABLA AQUI*/

    @Override
    public List<Producto> listAll(){
        return repoProd.findAll();
    }


    @Override
    public Producto saveProducto(Producto producto){
        return repoProd.save(producto);
    }

}
