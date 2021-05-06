package com.qbo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qbo.model.Producto;
import com.qbo.model.VentaProducto;

/*public interface ProductoRepository {
	
	List<Producto> listarProductos();
	
	Producto buscarProducto(String codproducto);
	
	List<VentaProducto> agregarProducto(VentaProducto objVentaProd, 
			List<VentaProducto> listVentaProd); 
	

}*/
@Repository
public interface ProductoRepository extends JpaRepository<Producto,String> {
	
}