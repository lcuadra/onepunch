package com.uam.onepunch.controller;


import com.uam.onepunch.model.Usuario;
import com.uam.onepunch.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class ControllerUsuario {
    @Qualifier("ServiceUsuario")
    @Autowired
    private IServiceUsuario service;


    @GetMapping("/list")
    public List<Usuario> getAll() {
        return service.getListUsuario();
    }

    @PostMapping("/save")
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
        return
                service.saveUsuario(usuario);
    }

    @PostMapping("/{id}")
    public Usuario getUsuario(@PathVariable Long id) {

        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(){};
}   
