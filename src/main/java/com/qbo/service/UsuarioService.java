package com.qbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qbo.model.Usuario;
import com.qbo.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> listarUsuarios(){
		return repository.findAll();
	}
	public void registrarUsuario(Usuario usuario) {
		if(usuario.getIdusuario() == null) {
			repository.registrarUsuario(usuario.getApeusuario(),usuario.getNomusuario(),usuario.getUsername(),usuario.getContra());	
		}else {
			repository.actualizarUsuario(usuario.getIdusuario(),
					usuario.getApeusuario(),
					usuario.getNomusuario(),
					usuario.getUsername(),
					usuario.getContra());
		}
	}
	
	public Usuario obtenerUsuario(String usuario, String password) {
		return repository.obtenerUsuario(usuario, password);
	}
}
