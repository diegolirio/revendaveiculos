package com.diegolirio.revendaveiculos.controller;

import java.net.URI;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.service.MarcaService;

@Controller
@RequestMapping("/marca")
public class MarcaController {

	@Autowired
	private MarcaService marcaService;

	/*
	 * Page List
	 */
	@RequestMapping(value = "/get/list", method = RequestMethod.GET)
	public String pageList() {
		return "marca/list";
	}

	@RequestMapping(value = "/get/list/json", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> getList() {
		try {
			List<Marca> list = this.marcaService.getList();
			return new ResponseEntity<String>(
					new ObjectMapper().writeValueAsString(list), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/* fim Page List */

	/*
	 * Page View
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String pageView() {
		return "marca/view"; 
	}

	@RequestMapping(value = "/{id}/json", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> get(@PathVariable("id") long id) {
		try {
			Marca marca = this.marcaService.get(id);
			return new ResponseEntity<String>(
					new ObjectMapper().writeValueAsString(marca), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	/* fim Page View */
	
	/*
	 * Page Form
	 */
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String pageForm() {
		return "marca/form";
	}
	
	@RequestMapping(value="/save/{id}/json", method=RequestMethod.POST, produces="application/json", consumes="application/json")
	public ResponseEntity<String> save(@RequestBody Marca marca) {
		try {
			this.marcaService.save(marca);
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(URI.create("/marca/edit/"+marca.getId()));
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(marca), headers , HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST, produces="application/json")
	public ResponseEntity<String> delete(@PathVariable long id) {
		try {
			this.marcaService.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	
	/* fim Page Form */
}
