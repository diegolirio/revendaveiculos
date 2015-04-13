package com.diegolirio.revendaveiculos.builder;

import java.util.Date;
import java.util.List;

import com.diegolirio.revendaveiculos.model.Cor;
import com.diegolirio.revendaveiculos.model.Foto;
import com.diegolirio.revendaveiculos.model.Loja;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.model.VeiculoOpcional;
import com.diegolirio.revendaveiculos.model.Versao;

public class VeiculoBuilder {
	
	private long id;
	
	private String renavam;
	
	private String placa;
	
	private double km;
	
	private String chassi;
	
	private Versao versao;
	
	private Cor cor;
	
	private List<VeiculoOpcional> opcionais;
	
	private Date dataVenda;
	
	private Loja loja;

	private List<Foto> fotos;

	private String urlFotoPrincipal;
	
	public VeiculoBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public VeiculoBuilder comRenavam(String renavam) {
		this.renavam = renavam;
		return this;
	}
	
	public VeiculoBuilder comPlaca(String placa) {
		this.placa = placa;
		return this;
	}	
	
	public VeiculoBuilder comKm(double km) {
		this.km = km;
		return this;
	}

	public VeiculoBuilder comChassi(String chassi) {
		this.chassi = chassi;
		return this;
	}

	public VeiculoBuilder comVersao(Versao versao) {
		this.versao = versao;
		return this;
	}

	public VeiculoBuilder comCor(Cor cor) {
		this.cor = cor;
		return this;
	}

	public VeiculoBuilder comOpcionais(List<VeiculoOpcional> opcionais) {
		this.opcionais = opcionais;
		return this;
	}	
	
	public VeiculoBuilder comDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
		return this;
	}	
	
	public VeiculoBuilder comLoja(Loja loja) {
		this.loja = loja;
		return this;
	}	

	public VeiculoBuilder comFotos(List<Foto> fotos) {
		this.fotos = fotos;
		return this;
	}

	public VeiculoBuilder comUrlFotoPrincipal(String urlFotoPrincipal) {
		this.urlFotoPrincipal = urlFotoPrincipal;
		return this;
	}
	
	public Veiculo getInstance() {
		return new Veiculo(id, renavam, placa, km, chassi, versao, cor, opcionais, dataVenda, loja, urlFotoPrincipal, fotos);
	}


}
