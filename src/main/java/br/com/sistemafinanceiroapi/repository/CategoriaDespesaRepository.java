package br.com.sistemafinanceiroapi.repository;

import br.com.sistemafinanceiroapi.domain.CategoriaDespesaDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDespesaRepository extends JpaRepository<CategoriaDespesaDomain, Long> { }
