package com.uam.onepunch.service;

import com.uam.onepunch.model.Producto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface IServiceProducto {
    public List<Producto> getListProducto();

    public Producto findById(Long id);

    public Producto saveProducto(String ProductDto, MultipartFile image) throws IOException;
    void deleteProducto(Long id) throws IOException;
}


