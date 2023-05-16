package com.kenneth.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenneth.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
