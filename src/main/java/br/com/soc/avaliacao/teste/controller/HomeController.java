package br.com.soc.avaliacao.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.soc.avaliacao.teste.model.Exame;
import br.com.soc.avaliacao.teste.model.StatusExame;
import br.com.soc.avaliacao.teste.repository.ExameRepository;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private ExameRepository exameRepository;

	@GetMapping
	public String home(Model model) {
		List<Exame> exames = exameRepository.findAll();
		model.addAttribute("exames", exames);
		return "home";
	}
	
	@GetMapping("/{status}")
	public String porStatus(@PathVariable("status") String status, Model model) {
		List<Exame> exames = exameRepository.findByStatus(StatusExame.valueOf(status.toUpperCase()));
		model.addAttribute("exames", exames);
		model.addAttribute("status", status);
		return "home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
}
