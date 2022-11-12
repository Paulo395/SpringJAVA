package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ceub.aplicacaoteste.model.Pedido;

public class PedidoDto {
	private Integer numero;
	
	public PedidoDto() {
		
	}
	
	public PedidoDto(Pedido pedido) {
		this.numero = pedido.getNumero();
	}
	
	public Integer getNumero() {
		return numero;
	}

	public static List<PedidoDto> converterPedido(List<Pedido> pedido) {
		// TODO Auto-generated method stub
		return pedido.stream().map(PedidoDto::new).collect(Collectors.toList());
	}
}
