package com.diegolirio.revendaveiculos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
public class Opcional {

	@Id @GeneratedValue
	private long id;
	
	private String descricao;
	
	@JsonBackReference
	//@ManyToMany(mappedBy="opcionais")
	@OneToMany(mappedBy="opcional")
	private List<VeiculoOpcional> veiculos;

	public Opcional(){}
	
	public Opcional(long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
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

	public List<VeiculoOpcional> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<VeiculoOpcional> veiculos) {
		this.veiculos = veiculos;
	}
	
	
}
