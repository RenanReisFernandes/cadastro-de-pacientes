package com.cadastro.cadastro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.cadastro.entities.Agenda;
import com.cadastro.cadastro.services.AgendaService;


@RestController
@RequestMapping( "v1/agenda")
public class AgendaController {
	
	@Autowired
	private AgendaService agendaService;
	
	@PostMapping
	public ResponseEntity<Agenda> criar(@RequestBody Agenda agenda){
		Agenda entidade = agendaService.criar(agenda);
		return ResponseEntity.status(HttpStatus.CREATED).body(entidade);
	}

}
