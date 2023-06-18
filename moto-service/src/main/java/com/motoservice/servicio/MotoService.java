package com.motoservice.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoservice.entidades.Moto;
import com.motoservice.repositorio.MotoRepository;

@Service
public class MotoService {

	@Autowired
	private MotoRepository motoRepository;
	
	public List<Moto> getAll(){
		return motoRepository.findAll();
	}
	
	public Moto getMotoById(int id) {
		return motoRepository.findById(id).orElse(null);
	}
	
	public Moto save(Moto Moto) {
		Moto nuevoMoto= motoRepository.save(Moto);
		return nuevoMoto;
	}
	
	public List<Moto> byUsuarioId(int usuarioId){
		return motoRepository.findByUsuarioId(usuarioId);
	}
}
