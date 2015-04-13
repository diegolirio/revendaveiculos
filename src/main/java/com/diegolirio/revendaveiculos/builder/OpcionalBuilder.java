package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Opcional;

public class OpcionalBuilder {

	private long id;
	private String descricao;

	public Opcional build() {
		return new Opcional(id, descricao);
	}

	public OpcionalBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

}
