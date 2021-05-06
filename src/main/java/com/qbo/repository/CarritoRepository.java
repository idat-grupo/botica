package com.qbo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qbo.model.VentaProducto;

@Repository
public interface CarritoRepository extends JpaRepository<VentaProducto,String> {

	
}
