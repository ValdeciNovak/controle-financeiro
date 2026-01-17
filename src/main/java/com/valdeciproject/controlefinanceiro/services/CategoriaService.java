package com.valdeciproject.controlefinanceiro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdeciproject.controlefinanceiro.domain.Categoria;
import com.valdeciproject.controlefinanceiro.repository.CategoriaRepository;
import com.valdeciproject.controlefinanceiro.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public List<Categoria> findAll() {
		return repo.findAll();
	}
	
	public Categoria findById(String id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	
}