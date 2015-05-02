package com.diegolirio.revendaveiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/**
 * TODO remover object
 * @author ubuntu
 *
 */
@Entity
public class VeiculoOpcional {

	@Id @GeneratedValue
	private long id;
	
	@ManyToOne
	private Veiculo veiculo;
	
	@ManyToOne
	private Opcional opcional;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Opcional getOpcional() {
		return opcional;
	}

	public void setOpcional(Opcional opcional) {
		this.opcional = opcional;
	}
	
	
	
}
