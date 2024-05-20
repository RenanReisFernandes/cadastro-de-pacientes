package com.cadastro.cadastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cadastro.cadastro.entities.Paciente;
import com.cadastro.cadastro.repositories.PacienteRepository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	
	public Paciente create(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public List<Paciente> buscarTodos(){
		return pacienteRepository.findAll();
	}
	
	public Optional<Paciente> buscarPorId(Long id){
		Optional<Paciente> opt = pacienteRepository.findById(id);
		return opt;
	}
	
	public void deletar(Long id) {
		pacienteRepository.deleteById(id);
	}
	
	public Paciente atualizar(Long id, Paciente pacienteAtualizado) {
		Optional<Paciente> optionalPaciente = pacienteRepository.findById(id);
		if (optionalPaciente.isPresent()) {
			Paciente pacienteExistente = optionalPaciente.get();
			
			// Atualizar os campos do pacienteExistente com os valores do pacienteAtualizado
			pacienteExistente.setNome(pacienteAtualizado.getNome());
			pacienteExistente.setSobrenome(pacienteAtualizado.getSobrenome());
			pacienteExistente.setCpf(pacienteAtualizado.getCpf());
			pacienteExistente.setEmail(pacienteAtualizado.getEmail());
			pacienteExistente.setAgenda(pacienteAtualizado.getAgenda());
			
			// Salvar as alterações
			return pacienteRepository.save(pacienteExistente);
		} else {
			throw new RuntimeException("Paciente não encontrado com o id " + id);
		}
	}	

}
