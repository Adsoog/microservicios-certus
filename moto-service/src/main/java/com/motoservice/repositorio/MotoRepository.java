package com.motoservice.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motoservice.entidades.Moto;

public interface MotoRepository extends JpaRepository<Moto, Integer>{

	List<Moto> findByUsuarioId (int usuarioId);
	
}
