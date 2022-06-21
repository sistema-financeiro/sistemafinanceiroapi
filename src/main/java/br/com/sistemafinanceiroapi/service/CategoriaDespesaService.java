package br.com.sistemafinanceiroapi.service;

import br.com.sistemafinanceiroapi.domain.CategoriaDespesaDomain;
import br.com.sistemafinanceiroapi.repository.CategoriaDespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoriaDespesaService {
	
	@Autowired
	private CategoriaDespesaRepository categoriaDespesaRepository;

	public List<CategoriaDespesaDomain> findAll() {
		return this.categoriaDespesaRepository.findAll();
	}

}
