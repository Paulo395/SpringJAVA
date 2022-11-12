package com.ceub.aplicacaoteste.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {
	
	@Id
	private Integer quantidade;
	@ManyToOne
	@JoinColumn(name = "cod_produto")
	private Produto produto;
	/*
	@ManyToOne
	@JoinColumn(name = "codi_pedido") Dando erro aqui
	private Pedido pedido;
	*/
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
