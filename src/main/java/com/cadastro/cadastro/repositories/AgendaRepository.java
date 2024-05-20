package com.cadastro.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cadastro.cadastro.entities.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
