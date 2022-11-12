package com.ceub.aplicacaoteste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceub.aplicacaoteste.model.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Integer>{
	
	List<ItemPedido> findByQuantidade(Integer quantidade);
}
