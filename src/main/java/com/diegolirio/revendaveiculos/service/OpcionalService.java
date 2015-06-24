package com.diegolirio.revendaveiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.OpcionalDao;
import com.diegolirio.revendaveiculos.model.Opcional;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.model.VeiculoOpcional;

@Service("opcionalService")
public class OpcionalService extends AbstractGenericService<Opcional> {

	@Autowired
	private OpcionalDao opcionalDao;

	public List<VeiculoOpcional> getListaPorVeiculo(Veiculo veiculo) {
		return this.opcionalDao.getListaPorVeiculo(veiculo);
	}

	public Opcional getPorDescricao(String descricao) {
		return this.opcionalDao.getPorDescricao(descricao);
	}

	
	
}
