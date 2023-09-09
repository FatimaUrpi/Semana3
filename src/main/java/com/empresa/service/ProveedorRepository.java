package com.empresa.service;

import java.util.List;

import com.empresa.entity.Proveedor;

public interface ProveedorRepository {

	

	public abstract Proveedor insertaProveedor(Proveedor obj);

	
	/*Importaciones e la busqueda, metodo*/
	public abstract List<Proveedor> listaPorNombre(String nombre);
	public abstract List<Proveedor> listaPorDni(String dni);


}
