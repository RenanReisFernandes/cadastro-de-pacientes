package com.cadastro.cadastro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class Controller {
	
	@GetMapping
	public String teste() {
		return "Isso é um teste";
	}

}
