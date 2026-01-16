package com.valdeciproject.controlefinanceiro.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.valdeciproject.controlefinanceiro.domain.Categoria;
import com.valdeciproject.controlefinanceiro.domain.Lancamento;
import com.valdeciproject.controlefinanceiro.enuns.TipoLancamento;
import com.valdeciproject.controlefinanceiro.repository.CategoriaRepository;
import com.valdeciproject.controlefinanceiro.repository.LancamentoRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaReposiroty;

	@Autowired
	private LancamentoRepository lancamentoReposiroty;

	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		lancamentoReposiroty.deleteAll();
		categoriaReposiroty.deleteAll();

		Categoria cat1 = new Categoria(null, "Salário", TipoLancamento.RECEITA);
		Categoria cat2 = new Categoria(null, "Pagamento Aluguel", TipoLancamento.DESPESA);

		Lancamento lanc1 = new Lancamento(null, "Salário Janeiro", 2000.0, cat1, sdf.parse("16/01/2026"));
		Lancamento lanc2 = new Lancamento(null, "Pagamento Aluguel Janeiro", 800.0, cat2, sdf.parse("17/01/2026"));

		categoriaReposiroty.saveAll(Arrays.asList(cat1, cat2));
		lancamentoReposiroty.saveAll(Arrays.asList(lanc1, lanc2));
		
	}

}
