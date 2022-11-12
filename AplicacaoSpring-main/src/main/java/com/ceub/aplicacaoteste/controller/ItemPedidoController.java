package com.ceub.aplicacaoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceub.aplicacaoteste.dto.ItemPedidoDto;
import com.ceub.aplicacaoteste.model.ItemPedido;
import com.ceub.aplicacaoteste.repository.ItemPedidoRepository;

@RestController
public class ItemPedidoController {
	
	@Autowired
	ItemPedidoRepository itemPedidoRepository;
	
	@RequestMapping("/itemPedido")
	public List<ItemPedidoDto> listarClientes(Integer numero) {
		List<ItemPedido> itensPedidos;
		if (numero == null) {
			itensPedidos = itemPedidoRepository.findAll();
		} else {
			itensPedidos = itemPedidoRepository.findByQuantidade(numero);
		}
		return ItemPedidoDto.converterItemPedido(itensPedidos);
	}

	@RequestMapping("/itemPedido_completo")
	public List<ItemPedido> listarClientesCompleto() {
		List<ItemPedido> itensPedidos = itemPedidoRepository.findAll();
		return itensPedidos;
	}
}
