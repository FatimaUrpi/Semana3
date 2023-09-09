package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Deporte;


/*Magia de la herencia*/
public interface DeporteRepository extends JpaRepository<Deporte, Integer> {

	
	
	
}
