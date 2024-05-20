package com.cadastro.cadastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cadastro.cadastro.entities.Paciente;
import com.cadastro.cadastro.repositories.PacienteRepository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	
	public Paciente create(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public List<Paciente> buscarTodos(){
		return pacienteRepository.findAll();
	}
	
	public Optional<Paciente> buscarPorId(Long id){
		Optional<Paciente> opt = pacienteRepository.findById(id);
		return opt;
	}

}
