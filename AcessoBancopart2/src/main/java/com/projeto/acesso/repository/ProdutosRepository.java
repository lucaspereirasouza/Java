package com.projeto.acesso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.acesso.models.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {

}
