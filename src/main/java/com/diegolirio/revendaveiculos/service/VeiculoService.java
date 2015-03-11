package com.diegolirio.revendaveiculos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.builder.CorBuilder;
import com.diegolirio.revendaveiculos.builder.LojaBuilder;
import com.diegolirio.revendaveiculos.builder.MarcaBuilder;
import com.diegolirio.revendaveiculos.builder.ModeloBuilder;
import com.diegolirio.revendaveiculos.builder.VeiculoBuilder;
import com.diegolirio.revendaveiculos.builder.VersaoBuilder;
import com.diegolirio.revendaveiculos.model.Cor;
import com.diegolirio.revendaveiculos.model.Loja;
import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.model.Versao;

@Service("veiculoService")
public class VeiculoService {

	public List<Veiculo> getListHome() {
		List<Veiculo> list = new ArrayList<Veiculo>();
		
		CorBuilder cb = new CorBuilder();
		Cor cor = cb.comId(1l).comDescricao("Branco").getInstance();

		LojaBuilder lb = new LojaBuilder();
		Loja loja = lb.comId(1l).comDescricao("Matriz").getInstance();
		
		MarcaBuilder marcaBuilder = new MarcaBuilder();
		Marca marca = marcaBuilder.comId(1l)
								  .comDescricao("Pegeout")
								  .comUrlImage("/revendaveiculos/static/images/veiculos/34266268_1.jpeg")
								  .getInstance();
		
		ModeloBuilder mb = new ModeloBuilder();
		Modelo modelo = mb.comId(1l)
						  .comDescricao("308")
						  .comMarca(marca)
						  .getInstance();
		
		VersaoBuilder versaoBuilder = new VersaoBuilder();
		Versao versao = versaoBuilder.comId(1l)
									 .comDescricao("Quiksilver")
									 .comMotor(1.8f)
									 .comModelo(modelo)
									 .comAnoFabricacao(2015)
									 .comAnoModelo(2015)
									 .getInstance();
		

		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb.comId(1l)
							.comCor(cor)
							.comKm(0d)
							.comLoja(loja)
							.comVersao(versao)
							.comUrlFotoPrincipal("/revendaveiculos/static/images/veiculos/34266268_1.jpeg")
							.getInstance();
		
		list.add(veiculo);
		return list;
	}

}
