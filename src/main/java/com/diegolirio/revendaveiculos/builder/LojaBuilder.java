package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Loja;

public class LojaBuilder {
	
	private long id;
	private String descricao;

	public LojaBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public LojaBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public Loja getInstance() {
		return new Loja(id, descricao);
	}

}
