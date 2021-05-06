package com.qbo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qbo.model.Producto;
import com.qbo.model.VentaProducto;
import com.qbo.model.response.ResultadoResponse;
import com.qbo.service.CarritoService;
import com.qbo.service.ProductoService;

@Controller
@RequestMapping("/Producto")
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@Autowired
	private CarritoService service2;

	/*
	@GetMapping("/formVentaProducto")
	public String formVentaProducto(Model model) {
		model.addAttribute("ventaproductoform", new VentaProducto());
		model.addAttribute("lstproductos", productoService.listarProductos());
		model.addAttribute("visualizar", false);
		return "Producto/formventaproducto";
	}
	

	@PostMapping("/registrarProducto")
	public String registrarProducto(
			@ModelAttribute("ventaproductoform") VentaProducto ventaProductoForm,
			final HttpServletRequest request,
			Model model
			) {
		List<VentaProducto> lstVentaProducto = (List<VentaProducto>)request.getSession()
				.getAttribute("lstproducto"); 
		if(CollectionUtils.isEmpty(lstVentaProducto)) {
			lstVentaProducto = new ArrayList<VentaProducto>();
		}
		Producto objproducto = productoService.buscarProducto(ventaProductoForm.getIdCarritoItem());
		Double preciototal = ventaProductoForm.getCantidadTotal() 
				* objproducto.getPrecioProducto();
		String respuesta = "El precio unitario del producto: "+ 
				objproducto.getPrecioProducto().toString() +
				" el valor total de venta es: " + preciototal.toString();
		VentaProducto objventaproducto = new VentaProducto(
				objproducto.getIdProducto(),
				objproducto.getNomProducto(),
				ventaProductoForm.getCantidadTotal(),
				preciototal);
		List<VentaProducto> nuevaListaVentaProducto = productoService
				.agregarProducto(objventaproducto, lstVentaProducto);
		request.getSession().setAttribute("lstproducto", nuevaListaVentaProducto);
		model.addAttribute("visualizar", true);
		model.addAttribute("respuesta", respuesta);
		model.addAttribute("lstproductos", productoService.listarProductos());
		return "Producto/formventaproducto";
	}
	
	@GetMapping("/listarVentaProductos")
	public String listarVentaProductos(Model model, final HttpSession session) {
		List<VentaProducto> lstventaproducto = (List<VentaProducto>)session
				.getAttribute("lstproducto");
		if(CollectionUtils.isEmpty(lstventaproducto)) {
			lstventaproducto = new ArrayList<VentaProducto>();
		}
		model.addAttribute("lstventaproducto", lstventaproducto);
		return "Producto/listarventaproductos";
	}*/
	
	
	@GetMapping("/listarProductos")
	public String listarProductos(Model model) {

		
		model.addAttribute("listarproducto", service.listarProductos());
		return "Producto/fmrListarProducto";
	}
	@GetMapping("/listarCarrito")
	public String listarCarrito(Model model) {

		
		model.addAttribute("listarcarrito", service2.listarCarrito());
		return "Producto/fmrListarCarrito";
	}
	/*
	@PostMapping("/registrarCurso")
	@ResponseBody
	public ResultadoResponse registrarCurso(@RequestBody Producto objCarrito) {
		String mensaje = "Agregado al carrito correctamente";
		Boolean respuesta = true;
		
		try {
			service.registrarCurso(objCurso);
		}catch(Exception ex) {
			mensaje = "Curso no registrado";
			respuesta = false;
		}
		return new ResultadoResponse(respuesta, mensaje);
	}*/
	
}
