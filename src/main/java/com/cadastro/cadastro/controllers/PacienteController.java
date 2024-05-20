package com.cadastro.cadastro.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.cadastro.entities.Paciente;
import com.cadastro.cadastro.services.PacienteService;

@RestController
@RequestMapping("v1/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping
	public ResponseEntity<Paciente> criar(@RequestBody Paciente paciente){
		Paciente entidade = pacienteService.create(paciente);
		return ResponseEntity.status(HttpStatus.CREATED).body(entidade);
	}
	
	@GetMapping(value = "/pacientes")
	public ResponseEntity<List<Paciente>> buscarTodos(){
		List<Paciente> lista = pacienteService.buscarTodos();
		return ResponseEntity.status(HttpStatus.FOUND).body(lista);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Paciente>> buscarPorId(@PathVariable Long id){
		Optional<Paciente> opt = pacienteService.buscarPorId(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(opt);
	}

}
