package com.ceub.aplicacaoteste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceub.aplicacaoteste.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer>{
	
	List<Produto> findByUnidade(String unidade);
	
	List<Produto> findByDescricao(String descricao);
}
