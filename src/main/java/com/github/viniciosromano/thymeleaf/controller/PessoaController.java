package com.github.viniciosromano.thymeleaf.controller;

import java.util.List;

import com.github.viniciosromano.thymeleaf.repository.PessoaRepositoryMockup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.viniciosromano.thymeleaf.model.Pessoa;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {
	private PessoaRepositoryMockup pessoaRepository = new PessoaRepositoryMockup();

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String lista(Model model) {
		List<Pessoa> pessoas = pessoaRepository.list();
		model.addAttribute("pessoas", pessoas);
		return "pessoa/lista.html";
	}
}
