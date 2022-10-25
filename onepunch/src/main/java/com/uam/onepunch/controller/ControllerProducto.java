package com.uam.onepunch.controller;

import com.uam.onepunch.model.Producto;
import com.uam.onepunch.service.IServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public class ControllerProducto {
    @Qualifier("ServiceProducto")
    @Autowired
    private IServiceProducto service;

    @GetMapping("/list")
    public List<Producto> getAll(){
        return service.getListProducto();
    }

    @PostMapping("/save")
    public Producto saveProducto (@RequestPart String productDto, @RequestPart MultipartFile image) throws IOException {

        return service.saveProducto(productDto, image);
    }

    @PostMapping("/{id}")
    public Producto getProducto(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(){
    }
}
