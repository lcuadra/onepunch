package com.uam.onepunch.service;

import com.uam.onepunch.model.Usuario;
import com.uam.onepunch.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("ServiceUsuario")
public class impServiceUsuario  implements  IServiceUsuario {
    @Autowired
    private IUsuarioRepository repo;

    @Override
    public List<Usuario> getListUsuario() {
        return repo.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public void deleteUsuario(Long id) {

    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        Usuario o = new Usuario();
        o.setEmail(usuario.getEmail());
        o.setPw(usuario.getPw());
        o.setNombres(usuario.getNombres());
        o.setApellidos(usuario.getApellidos());
        o.setTelefono(usuario.getTelefono());

        return repo.save(o);
    }


    }

