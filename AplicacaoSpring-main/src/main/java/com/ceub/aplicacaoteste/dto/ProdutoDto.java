package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ceub.aplicacaoteste.model.Produto;

public class ProdutoDto {
	private String unidade;
	private String descricao;
	
	public ProdutoDto() {
		
	}

	public ProdutoDto(Produto produto) {
		this.unidade = produto.getUnidade();
		this.descricao = produto.getDescricao();
	}

	public String getUnidade() {
		return unidade;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static List<ProdutoDto> converterProduto(List<Produto> produtos) {
		// TODO Auto-generated method stub
		return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
	}
}
