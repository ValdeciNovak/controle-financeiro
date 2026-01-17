package com.valdeciproject.controlefinanceiro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdeciproject.controlefinanceiro.domain.Lancamento;
import com.valdeciproject.controlefinanceiro.repository.LancamentoRepository;
import com.valdeciproject.controlefinanceiro.services.exception.ObjectNotFoundException;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository repo;

	public List<Lancamento> findAll() {
		return repo.findAll();
	}

	public Lancamento findById(String id) {
		Optional<Lancamento> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
