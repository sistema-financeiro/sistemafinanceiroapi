package br.com.sistemafinanceiroapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistemafinanceiroapi.domain.ProdutoServicoDomain;
import br.com.sistemafinanceiroapi.repository.ProdutoServicoRepository;

@Service
public class ProdutoServicoService {
	
	@Autowired
	private ProdutoServicoRepository produtoServicoRepository;
	
	public ProdutoServicoDomain saveOne(ProdutoServicoDomain produtoServicoDomain) {
		return this.produtoServicoRepository.save(produtoServicoDomain);
	}
	
	public List<ProdutoServicoDomain> findAll() {
		return this.produtoServicoRepository.findAll();
	}

}
