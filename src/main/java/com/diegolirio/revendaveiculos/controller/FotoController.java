package com.diegolirio.revendaveiculos.controller;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Foto;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.service.FotoService;

@Controller
@RequestMapping("/foto")
public class FotoController {

	@Autowired
	private FotoService fotoService;
	
	@RequestMapping(value="/get/lista/por/veiculo", method=RequestMethod.GET, consumes="application/json", produces="application/json")
	public ResponseEntity<String> getListaPorVeiculo(@RequestBody Veiculo veiculo) {
		try {
			List<Foto> fotos = this.fotoService.getListaPorVeiculo(veiculo);
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(fotos), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
	}

	@RequestMapping(value="/get/lista/por/veiculo/{veiculoId}", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> getListaPorVeiculo(@PathVariable("veiculoId") long veiculoId) {
		try {
			List<Foto> fotos = this.fotoService.getListaPorVeiculo(new Veiculo(veiculoId));
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(fotos), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
	}
	
	
}
