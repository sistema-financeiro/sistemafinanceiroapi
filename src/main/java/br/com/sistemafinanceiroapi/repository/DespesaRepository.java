package br.com.sistemafinanceiroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemafinanceiroapi.domain.DespesaDomain;

@Repository
public interface DespesaRepository extends JpaRepository<DespesaDomain, Long>{ }
