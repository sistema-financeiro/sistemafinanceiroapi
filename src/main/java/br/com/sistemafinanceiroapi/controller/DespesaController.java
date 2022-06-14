package br.com.sistemafinanceiroapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemafinanceiroapi.domain.DespesaDomain;
import br.com.sistemafinanceiroapi.service.DespesaService;

@RestController
@RequestMapping("/api/v1/despesa")
@CrossOrigin("*")
public class DespesaController {
	
	@Autowired
	private DespesaService despesaService;
	
	@PostMapping
	public DespesaDomain saveOne(@RequestBody DespesaDomain despesaDomain) {
		return this.despesaService.saveOne(despesaDomain);
	}
	
	@GetMapping
	public List<DespesaDomain> findAll() {
		return this.despesaService.findAll();
	}

}
