package com.qbo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.qbo.model.Curso;
import com.qbo.model.Producto;
import com.qbo.model.VentaProducto;
import com.qbo.repository.CarritoRepository;
//import com.qbo.repository.CursoRepository;
import com.qbo.repository.ProductoRepository;

/*@Service
public class ProductoService implements ProductoRepository {

	@Override
	public List<Producto> listarProductos() {
		List<Producto> lstproducto = new ArrayList<>();
		lstproducto.add(new Producto("P0001", "Ibuprofeno", "Sputnik", "Antiinflamatorio", 2.00));
		lstproducto.add(new Producto("P0002", "Herbilar", "Sputnik", "Antiinflamatorio", 15.60));
		lstproducto.add(new Producto("P0003", "Paracetamol", "Sputnik", "Antiinflamatorio", 7.80));
		lstproducto.add(new Producto("P0004", "Antalgina", "Sputnik", "Antiinflamatorio", 22.00));
		lstproducto.add(new Producto("P0005", "Diazepam", "Sputnik", "Antiinflamatorio", 15.00));

		return lstproducto;
	}



	@Override
	public List<VentaProducto> agregarProducto(VentaProducto objVentaProd, 
			List<VentaProducto> listVentaProd) {
		Boolean nuevoActualizado = false;
		Boolean agregarNuevo = false;
		List<VentaProducto> nuevaListVentaProducto = new ArrayList<VentaProducto>();
		if(listVentaProd.size() == 0) {
			nuevaListVentaProducto.add(objVentaProd);
		}else {
			for(VentaProducto objVenta : listVentaProd) {
				if(objVenta.getIdCarritoItem().equals(objVentaProd.getIdCarritoItem())) {
					nuevaListVentaProducto.add(
							new VentaProducto(objVentaProd.getIdCarritoItem(),
									objVentaProd.getNomProducto(),
									objVenta.getCantidadTotal() + objVentaProd.getCantidadTotal(), 
									objVenta.getPrecioTotal() + objVentaProd.getPrecioTotal())
							);
					nuevoActualizado = true; agregarNuevo = false;
				}else {
					nuevaListVentaProducto.add(objVenta);
					if(nuevoActualizado) {
						agregarNuevo = false;
					}else
						agregarNuevo = true;
				}
			}
			if(agregarNuevo) {
				nuevaListVentaProducto.add(objVentaProd);
			}
			
		}
		return nuevaListVentaProducto;
	}



	@Override
	public Producto buscarProducto(String codproducto) {
		List<Producto> lstproducto = listarProductos();
		Producto productoEncontrado = null;
		for(Producto objProducto : lstproducto) {
			if(objProducto.getIdProducto().equals(codproducto)) {
				productoEncontrado = objProducto; 
				break;
			}
		}
		return productoEncontrado;
	}

}*/

@Service
public class ProductoService{

	@Autowired
	private ProductoRepository repository;
	
	
	public List<Producto> listarProductos(){
		return repository.findAll();
		
	}
	
	
	
}
