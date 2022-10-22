package com.uam.onepunch.controller;

import com.uam.onepunch.model.Persona;
import com.uam.onepunch.service.IServicePersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/* hola mundo */
@RestController
@RequestMapping("/persona")
@CrossOrigin
public class ControllerPersona {
    @Qualifier("ServicePersona")
    @Autowired
    private IServicePersona service;

    @GetMapping("/list")
    public List<Persona> getAll(){
        return service.getListPersona();
    }

    @PostMapping("/save")
    public Persona savePersona(@RequestBody Persona persona){
        return service.savePersona(persona);
    }

    @PostMapping("/{id}")
    public Persona getPersona(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePersona(){
    }
}
