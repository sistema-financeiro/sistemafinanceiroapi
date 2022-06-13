package br.com.sistemafinanceiroapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistemafinanceiroapi.domain.DespesaDomain;
import br.com.sistemafinanceiroapi.repository.DespesaRepository;


@Service
public class DespesaService {
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	public DespesaDomain saveOne(DespesaDomain despesaDomain) {
		return this.despesaRepository.save(despesaDomain);
	}
	
	public List<DespesaDomain> findAll() {
		return this.despesaRepository.findAll();
	}

}
