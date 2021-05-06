package pruebas;

/*
import java.util.ArrayList;
import java.util.List;

import com.qbo.model.Carrito;

import com.qbo.repository.ProductoRepository;

public class ProductoService implements ProductoRepository  {
	
	@Override
	public List<Carrito> agregarProducto(Carrito objVentaProd, 
			List<Carrito> listVentaProd) {
		Boolean nuevoActualizado = false;
		Boolean agregarNuevo = false;
		List<Carrito> nuevaListCarrito = new ArrayList<Carrito>();
		if(listVentaProd.size() == 0) {
			nuevaListCarrito.add(objVentaProd);
		}else {
			for(Carrito objVenta : listVentaProd) {
				if(objVenta.getCodProducto().equals(objVentaProd.getCodProducto())) {
					nuevaListCarrito.add(
							new Carrito(objVentaProd.getCodProducto(),
									objVentaProd.getNomProducto(),
									objVenta.getCantidadTotal() + objVentaProd.getCantidadTotal(), 
									objVenta.getPrecioTotal() + objVentaProd.getPrecioTotal())
							);
					nuevoActualizado = true; agregarNuevo = false;
				}else {
					nuevaListCarrito.add(objVenta);
					if(nuevoActualizado) {
						agregarNuevo = false;
					}else
						agregarNuevo = true;
				}
			}
			if(agregarNuevo) {
				nuevaListCarrito.add(objVentaProd);
			}
			
		}
		return nuevaListCarrito;
		
	}
}*/
