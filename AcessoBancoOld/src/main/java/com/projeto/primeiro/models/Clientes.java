package com.projeto.primeiro.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcliente;
	@Column
	private String nomecliente;
	@Column
	private String email;
	@Column
	private String cpf;
	@Column
	private String telefone;
	@Column
	private Integer idade;
}
