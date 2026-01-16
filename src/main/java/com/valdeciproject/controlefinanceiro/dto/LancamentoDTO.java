package com.valdeciproject.controlefinanceiro.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.valdeciproject.controlefinanceiro.domain.Categoria;
import com.valdeciproject.controlefinanceiro.domain.Lancamento;

public class LancamentoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String descricao;
	private double valor;
	private Categoria categoria;
	private Date data;

	public LancamentoDTO() {
	}

	public LancamentoDTO(Lancamento obj) {

		id = obj.getId();
		descricao = obj.getDescricao();
		valor = obj.getValor();
		categoria = obj.getCategoria();
		data = obj.getData();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
