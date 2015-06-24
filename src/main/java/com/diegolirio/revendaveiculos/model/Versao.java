package com.diegolirio.revendaveiculos.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
public class Versao extends Model {

	@Id @GeneratedValue
	private long id;
	
	private String descricao; // attractive | essentials
	
	private float motor; // 1.4
	
	private int anoFabricacao;
	
	private int anoModelo;		
	
	@ManyToOne
	private Modelo modelo;

	private int quantidadePortas;
	
	@ManyToOne
	private Cambio cambio;
	
	@JsonBackReference
	@OneToMany(mappedBy="versao")
	private Set<Veiculo> veiculos;

	@ManyToOne
	private Combustivel combustivel;

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

	public Set<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Set<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Cambio getCambio() {
		return cambio;
	}

	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
		
	}
	
	
	
}
