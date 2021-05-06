package pruebas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto1 {
	@Column(name = "IdProducto")
	private String idprod;
	
	@Column(name = "Nombre")
	private String nom;
	
	@Column(name = "Marca")
	private String mar;
	
	@Column(name = "Categoria")
	private String cat;
	
	@Column(name = "Precio")
	private Double preci;

	public String getIdprod() {
		return idprod;
	}

	public void setIdprod(String idprod) {
		this.idprod = idprod;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMar() {
		return mar;
	}

	public void setMar(String mar) {
		this.mar = mar;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public Double getPreci() {
		return preci;
	}

	public void setPreci(Double preci) {
		this.preci = preci;
	}

	public Producto1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto1(String idprod, String nom, String mar, String cat, Double preci) {
		super();
		this.idprod = idprod;
		this.nom = nom;
		this.mar = mar;
		this.cat = cat;
		this.preci = preci;
	}
	
	
	
}
