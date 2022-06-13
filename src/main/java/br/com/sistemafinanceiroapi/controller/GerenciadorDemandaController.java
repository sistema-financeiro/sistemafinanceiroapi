package br.com.sistemafinanceiroapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemafinanceiroapi.service.GerenciadorDemandaService;

@RestController
@RequestMapping("/api/v1/gerenciador-demanda")
public class GerenciadorDemandaController {
	
	@Autowired
	private GerenciadorDemandaService gerenciadorDemandaService;
	
	@GetMapping
	public String gerarIdentificadorDemanda() {
		return this.gerenciadorDemandaService.gerarIdentificadorDemanda(); 
	}

}
