package com.cadastro.cadastro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cadastro.cadastro.entities.Agenda;
import com.cadastro.cadastro.repositories.AgendaRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AgendaService {

	@Autowired
	private AgendaRepository agendaRepository;
	
	public Agenda criar(Agenda agenda) {
		return agendaRepository.save(agenda);
	}
}
