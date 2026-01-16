package com.valdeciproject.controlefinanceiro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.valdeciproject.controlefinanceiro.domain.Lancamento;

public interface LancamentoRepository extends MongoRepository<Lancamento, String>{

}
