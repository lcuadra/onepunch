package com.uam.onepunch.controller;

import com.uam.onepunch.model.Orden;
import com.uam.onepunch.service.IServiceOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/orden")
    @CrossOrigin("*")
    public class ControllerOrden {
        @Qualifier("ServiceOrden")
        @Autowired
        private IServiceOrden service;

        @PostMapping("{id}")
        public Orden getOrden(@PathVariable Long id){
            return service.findById(id);
        }

        @PostMapping("/save")
        public Orden saveOrden(@RequestBody Orden orden){
            return service.saveOrden(orden);
        }


        @GetMapping({"/{id}"})
        public Orden getPedido(@PathVariable Long id){
            return service.findById(id);
        }

        @DeleteMapping("/delete/{id}")
        public void deleteOrden(Long id){
            service.deleteOrden(id);


        }
    }

