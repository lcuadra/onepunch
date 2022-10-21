package com.uam.onepunch.service;

import com.uam.onepunch.model.Persona;
import com.uam.onepunch.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("ServicePersona")
public class impServicePersona implements IServicePersona {
    @Autowired
    private IPersonaRepository repo;
    @Override
    public List<Persona> getListPersona() {
        return repo.findAll();
    }
    @Override
    public Persona findById(Long id) {
        return repo.findById(id).get();
    }


    @Override
    public Persona savePersona(Persona persona) {
        return repo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        repo.deleteById(id);
    }
}
