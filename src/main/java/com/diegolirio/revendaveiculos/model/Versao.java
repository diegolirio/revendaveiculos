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
	
	@ManyToOne
	private Modelo modelo;
	
	public Versao() {}
	
	public Versao(long id, String descricao, float motor, Modelo modelo) {
		this.id = id;
		this.descricao = descricao;
		this.motor = motor;
		this.modelo = modelo;
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

	
	
}
