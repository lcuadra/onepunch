package com.uam.onepunch.repository;

import com.uam.onepunch.model.Orden;
import com.uam.onepunch.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Long> {

}
