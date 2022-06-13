package br.com.sistemafinanceiroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemafinanceiroapi.domain.ContaBancariaDomain;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancariaDomain, Long> {

}
