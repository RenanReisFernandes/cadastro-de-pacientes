package com.cadastro.cadastro.mapperconfig;

import java.util.ArrayList;
import java.util.List;

import com.cadastro.cadastro.DTO.request.PacienteRequest;
import com.cadastro.cadastro.DTO.response.PacienteResponse;
import com.cadastro.cadastro.entities.Paciente;

public class PacienteMapper {
	
	public static Paciente toPaciente(PacienteRequest pacienteRequest) {
		Paciente paciente = new Paciente();
		paciente.setNome(pacienteRequest.getNome());
		paciente.setSobrenome(pacienteRequest.getSobrenome());
		paciente.setCpf(pacienteRequest.getEmail());
		paciente.setEmail(pacienteRequest.getEmail());
		return paciente;
		
	}
	
	public static PacienteResponse toPacienteResponse(Paciente paciente) {
		PacienteResponse pacienteResponse = new PacienteResponse();
		pacienteResponse.setNome(paciente.getNome());
		pacienteResponse.setSobrenome(paciente.getNome());
		pacienteResponse.setCpf(paciente.getCpf());
		pacienteResponse.setEmail(paciente.getEmail());
		pacienteResponse.setAgenda(paciente.getAgenda());
		return pacienteResponse;
	}
	
	public static List<PacienteResponse> toPacienteResponseList(List<Paciente> pacientes) {
		List<PacienteResponse> response = new ArrayList<>();
		for(Paciente paciente: pacientes) {
			response.add(toPacienteResponse(paciente));
		}
		return response;
	}

}
