package com.diegolirio.revendaveiculos.builder;

import java.util.Set;

import com.diegolirio.revendaveiculos.model.Cor;
import com.diegolirio.revendaveiculos.model.Veiculo;

public class CorBuilder {
	
	private long id;
	
	private String descricao;
	
	private Set<Veiculo> veiculos;	
	
	public CorBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public CorBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public CorBuilder comVeiculos(Set<Veiculo> veiculos) {
		this.veiculos = veiculos;
		return this;
	}

	public Cor getInstance() {
		return new Cor(id, descricao, veiculos);
	}

}
