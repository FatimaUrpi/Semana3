package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>{

	
	
	
/*	public List<Modalidad> findByNombre(String nombre);*/
	
	
	/*busca en la bd el nombre usa se ingresa en el campo de entrada*/
	public List<Proveedor> findByNombreIgnoreCase(String nombre);
	public List<Proveedor> findByNombreIgnoreCase(String dni);


}
