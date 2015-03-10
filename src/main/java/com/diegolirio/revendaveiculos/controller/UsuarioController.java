package com.diegolirio.revendaveiculos.controller;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Usuario;
import com.diegolirio.revendaveiculos.service.UsuarioService;

@Controller
@RequestMapping("/usuario") 
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	/*
	 * Paginas
	 */
	
	@RequestMapping(value="/page/login", method=RequestMethod.GET)
	public String pageLogin() {
		return "usuario/login";
	}
	
	/*
	 * Rest Full
	 */
	
	/**
	 * Verifica se há sessão(logado) do usuario
	 * @param session
	 * @return restFull JSON usuario
	 */
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
	/**
	 * Realiza o login guardando usuario na sessao
	 * @param usuario
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST, consumes="Application/json", produces="application/json")
	public ResponseEntity<String> login(@RequestBody Usuario usuario, HttpSession session) {
		try {
			System.out.println(usuario);
			if(this.usuarioService.login(usuario) == true) {
				usuario = this.usuarioService.getUsuarioPorEmail(usuario.getEmail());
				session.setAttribute("usuario", usuario);
				return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(usuario), HttpStatus.OK);
			}
			else return new ResponseEntity<String>("Email ou senha Invalidos!", HttpStatus.UNAUTHORIZED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> logout(HttpSession session) {
		try {
			session.invalidate();
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
		
}
