package com.cadastro.cadastro.DTO.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class PacienteRequest {
	
	@NotBlank(message = "Nome não pode ser vazio")
	private String nome;
	@NotBlank(message = "Sobrenome não pode ser vazio")
	private String sobrenome;
	@NotBlank(message = "CPF não pode ser vazio")
	private String cpf;
	@NotBlank(message = "Email não pode ser vazio")
	private String email;

}
