package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ceub.aplicacaoteste.model.Vendedor;

public class VendedorDto {
	private String nome;
	private float salario;
	
	public VendedorDto() {
		
	}
	
	public VendedorDto(Vendedor vendedor) {
		this.nome = vendedor.getNome();
		this.salario = vendedor.getSalario();
	}

	public String getNome() {
		return nome;
	}

	public float getSalario() {
		return salario;
	}
	
	public static List<VendedorDto> converterVendedodr(List<Vendedor> vendedores) {
		// TODO Auto-generated method stub
		return vendedores.stream().map(VendedorDto::new).collect(Collectors.toList());
	}
}
