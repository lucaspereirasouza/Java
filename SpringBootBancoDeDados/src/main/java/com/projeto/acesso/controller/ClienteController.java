package com.projeto.acesso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.acesso.ClienteRepository;
import com.projeto.acesso.models.Cliente;

@RestController
public class ClienteController {
	@Autowired
	private ClienteRepository clienterepo;
	
	@GetMapping("/clientes/listar")
	public List<Cliente> listar(){
		return clienterepo.findAll();
	}
	
	@GetMapping("/olamundo")
	public String index() {
		
		return "Olá mundo";
	}
}
