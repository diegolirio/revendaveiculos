package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Marca;

public class MarcaBuilder {

	private long id;
	
	private String descricao;

	private String urlImage;	
	
	public MarcaBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public MarcaBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public MarcaBuilder comUrlImage(String urlImage) {
		this.urlImage = urlImage;
		return this;
	}
	
	public Marca getInstance() {
		return new Marca(id, descricao, urlImage);
	}
	
}
