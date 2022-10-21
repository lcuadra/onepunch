package com.uam.onepunch.service;
import com.uam.onepunch.model.Usuario;

import java.util.List;

public interface IServiceUsuario {

    public Usuario saveUsuario(Usuario usuario);

    List<Usuario> getListUsuario();

    Usuario findById(Long id);

    void deleteUsuario(Long id);
}
