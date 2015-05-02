package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Versao;

public class VersaoBuilder {

	private long id;
	
	private String descricao;
	
	private float motor;
	
	private Modelo modelo;

	private int anoFabricacao;

	private int anoModelo;

	private int quantidadePortas;	
	
	public VersaoBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public VersaoBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public VersaoBuilder comMotor(float motor) {
		this.motor = motor;
		return this;
	}
	
	public VersaoBuilder comModelo(Modelo modelo) {
		this.modelo = modelo;
		return this;
	}


	public VersaoBuilder comAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
		return this;
	}	
	
	public VersaoBuilder comAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
		return this;
	}		

	public VersaoBuilder comQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
		return this;
	}
	
	public Versao getInstance() {
		return new Versao(id, descricao, motor, modelo, anoFabricacao, anoModelo, quantidadePortas);
	}

	
}
