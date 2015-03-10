package com.diegolirio.revendaveiculos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.builder.CorBuilder;
import com.diegolirio.revendaveiculos.builder.LojaBuilder;
import com.diegolirio.revendaveiculos.builder.VeiculoBuilder;
import com.diegolirio.revendaveiculos.builder.VersaoBuilder;
import com.diegolirio.revendaveiculos.model.Cor;
import com.diegolirio.revendaveiculos.model.Loja;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.model.Versao;

@Service("veiculoService")
public class VeiculoService {

	public List<Veiculo> getListHome() {
		List<Veiculo> list = new ArrayList<Veiculo>();
		
		// Cor
		CorBuilder cb = new CorBuilder();
		Cor cor = cb.comId(1l).comDescricao("Branco").getInstance();

		LojaBuilder lb = new LojaBuilder();
		Loja loja = lb.comId(1l).comDescricao("Matriz").getInstance();
		
		VersaoBuilder versaoBuilder = new VersaoBuilder();
		Versao versao = versaoBuilder.getInstance();
		
		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb.comId(1l)
							.comAnoFabricacao(2015)
							.comAnoModelo(2015)
							.comCor(cor)
							.comKm(0d)
							.comLoja(loja)
							.comVersao(versao)
							.getInstance();
		
		list.add(veiculo);
		return list;
	}

}
