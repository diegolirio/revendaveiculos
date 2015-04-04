package com.diegolirio.revendaveiculos.controller;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Opcional;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.service.OpcionalService;

@Controller
@RequestMapping("/opcional")
public class OpcionalController {

	@Autowired
	private OpcionalService opcionalService;

	@RequestMapping(value="/get/lista/por/veiculo/{veiculoId}", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> getListaPorVeiculo(@PathVariable("veiculoId") long veiculoId) {
		try {
			List<Opcional> opcionais = this.opcionalService.getListaPorVeiculo(new Veiculo(veiculoId));
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(opcionais), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
