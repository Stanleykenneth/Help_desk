package com.kenneth.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenneth.helpdesk.domain.Pessoa;
import com.kenneth.helpdesk.domain.Tecnico;

import java.util.Optional;


public interface PessoaRepository extends JpaRepository<Tecnico, Integer> {
	
	Optional<Pessoa> findByCpf(String cpf);
	Optional<Pessoa> findByEmail(String email);
}
