package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Modalidad;


/*La px no sienpre es integer*/
/*Se puede hacer consultas en el repossitory*/
public interface ModalidadRepository extends JpaRepository<Modalidad, Integer>  {
	
/*	public List<Modalidad> findByNombre(String nombre);*/
	
	
	/*busca en la bd el nombre usa se ingresa en el campo de entrada*/
	public List<Modalidad> findByNombreIgnoreCase(String nombre);

	
	
	
	
	

}
