package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ceub.aplicacaoteste.model.ItemPedido;

public class ItemPedidoDto {
	private Integer quantidade;
	
	public ItemPedidoDto() {
		
	}
	
	public ItemPedidoDto(ItemPedido itemPedido) {
		this.quantidade = itemPedido.getQuantidade();
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	
	public static List<ItemPedidoDto> converterItemPedido(List<ItemPedido> itensPedidos){
		return itensPedidos.stream().map(ItemPedidoDto::new).collect(Collectors.toList());
	}
}
