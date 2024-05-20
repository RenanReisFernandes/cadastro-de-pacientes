package com.cadastro.cadastro.services;

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

}
