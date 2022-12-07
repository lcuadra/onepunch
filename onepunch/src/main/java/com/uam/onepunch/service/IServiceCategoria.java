package com.uam.onepunch.service;

import com.uam.onepunch.model.Categoria;

import java.util.List;

public interface IServiceCategoria {

    public List<Categoria> getListCategoria();

    public Categoria findById(Long idCategoria);

    public Categoria saveCategoria(Categoria categoria);
    public void deleteCategoria(Long id);
}
