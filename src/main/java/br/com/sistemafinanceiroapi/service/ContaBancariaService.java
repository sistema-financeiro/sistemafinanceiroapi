package br.com.sistemafinanceiroapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistemafinanceiroapi.domain.ContaBancariaDomain;
import br.com.sistemafinanceiroapi.repository.ContaBancariaRepository;

@Service
public class ContaBancariaService {
	
	@Autowired
	private ContaBancariaRepository contaBancariaRepository;
	
	public ContaBancariaDomain saveOne(ContaBancariaDomain contaBancariaDomain) {
		return this.contaBancariaRepository.save(contaBancariaDomain);
	}
	
	public List<ContaBancariaDomain> findAll() {
		return this.contaBancariaRepository.findAll();
	}

}
