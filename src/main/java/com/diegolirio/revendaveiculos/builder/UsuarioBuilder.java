package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Usuario;

public class UsuarioBuilder {

	private long id;
	private String nome;
	private String email;

	public UsuarioBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public UsuarioBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public UsuarioBuilder comEmail(String email) {
		this.email = email;
		return this;
	}
	
	public Usuario getInstance() {
		return new Usuario(this.id, this.nome, this.email);
	}
}
