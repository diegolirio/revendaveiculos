package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Versao;

public class VersaoBuilder {

	private long id;
	
	private String descricao;
	
	private float motor;
	
	private Modelo modelo;	
	
	public VersaoBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public Versao getInstance() {
		return new Versao(id, descricao, motor, modelo);
	}
	
}
