package br.com.sistemafinanceiroapi.service;

import br.com.sistemafinanceiroapi.domain.DespesaDomain;
import br.com.sistemafinanceiroapi.repository.DespesaProdutoServicoRepository;
import br.com.sistemafinanceiroapi.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DespesaService {
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	@Autowired
	private DespesaProdutoServicoRepository despesaProdutoServicoRepository;

	/**
	 * FIXME -- Verificar se uma determinada Despesa já está cadastrada.
	 * FIXME -- Cadastrar dados na tabela "tb_despesa_produto_servico"
	 */
	public DespesaDomain saveOne(DespesaDomain despesaDomain) {
		return this.despesaRepository.save(this.configurarPersistencia(despesaDomain));
	}
	
	public List<DespesaDomain> findAll() {
		return this.despesaRepository.findAll();
	}

	public DespesaDomain findOne(Long codigo) {
		return this.despesaRepository.findById(codigo).orElse(null);
	}
	
	private DespesaDomain configurarPersistencia(DespesaDomain despesaDomain) {
		return despesaDomain;
	}

}
