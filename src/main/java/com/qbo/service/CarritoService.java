package com.qbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qbo.model.VentaProducto;
import com.qbo.repository.CarritoRepository;

@Service
public class CarritoService {
	@Autowired
	private CarritoRepository repository2;
	
	public List<VentaProducto> listarCarrito(){
		return repository2.findAll();
		
	}
}
