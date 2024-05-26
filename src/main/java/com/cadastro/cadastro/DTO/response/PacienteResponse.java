package com.cadastro.cadastro.DTO.response;

import java.util.List;

import com.cadastro.cadastro.entities.Agenda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class PacienteResponse {

	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private List<Agenda> agenda;
}
