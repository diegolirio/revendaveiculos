package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Cambio;
import com.diegolirio.revendaveiculos.model.Combustivel;
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

	private Cambio cambio;

	private Combustivel combustivel;	
	
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
	
	public VersaoBuilder comCambio(Cambio cambio) {
		this.cambio = cambio;
		return this;
	}

	public VersaoBuilder comCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
		return this;
	}
	
	public Versao build() {
		Versao versao = new Versao(id, descricao, motor, modelo, anoFabricacao, anoModelo, quantidadePortas);
		versao.setCambio(cambio);
		versao.setCombustivel(combustivel);
		return versao;
	}


	
}
