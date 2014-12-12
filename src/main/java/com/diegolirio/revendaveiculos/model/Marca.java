package com.diegolirio.revendaveiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Marca {

	@Id @GeneratedValue
	private long id;
	
	private String descricao;

	private String urlImage;

//	@OneToMany(mappedBy="marca")
//	private Set<Modelo> modelos;
	
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

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

//	public Set<Modelo> getModelos() {
//		return modelos;
//	}
//
//	public void setModelos(Set<Modelo> modelos) {
//		this.modelos = modelos;
//	}
	
	
	
	
}
