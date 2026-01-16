package com.valdeciproject.controlefinanceiro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.valdeciproject.controlefinanceiro.domain.Categoria;


public interface CategoriaRepository extends MongoRepository<Categoria, String>{

}
