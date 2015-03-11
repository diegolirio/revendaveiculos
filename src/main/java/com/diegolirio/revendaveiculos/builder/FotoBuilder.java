package com.diegolirio.revendaveiculos.builder;

import com.diegolirio.revendaveiculos.model.Foto;
import com.diegolirio.revendaveiculos.model.Veiculo;

public class FotoBuilder {

	private long id;
	
	private String uri;
	
	private boolean principal = false;
	
	private Veiculo veiculo;
	
	public FotoBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public FotoBuilder comUri(String uri) {
		this.uri = uri;
		return this;
	}
	
	public FotoBuilder comPrincipal(boolean principal) {
		this.principal = principal;
		return this;
	}
	
	public FotoBuilder comVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
		return this;
	}
	
	public Foto getInstance() {
		return new Foto(id, uri, principal, veiculo);
	}
	
}
