package com.ceub.aplicacaoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceub.aplicacaoteste.dto.ProdutoDto;
import com.ceub.aplicacaoteste.model.Produto;
import com.ceub.aplicacaoteste.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	@Autowired
	ProdutoRepository produtoRepository;
	
	@RequestMapping("/produtos")
	public List<ProdutoDto> listarProdutos(String numero) {
		List<Produto> produtos;
		if (numero == null) {
			produtos = produtoRepository.findAll();
		} else {
			produtos = produtoRepository.findByDescricao(numero);
		}
		return ProdutoDto.converterProduto(produtos);
	}
	
	@RequestMapping("/produtos_completo")
	public List<Produto> listarVendedoresCompletos() {
		List<Produto> produtos = produtoRepository.findAll();
		return produtos;
	}
}
