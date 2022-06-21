package br.com.sistemafinanceiroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemafinanceiroapi.domain.ProdutoServicoDomain;

@Repository
public interface ProdutoServicoRepository extends JpaRepository<ProdutoServicoDomain, Long> { }
