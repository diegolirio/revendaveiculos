package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Subcategoria;

public class ModeloBuilder {

	private long id;
	
	private String descricao; 
	
	private Marca marca;

	private Subcategoria subcategoria;
	
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
	
	public ModeloBuilder comSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
		return this;
	}
	
	public Modelo build() {
		Modelo modelo = new Modelo(id, descricao, marca);
		modelo.setSubcategoria(subcategoria);
		return modelo;
	}

	
}
