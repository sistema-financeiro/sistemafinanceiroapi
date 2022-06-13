package br.com.sistemafinanceiroapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemafinanceiroapi.domain.ContaBancariaDomain;
import br.com.sistemafinanceiroapi.service.ContaBancariaService;

@RestController
@RequestMapping("/api/v1/conta-bancaria")
public class ContaBancariaController {
	
	@Autowired
	private ContaBancariaService contaBancariaService;
	
	@PostMapping
	public ContaBancariaDomain saveOne(@RequestBody ContaBancariaDomain contaBancariaDomain) {
		return this.contaBancariaService.saveOne(null);
	}
	
	@GetMapping
	public List<ContaBancariaDomain> findAll() {
		return this.contaBancariaService.findAll();
	}

}
