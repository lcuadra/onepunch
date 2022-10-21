package com.uam.onepunch.service;

import com.uam.onepunch.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServicePersona {

    public Persona savePersona(Persona persona);

    List<Persona> getListPersona();

    Persona findById(Long id);

    void deletePersona(Long id);
}

