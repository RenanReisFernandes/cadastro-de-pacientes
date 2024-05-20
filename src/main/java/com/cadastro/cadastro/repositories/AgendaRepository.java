package com.cadastro.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.cadastro.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
