package br.com.sistemafinanceiroapi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistemafinanceiroapi.domain.PessoaDomain;
import br.com.sistemafinanceiroapi.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public PessoaDomain saveOne(PessoaDomain pessoaDomain) {
		return this.pessoaRepository.save(this.configurarPessoa(pessoaDomain));
	}
	
	public List<PessoaDomain> findAll() {
		return this.pessoaRepository.findAll();
	}
	
	private PessoaDomain configurarPessoa(PessoaDomain pessoaDomain) {
		pessoaDomain.setDataAtualizacao(new Date());
		pessoaDomain.seteAtivo(true);
		pessoaDomain.setUsuarioAtualizacao("USUARIO_SISTEMA");
		return pessoaDomain;
	}
	
	public List<PessoaDomain> recuperarPessoaFisica() {
		List<PessoaDomain> pessoaFisicaList = new ArrayList<>();
		for(PessoaDomain pessoaDomain : this.findAll()) {
			if(pessoaDomain.getCategoriaPessoaDomain().getDescricao().equals("Pessoa Física")) {
				pessoaFisicaList.add(pessoaDomain);
			}
		}
		return pessoaFisicaList;
	}
	
	public List<PessoaDomain> recuperarPessoaJuridica() {
		List<PessoaDomain> pessoaJuridicaList = new ArrayList<>();
		for(PessoaDomain pessoaDomain : this.findAll()) {
			if(pessoaDomain.getCategoriaPessoaDomain().getDescricao().equals("Pessoa Jurídica")) {
				pessoaJuridicaList.add(pessoaDomain);
			}
		}
		return pessoaJuridicaList;
	}

}
