package com.cadastro.cadastro.entities;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "agenda")
@Getter @Setter @AllArgsConstructor
@Entity @NoArgsConstructor @EqualsAndHashCode
public class Agenda {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "data_hora")
	private Instant dataHora;
	@Column(name = "data_criacao")
	private Instant dataCriacao;
	@Column(name = "descricao")
	private String descricao;
	@ManyToOne
	@JoinColumn(name="paciente_agenda")
	private Paciente pacientes;

}
