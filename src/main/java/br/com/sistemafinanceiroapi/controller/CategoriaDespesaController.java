package br.com.sistemafinanceiroapi.controller;

import br.com.sistemafinanceiroapi.domain.CategoriaDespesaDomain;
import br.com.sistemafinanceiroapi.service.CategoriaDespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria-despesa")
@CrossOrigin("*")
public class CategoriaDespesaController {
	
	@Autowired
	private CategoriaDespesaService categoriaDespesaService;
	
	@GetMapping
	public List<CategoriaDespesaDomain> findAll() {
		return this.categoriaDespesaService.findAll();
	}

}
