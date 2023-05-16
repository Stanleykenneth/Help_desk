package com.kenneth.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kenneth.helpdesk.domain.Chamado;
import com.kenneth.helpdesk.domain.Cliente;
import com.kenneth.helpdesk.domain.Tecnico;
import com.kenneth.helpdesk.domain.enums.Perfil;
import com.kenneth.helpdesk.domain.enums.Prioridade;
import com.kenneth.helpdesk.domain.enums.Status;
import com.kenneth.helpdesk.repositories.ChamadoRepository;
import com.kenneth.helpdesk.repositories.ClienteRepository;
import com.kenneth.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{
	
	@Autowired // Injetando dependencias das interfaces.
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Tecnico tec1 = new Tecnico(null, "Kenneth Stanley", "71437465927", "kenneth@email.com", "1234");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "14757837950", "torvalds@email.com", "4321");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
