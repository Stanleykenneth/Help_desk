package com.kenneth.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenneth.helpdesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer> {

}
