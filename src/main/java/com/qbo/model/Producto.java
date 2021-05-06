package com.qbo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "producto")
public class Producto {
	
	@Id
	private String idProducto;
	
	@Column(name="Nombre")
	private String nomProducto;
	
	@Column(name="Marca")
	private String tmarca;
	
	@Column(name="Categoria")
	private String tcategoria;
	
	@Column(name="Precio")
	private Double precioProducto;
	
	public String getIdProducto() {
		return idProducto;
	}



	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}



	public String getNomProducto() {
		return nomProducto;
	}



	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}



	public String getTmarca() {
		return tmarca;
	}



	public void setTmarca(String tmarca) {
		this.tmarca = tmarca;
	}



	public String getTcategoria() {
		return tcategoria;
	}



	public void setTcategoria(String tcategoria) {
		this.tcategoria = tcategoria;
	}



	public Double getPrecioProducto() {
		return precioProducto;
	}



	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}



	public Producto(String idProducto, String nomProducto, String tmarca, String tcategoria, Double precioProducto) {
		super();
		this.idProducto = idProducto;
		this.nomProducto = nomProducto;
		this.tmarca = tmarca;
		this.tcategoria = tcategoria;
		this.precioProducto = precioProducto;
	}



	public Producto() {
		
	}

	
	
}
