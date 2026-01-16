package com.valdeciproject.controlefinanceiro.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import com.valdeciproject.controlefinanceiro.domain.Categoria;
import com.valdeciproject.controlefinanceiro.enuns.TipoLancamento;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String nome;

	private TipoLancamento tipo;

	public CategoriaDTO() {
	}

	public CategoriaDTO(Categoria obj) {

		id = obj.getId();
		nome = obj.getNome();
		tipo = obj.getTipo();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoLancamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}

}
