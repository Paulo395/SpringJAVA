package com.ceub.aplicacaoteste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceub.aplicacaoteste.model.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor,Integer>{
	
	List<Vendedor> findByNome(String nome);
	
	List<Vendedor> findBySalario(float salario);
}
