package com.uam.onepunch.service;

import com.uam.onepunch.model.Persona;
import com.uam.onepunch.model.TipoCuenta;
import com.uam.onepunch.model.Usuario;
import com.uam.onepunch.repository.IPersonaRepository;
import com.uam.onepunch.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

        Usuario u = new Usuario();
        u.setNombreUsuario((usuario.getNombreUsuario()));
        u.setPwUsuario(usuario.getPwUsuario());

        return repo.save(u);


    }
}
