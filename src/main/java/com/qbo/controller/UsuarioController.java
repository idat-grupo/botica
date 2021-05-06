package com.qbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.qbo.model.Curso;
import com.qbo.model.Usuario;
import com.qbo.model.response.ResultadoResponse;
import com.qbo.service.UsuarioService;

@Controller
@RequestMapping("/Usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping
	@ResponseBody
	public Usuario obtenerUsuario(String username, String password) {
		return service.obtenerUsuario(username, password);
	}
	
	@PostMapping("/registrarUsuario")
	@ResponseBody
	public ResultadoResponse registrarCurso(@RequestBody Usuario objUsuario) {
		String mensaje = "Usuario registrado correctamente";
		Boolean respuesta = true;
		try {
			service.registrarUsuario(objUsuario);
		}catch(Exception ex) {
			mensaje = "Alumno no registrado.";
			respuesta = false;
		}
		return new ResultadoResponse(respuesta, mensaje);
	}
	@GetMapping("/listarUsuarios")
	@ResponseBody
	public List<Usuario> listarUsuarios(){
		return service.listarUsuarios();
	}
}
