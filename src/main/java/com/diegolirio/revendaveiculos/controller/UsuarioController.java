package com.diegolirio.revendaveiculos.controller;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Usuario;

@Controller
@RequestMapping("/usuario") 
public class UsuarioController {

	@RequestMapping(value="/session", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> getSessionLogged(HttpSession session) {
		try {
			Usuario usuario = (Usuario) session.getAttribute("usuario");
			if(usuario == null) 
				throw new RuntimeException("Usuario desconectado");
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(usuario), HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.UNAUTHORIZED);
		}
	}	
	
	@RequestMapping(value="/page/login", method=RequestMethod.GET)
	public String pageLogin() {
		return "usuario/login";
	}
	
}
