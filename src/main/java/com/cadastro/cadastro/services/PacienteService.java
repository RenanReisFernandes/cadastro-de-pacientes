package com.cadastro.cadastro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.cadastro.entities.Paciente;
import com.cadastro.cadastro.repositories.PacienteRepository;

@Service
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	
	public Paciente create(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

}
