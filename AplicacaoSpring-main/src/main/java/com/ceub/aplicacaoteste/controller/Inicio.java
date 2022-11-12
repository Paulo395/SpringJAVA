package com.ceub.aplicacaoteste.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Inicio {
	@RequestMapping("/")
	@ResponseBody
	public String TelaInicio() {
		return "---- Comandos disponiveis ---- /cliente/itemPedido/pedido/produto/vendedor ---- ou completos seguidos por _completo";
	}
}
