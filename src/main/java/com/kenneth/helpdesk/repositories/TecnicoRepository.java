package com.kenneth.helpdesk.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kenneth.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

	

	

}
