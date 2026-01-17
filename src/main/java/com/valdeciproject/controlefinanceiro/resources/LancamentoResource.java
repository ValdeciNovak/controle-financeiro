package com.valdeciproject.controlefinanceiro.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.valdeciproject.controlefinanceiro.domain.Categoria;
import com.valdeciproject.controlefinanceiro.domain.Lancamento;
import com.valdeciproject.controlefinanceiro.dto.LancamentoDTO;
import com.valdeciproject.controlefinanceiro.services.LancamentoService;

@RestController
@RequestMapping(value = "/lancamentos")
public class LancamentoResource {

	@Autowired
	private LancamentoService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<LancamentoDTO>> findAll() {

		List<Lancamento> list = service.findAll();

		List<LancamentoDTO> listDto = list.stream().map(x -> new LancamentoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);

	}


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Lancamento> findById(@PathVariable String id) {

		Lancamento obj = service.findById(id);

		return ResponseEntity.ok().body(obj);
	}



}
