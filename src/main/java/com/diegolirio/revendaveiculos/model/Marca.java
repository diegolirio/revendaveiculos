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
	
	public Marca() {}
	
	public Marca(long id, String descricao, String urlImage) {
		this.id = id;
		this.descricao = descricao;
		this.urlImage = urlImage;
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
	
	@Override
	public String toString() {
		return "Marca [id=" + id + ", descricao=" + descricao + ", urlImage=" + urlImage + "]";
	}	
	
	
}
