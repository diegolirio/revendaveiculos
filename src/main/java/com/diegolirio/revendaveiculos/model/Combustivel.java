package com.diegolirio.revendaveiculos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
public class Combustivel extends Model {

	@Id @GeneratedValue
	private long id;
	
	private String descricao;
	
	@JsonBackReference
	@OneToMany(mappedBy="combustivel")
	private List<Versao> versoes;

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

	public List<Versao> getVersoes() {
		return versoes;
	}

	public void setVersoes(List<Versao> versoes) {
		this.versoes = versoes;
	}
	
	
	
}
