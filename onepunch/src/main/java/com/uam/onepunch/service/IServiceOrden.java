package com.uam.onepunch.service;

import com.uam.onepunch.model.Orden;
import com.uam.onepunch.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IServiceOrden {
    public List<Orden> getListOrden();

    public Orden findById(Long idOrden);

    public Orden saveOrden(Orden orden);

    public void deleteOrden(Long id);
}
