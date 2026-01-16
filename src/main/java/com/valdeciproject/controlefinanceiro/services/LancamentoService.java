package com.valdeciproject.controlefinanceiro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdeciproject.controlefinanceiro.domain.Lancamento;
import com.valdeciproject.controlefinanceiro.repository.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository repo;
	

	public List<Lancamento> findAll() {
		return repo.findAll();
	}
}
