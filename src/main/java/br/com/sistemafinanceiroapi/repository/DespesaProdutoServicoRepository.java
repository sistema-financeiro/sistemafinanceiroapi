package br.com.sistemafinanceiroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemafinanceiroapi.domain.DespesaProdutoServicoDomain;

@Repository
public interface DespesaProdutoServicoRepository extends JpaRepository<DespesaProdutoServicoDomain, Long>{ }
