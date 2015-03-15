package com.diegolirio.revendaveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.service.MarcaService;

@Controller
public class HomeController {
	
	@Autowired
	private MarcaService marcaService;
	
	// nao utilizado
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		//return "redirect:/paginaInicial";
		return "index";
	}

	@RequestMapping(value = "/paginaInicial", method = RequestMethod.GET)
	public String home() {
		// Busca veiculos somente da pagina Home
		return "home";
	}			
	
	@RequestMapping(value = "/criar_cadastro_inicial", method = RequestMethod.GET)
	public String createInitCadastro() {
		// se nao existe Ferrari 
		Marca ferrari = new Marca();
		ferrari.setDescricao("Ferrari");
		ferrari.setUrlImage("/revendaveiculos/static/images/marcas/ferrari.png");
		this.marcaService.save(ferrari); 
		return "index";
	}
	
	
}
