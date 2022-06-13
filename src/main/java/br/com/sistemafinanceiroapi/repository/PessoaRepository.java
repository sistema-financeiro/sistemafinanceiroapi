package br.com.sistemafinanceiroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemafinanceiroapi.domain.PessoaDomain;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaDomain, Long> { }
