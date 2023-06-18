package com.carroservice.repositorio.copy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carroservice.entidades.copy.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer>{

	List<Carro> findByUsuario (int usuarioId);
	
}
