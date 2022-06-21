package br.com.sistemafinanceiroapi.controller;

import java.util.List;

import br.com.sistemafinanceiroapi.domain.ProdutoServicoDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemafinanceiroapi.domain.ProdutoServicoDomain;
import br.com.sistemafinanceiroapi.service.ProdutoServicoService;

@RestController
@RequestMapping("/api/v1/produto-servico")
@CrossOrigin("*")
public class ProdutoServicoController {
	
	@Autowired
	private ProdutoServicoService produtoServicoService;
	
	@PostMapping
	public ProdutoServicoDomain saveOne(@RequestBody ProdutoServicoDomain produtoServicoDomain) {
		return this.produtoServicoService.saveOne(produtoServicoDomain);
	}
	
	@GetMapping
	public List<ProdutoServicoDomain> findAll() {
		return this.produtoServicoService.findAll();
	}

}
