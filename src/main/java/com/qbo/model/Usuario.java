package com.qbo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	private String idusuario;
	
	@Column(name = "apeusuario")
	private String apeusuario;
	
	@Column(name = "nomusuario")
	private String nomusuario;
	
	@Column(name="username")
	private String username;
	
	@Column(name="contra")
	private String contra;

	public String getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public String getApeusuario() {
		return apeusuario;
	}

	public void setApeusuario(String apeusuario) {
		this.apeusuario = apeusuario;
	}

	public String getNomusuario() {
		return nomusuario;
	}

	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public Usuario(String idusuario, String apeusuario, String nomusuario, String username, String contra) {
		super();
		this.idusuario = idusuario;
		this.apeusuario = apeusuario;
		this.nomusuario = nomusuario;
		this.username = username;
		this.contra = contra;
	}

	public Usuario() {
		super();
	}
	
	
}
