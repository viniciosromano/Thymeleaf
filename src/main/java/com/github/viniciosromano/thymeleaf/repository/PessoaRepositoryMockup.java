package com.github.viniciosromano.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.viniciosromano.thymeleaf.model.Pessoa;

public class PessoaRepositoryMockup {

	// 1 Pelé M
	// 2 Rainha Elizabeth F

	public List<Pessoa> list() {
		List<Pessoa> result = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa(1L, "Pelé", "M" );		
		result.add(pessoa);
		
		pessoa = new Pessoa(2L, "Rainha Elizabeth", "F" );
		result.add(pessoa);
		
		result.add(new Pessoa(3L, "Madona", "F" ));

		return result;
	}

}
