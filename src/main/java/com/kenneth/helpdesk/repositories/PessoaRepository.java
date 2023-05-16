package com.kenneth.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenneth.helpdesk.domain.Tecnico;

public interface PessoaRepository extends JpaRepository<Tecnico, Integer> {

}
