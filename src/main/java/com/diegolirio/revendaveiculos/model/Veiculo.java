package com.diegolirio.revendaveiculos.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Veiculo {

	@Id @GeneratedValue
	private long id;
	
	private String renavam;
	
	private String placa;
	
	private double km;
	
	private String chassi;
	
	@ManyToOne
	private Versao versao;
	
	@ManyToOne
	private Cor cor;
	
	@ManyToMany
	private List<Opcional> opcionais;
	
	private Date dataVenda;
	
	@ManyToOne
	private Loja loja;
	
	private String urlFotoPrincipal;

	@OneToMany(mappedBy="veiculo", fetch=FetchType.LAZY)
	private List<Foto> fotos;

	public Veiculo(long id, String renavam, String placa, double km, String chassi, Versao versao, 
			       Cor cor, List<Opcional> opcionais, Date dataVenda, Loja loja, String urlFotoPrincipal, List<Foto> fotos) {
		this.id = id;
		this.renavam = renavam;
		this.placa = placa;
		this.km = km;
		this.chassi = chassi;
		this.versao = versao;
		this.cor = cor;
		this.opcionais = opcionais;
		this.dataVenda = dataVenda;
		this.loja = loja;
		this.fotos = fotos;
		this.urlFotoPrincipal = urlFotoPrincipal;
	}		
	
	public String getUrlFotoPrincipal() {
		return urlFotoPrincipal;
	}

	public void setUrlFotoPrincipal(String urlFotoPrincipal) {
		this.urlFotoPrincipal = urlFotoPrincipal;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Versao getVersao() {
		return versao;
	}

	public void setVersao(Versao versao) {
		this.versao = versao;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public List<Opcional> getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(List<Opcional> opcionais) {
		this.opcionais = opcionais;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public List<Foto> getFotos() {
		return fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}
	
	
	
	
}
