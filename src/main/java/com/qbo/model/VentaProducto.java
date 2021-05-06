package com.qbo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "carritoitem")
public class VentaProducto {
	
	@Id
	private String idCarritoItem;
	
	@Column(name="NombreProducto")
	private String nomProducto;
	
	@Column(name="Cantidad")
	private Integer cantidadTotal;
	
	@Column(name="Subtotal")
	private Double precioTotal;
		
	public String getIdCarritoItem() {
		return idCarritoItem;
	}

	public void setIdCarritoItem(String idCarritoItem) {
		this.idCarritoItem = idCarritoItem;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public Integer getCantidadTotal() {
		return cantidadTotal;
	}

	public void setCantidadTotal(Integer cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}



	public VentaProducto(String idCarritoItem, String nomProducto, Integer cantidadTotal, Double precioTotal) {
		super();
		this.idCarritoItem = idCarritoItem;
		this.nomProducto = nomProducto;
		this.cantidadTotal = cantidadTotal;
		this.precioTotal = precioTotal;
	}

	public VentaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
