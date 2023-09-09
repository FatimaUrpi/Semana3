package com.empresa.service;

import java.util.List;

import com.empresa.entity.Modalidad;

public interface ModalidadService {


	public abstract Modalidad insertaModalidad(Modalidad obj);

	
	/*Importaciones e la busqueda, metodo*/
	public abstract List<Modalidad> listaPorNombre(String nombre);


}
