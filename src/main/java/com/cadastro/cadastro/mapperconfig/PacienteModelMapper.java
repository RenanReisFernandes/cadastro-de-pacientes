package com.cadastro.cadastro.mapperconfig;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.cadastro.cadastro.DTO.request.PacienteRequest;
import com.cadastro.cadastro.DTO.response.PacienteResponse;
import com.cadastro.cadastro.entities.Paciente;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PacienteModelMapper {
	
	private final ModelMapper mapper;
	
	public Paciente toPaciente(PacienteRequest pacienteRequest) {
		return mapper.map(pacienteRequest, Paciente.class);
	}
	
	public PacienteResponse toPacienteResponse(Paciente paciente) {
		return mapper.map(paciente, PacienteResponse.class);
	}
	
	public List<PacienteResponse> toPacienteResponseList(List<Paciente> pacientes){
		return pacientes.stream()
				.map(this::toPacienteResponse)
				.collect(Collectors.toList());
	}

}
