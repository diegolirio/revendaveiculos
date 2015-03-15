package com.diegolirio.revendaveiculos.controller;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.service.VeiculoService;

@Controller
@RequestMapping("/veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService; 
	
	/*
	 * Pages
	 */
	
	/**
	 * Retorna uma String indicando qual a view deve ser carregada
	 * @return String
	 */
	@RequestMapping(value="/page/view", method=RequestMethod.GET)
	public String pageView() {
		return "veiculo/view";
	}

	/*
	 * Rest Full
	 */
	
	/**
	 * Retorna somente os veiculos favoritos para a pagina home
	 * @return JSON
	 */
	@RequestMapping(value="/get/list/home", method=RequestMethod.GET, produces="aplication/json")
	public ResponseEntity<String> getListHome() {
		try {
			List<Veiculo> veiculos = this.veiculoService.getListHome();
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(veiculos), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
