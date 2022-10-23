package com.uam.onepunch.service;

import com.uam.onepunch.model.Categoria;
import com.uam.onepunch.model.Producto;
import com.uam.onepunch.repository.ICategoriaRepository;
import com.uam.onepunch.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class impServiceProducto implements IServiceProducto{

    @Autowired
    private IProductoRepository repoProd;

    @Autowired
    private ICategoriaRepository repoCat;

    @Override
    public List<Producto>  getListProducto(){
        return repoProd.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return repoProd.findById(id).get()  ;
    }

    @Override
    public Producto saveProducto(Producto producto){
        List<Categoria> categorias = producto.getCategorias();
        producto.setCategorias(null);
        Producto p = repoProd.save(producto);
        for (Categoria cat : categorias){
            cat.setIdProducto(p.getId());
        }
        repoCat.saveAll(categorias);
        p.setCategorias(categorias);

        return p;
    }

    @Override
    public void deleteProducto(Long id) {
        repoProd.deleteById(id);
    }

}
