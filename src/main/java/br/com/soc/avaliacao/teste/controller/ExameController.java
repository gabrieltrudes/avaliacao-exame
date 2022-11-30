package br.com.soc.avaliacao.teste.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.soc.avaliacao.teste.dto.RequisicaoNovoExame;
import br.com.soc.avaliacao.teste.model.Exame;
import br.com.soc.avaliacao.teste.repository.ExameRepository;

@Controller
@RequestMapping("exame")
public class ExameController {

	@Autowired
	private ExameRepository exameRepository;

	@GetMapping("formulario")
	public String formulario(RequisicaoNovoExame requisicao) {
		return "exame/formulario";
	}

	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoExame requisicao, BindingResult result) {
		if (result.hasErrors()) {
			return "exame/formulario";
		}

		Exame exame = requisicao.toExame();
		exameRepository.save(exame);

		return "redirect:/home";
	}
}
