package com.diegolirio.revendaveiculos.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	/**
	 * Retorna Todos os veiculos
	 * @param response 
	 * @return JSON
	 */
	@RequestMapping(value="/get/list", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> getList(HttpServletResponse response) {
		try {
//			response.setHeader("Access-Control-Allow-Origin", "*");
//            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//            response.setHeader("Access-Control-Max-Age", "3600");
//            response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
			
			List<Veiculo> veiculos = this.veiculoService.getList(Veiculo.class);
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(veiculos ), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Retorna o veiculo(JSON) por id
	 * @param id
	 * @return JSON
	 */
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> getPorId(@PathVariable("id") long id) {
		try {
			Veiculo veiculo = this.veiculoService.get(Veiculo.class, id);
//			for (Opcional o : veiculo.getOpcionais()) {
//				System.out.println(o.getDescricao());
//			}
			String veicJSON = new ObjectMapper().writeValueAsString(veiculo);
			//System.out.println("====== " + veicJSON);
			return new ResponseEntity<String>(veicJSON , HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Busca de veiculos por paginacao
	 * @param firstResult -> posicao do primeiro
	 * @param maxResults -> maximo de resultados
	 * @return JSON
	 */
	@RequestMapping(value="/get/list/pagination/{firstResult}/{maxResults}")
	public ResponseEntity<String> getListPagination(@PathVariable("firstResult") int firstResult, @PathVariable("maxResults") int maxResults) {
		try {
			List<Veiculo> list = this.veiculoService.getListPagination(firstResult, maxResults);
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(list ), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}
	
}
