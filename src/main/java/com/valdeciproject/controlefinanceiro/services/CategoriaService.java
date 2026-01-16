package com.valdeciproject.controlefinanceiro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdeciproject.controlefinanceiro.domain.Categoria;
import com.valdeciproject.controlefinanceiro.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public List<Categoria> findAll() {
		return repo.findAll();
	}
}