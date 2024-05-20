package com.cadastro.cadastro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.cadastro.entities.Paciente;
import com.cadastro.cadastro.services.PacienteService;

@RestController
@RequestMapping(name = "v1/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping
	public ResponseEntity<Paciente> criar(Paciente paciente){
		Paciente entidade = pacienteService.create(paciente);
		return ResponseEntity.ok().body(entidade);
	}

}
