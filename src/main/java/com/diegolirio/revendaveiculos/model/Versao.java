package com.diegolirio.revendaveiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Versao {

	@Id @GeneratedValue
	private long id;
	
	private String descricao; // attractive | essentials
	
	private float motor; // 1.4
	
	private int anoFabricacao;
	
	private int anoModelo;
		
	
	@ManyToOne
	private Modelo modelo;

	private int quantidadePortas;

	public Versao() {}
	
	public Versao(long id, String descricao, float motor, Modelo modelo, int anoFabricacao, int anoModelo) {
		this.id = id;
		this.descricao = descricao;
		this.motor = motor;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
	}

	public Versao(long id, String descricao, float motor, Modelo modelo, int anoFabricacao, int anoModelo, int quantidadePortas) {
		this(id, descricao, motor, modelo, anoFabricacao, anoModelo);
		this.quantidadePortas = quantidadePortas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	
}
