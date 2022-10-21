package com.uam.onepunch.repository;

import com.uam.onepunch.model.TipoCuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoCuenta extends JpaRepository<TipoCuenta, Long> {
}
