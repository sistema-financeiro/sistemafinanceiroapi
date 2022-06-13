package br.com.sistemafinanceiroapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemafinanceiroapi.domain.PessoaDomain;
import br.com.sistemafinanceiroapi.service.PessoaService;

@RestController
@RequestMapping("/api/v1/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	public PessoaDomain saveOne(@RequestBody PessoaDomain pessoaDomain) {
		return this.pessoaService.saveOne(pessoaDomain);
	}
	
	@GetMapping
	public List<PessoaDomain> findAll() {
		return this.pessoaService.findAll();
	}

}
