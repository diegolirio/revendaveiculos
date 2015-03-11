package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;

public class ModeloBuilder {

	private long id;
	
	private String descricao; 
	
	private Marca marca;
	
	public ModeloBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public ModeloBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public ModeloBuilder comMarca(Marca marca) {
		this.marca = marca;
		return this;
	}
	
	public Modelo getInstance() {
		return new Modelo(id, descricao, marca);
	}
	
}
