package com.kenneth.helpdesk.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kenneth.helpdesk.domain.Tecnico;
import com.kenneth.helpdesk.domain.dtos.TecnicoDTO;
import com.kenneth.helpdesk.services.TecnicoService;

@RestController
@RequestMapping(value = "/tecnicos")  //Adicionar a endpoint inicial para os serviços
public class TecnicoResource {
	
	
	@Autowired
	private TecnicoService service;
	
	@GetMapping(value = "/{id}")// informando que está recebendo uma variável path.
	public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id){   //representa todas as resposta http.
		Tecnico obj = service.findById(id);
		return ResponseEntity.ok().body(new TecnicoDTO(obj));		
	} 
	
	@GetMapping
	public ResponseEntity<List<TecnicoDTO>> findAll(){
		List<Tecnico> list = service.findAll();
		List<TecnicoDTO> listDTO = list.stream().map(obj -> new TecnicoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
}
