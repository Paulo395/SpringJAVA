package com.ceub.aplicacaoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceub.aplicacaoteste.dto.VendedorDto;
import com.ceub.aplicacaoteste.model.Vendedor;
import com.ceub.aplicacaoteste.repository.VendedorRepository;

@RestController
public class VendedorController {
	@Autowired
	VendedorRepository vendedorRepository;
	
	@RequestMapping("/vendedores")
	public List<VendedorDto> listarVendedores(Integer numero) {
		List<Vendedor> vendedores;
		if (numero == null) {
			vendedores = vendedorRepository.findAll();
		} else {
			vendedores = vendedorRepository.findBySalario(numero);
		}
		return VendedorDto.converterVendedodr(vendedores);
	}

	@RequestMapping("/vendedores_completo")
	public List<Vendedor> listarVendedoresCompletos() {
		List<Vendedor> vendedores = vendedorRepository.findAll();
		return vendedores;
	}
}
