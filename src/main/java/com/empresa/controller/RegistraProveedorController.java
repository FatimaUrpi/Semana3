package com.empresa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entity.Modalidad;
import com.empresa.entity.Proveedor;
import com.empresa.service.ProveedorService;

@Controller

public class RegistraProveedorController {

	
	@Autowired
	private ProveedorService proveedorService;
	
	@GetMapping(value = "/verRegistraProveedor" )
	public String verProveedor() {return "registraProveedor";}

	
	@PostMapping("/registraProveedor")
	@ResponseBody
	public Map<String, String> registra(Proveedor obj) {
		HashMap<String, String> map = new HashMap<String, String>();
	
		Proveedor objSalida = proveedorService.insertaProveedor(obj);
		if (objSalida == null) {
			map.put("MENSAJE", "Error en el registro");
		} else {
			map.put("MENSAJE", "Registro exitoso");
		}
		return map;
	}
	
	
	@GetMapping("/buscaPorNombreProveedor")
	@ResponseBody
	public String validaNombre(String nombre) {
		List<Proveedor> lstProveedor = proveedorService.listaPorNombre(nombre);
		if (CollectionUtils.isEmpty(lstProveedor)) {
			return "{\"valid\" : true }";
		} else {
			return "{\"valid\" : false }";
		}
	}
	
	
	
	@GetMapping("/buscaDniProveedor")
	@ResponseBody
	public String validaDni(String dni) {
		List<Proveedor> lstDni = proveedorService.listaPorDni(dni);
		if (CollectionUtils.isEmpty(lstDni)) {
			return "{\"valid\" : true }";
		} else {
			return "{\"valid\" : false }";
		}
	}
	
}
