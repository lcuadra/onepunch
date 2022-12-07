package com.uam.onepunch.controller;

import com.uam.onepunch.model.Categoria;
import com.uam.onepunch.service.IServiceCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")

public class ControllerCategoria {
    @Qualifier("ServiceCategoria")
    @Autowired
    private IServiceCategoria service;

    @PostMapping("{id}")
    public Categoria getCategoria (@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/save")
    public Categoria saveCategoria(@RequestBody Categoria categoria) {
        return service.saveCategoria(categoria);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategoria(Long id) {
        service.deleteCategoria(id);


    }
}
