package com.cadastro.cadastro.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @EqualsAndHashCode
@AllArgsConstructor @NoArgsConstructor
@Table(name="paciente-tb")
public class Paciente {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "sobrenome")
	private String sobrenome;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "email")
	private String email;
	@OneToMany(mappedBy = "pacientes")
	private List<Agenda> agenda;

}
