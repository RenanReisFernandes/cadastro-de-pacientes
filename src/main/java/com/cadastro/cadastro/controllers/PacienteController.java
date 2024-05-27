package com.cadastro.cadastro.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.cadastro.DTO.request.PacienteRequest;
import com.cadastro.cadastro.DTO.response.PacienteResponse;
import com.cadastro.cadastro.entities.Paciente;
import com.cadastro.cadastro.mapperconfig.PacienteMapper;
import com.cadastro.cadastro.services.PacienteService;

@RestController
@RequestMapping("v1/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping
	public ResponseEntity<PacienteResponse> criar(@RequestBody PacienteRequest pacienteRequest){
		
		Paciente paciente = PacienteMapper.toPaciente(pacienteRequest);
		Paciente pacienteSalvo = pacienteService.create(paciente);
		PacienteResponse pacienteResponse = PacienteMapper.toPacienteResponse(pacienteSalvo);
		return ResponseEntity.status(HttpStatus.CREATED).body(pacienteResponse);
	}
	
	@GetMapping(value = "/pacientes")
	public ResponseEntity<List<PacienteResponse>> buscarTodos(){
		List<Paciente> pacientes = pacienteService.buscarTodos();
		List<PacienteResponse> pacienteResponseList = PacienteMapper.toPacienteResponseList(pacientes);
		return ResponseEntity.status(HttpStatus.FOUND).body(pacienteResponseList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Paciente>> buscarPorId(@PathVariable Long id){
		Optional<Paciente> opt = pacienteService.buscarPorId(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(opt);
	}
	
	@DeleteMapping("/{id}")
	public void deletaPorId(@PathVariable Long id) {
		pacienteService.deletar(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Paciente> atualizar(@PathVariable Long id, @RequestBody Paciente pacienteAtualizado) {
		try {
			Paciente paciente = pacienteService.atualizar(id, pacienteAtualizado);
			return ResponseEntity.status(HttpStatus.OK).body(paciente);
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

}
