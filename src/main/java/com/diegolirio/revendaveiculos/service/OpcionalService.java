package com.diegolirio.revendaveiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.OpcionalDao;
import com.diegolirio.revendaveiculos.model.Opcional;
import com.diegolirio.revendaveiculos.model.Veiculo;

@Service("opcionalService")
public class OpcionalService {

	@Autowired
	private OpcionalDao opcionalDao;

	public List<Opcional> getListaPorVeiculo(Veiculo veiculo) {
		return this.opcionalDao.getListaPorVeiculo(veiculo);
	}

	
	
}
