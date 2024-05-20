package com.cadastro.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.cadastro.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
