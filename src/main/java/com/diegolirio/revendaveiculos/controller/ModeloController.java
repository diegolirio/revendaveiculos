package com.diegolirio.revendaveiculos.controller;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.service.ModeloService;

@Controller
@RequestMapping("/modelo")
public class ModeloController {

	@Autowired
	private ModeloService modeloService;

	/**
	 * 
	 */
	@RequestMapping(value="/list/page", method=RequestMethod.GET)
	public String pageList() {
		return "modelo/list";
	}
	
	/**
	 * 
	 * @return JSON
	 */
	@RequestMapping(value="/get/list/all", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> getList() {
		try {
			List<Modelo> list = this.modeloService.getAllList();
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(list), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
 