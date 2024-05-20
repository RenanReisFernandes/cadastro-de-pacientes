package com.cadastro.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.cadastro.entities.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
