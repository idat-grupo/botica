package pruebas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carritoitem")
public class Carrito1 {
	


	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String idcarrito;
	
	@Column(name = "NombreProducto")
	private String nomprod;
	
	@Column(name = "Cantidad")
	private Integer cantidad;
	
	@Column(name = "Subtotal")
	private Integer subtotal;
	
	public String getIdcarrito() {
		return idcarrito;
	}

	public void setIdcarrito(String idcarrito) {
		this.idcarrito = idcarrito;
	}

	public String getNomprod() {
		return nomprod;
	}

	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Integer subtotal) {
		this.subtotal = subtotal;
	}

	public Carrito1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrito1(String idcarrito, String nomprod, Integer cantidad, Integer subtotal) {
		super();
		this.idcarrito = idcarrito;
		this.nomprod = nomprod;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}	
	

}