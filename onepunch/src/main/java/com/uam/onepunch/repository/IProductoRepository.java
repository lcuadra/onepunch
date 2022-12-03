package com.uam.onepunch.repository;

import com.uam.onepunch.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {
    @Query("select e from Producto e where e.display = true and e.cantidad > 0")
    List<Producto> getProductoDisplay();
}
