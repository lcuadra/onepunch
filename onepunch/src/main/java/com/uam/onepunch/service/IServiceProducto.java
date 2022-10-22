package com.uam.onepunch.service;

import com.uam.onepunch.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceProducto {
    public List<Producto> getListProducto();

    public Producto findById(Long id);

    public Producto saveProduct(Producto product);

    public void deleteProduct(Long id);
}
