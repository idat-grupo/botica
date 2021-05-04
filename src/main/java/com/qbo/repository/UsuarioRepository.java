package com.qbo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qbo.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	
	@Transactional
	@Modifying
	@Query(value = "{call sp_MantRegistrarUsuario(:apeusuario, :nomusuario, :usuario, :password)}",
			nativeQuery = true)
	void registrarUsuario(@Param("apeusuario") String apeusuario, 
			@Param("nomusuario") String nomusuario,
			@Param("usuario") String usuario,
			@Param("password") String password);
	
	@Transactional
	@Modifying
	@Query(value = "{call sp_MantActualizarUsuario(:idusuario,:apeusuario, :nomusuario, :usuario, :password)}", 
			nativeQuery =  true)
	void actualizarUsuario(@Param("idusuario") String idusuario,
			@Param("apeusuario") String apeusuario, 
			@Param("nomusuario") String nomusuario,
			@Param("usuario") String usuario,
			@Param("password") String password);
	
	//metodo para buscar usuario
	@Transactional
	@Modifying
	@Query(value = "{call sp_MantObtenerUsuario(:username, :password)}", nativeQuery = true)
	public Usuario obtenerUsuario(@Param("username") String usuario, @Param("password") String password);
}
