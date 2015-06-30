package com.diegolirio.revendaveiculos.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
public class Modelo extends Model {

	@Id @GeneratedValue
	private long id;
	
	private String descricao; 
	
	@ManyToOne
	private Marca marca;
	
	@ManyToOne
	private Subcategoria subcategoria;
	
	@JsonBackReference
	@OneToMany(mappedBy="modelo")
	private Set<Versao> versoes;

	public Modelo() {}
	
	public Modelo(long id, String descricao, Marca marca) {
		this.id = id;
		this.descricao = descricao;
		this.marca = marca;
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

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Subcategoria getSubcategoria() {
		return this.subcategoria;
	}

	public void setSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
	}

	public Set<Versao> getVersoes() {
		return versoes;
	}

	public void setVersoes(Set<Versao> versoes) {
		this.versoes = versoes;
	}
	
	
	
}
