package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.CombustivelDao;
import com.diegolirio.revendaveiculos.model.Combustivel;

@Service("combustivelService")
public class CombustivelService extends AbstractGenericService<Combustivel> {

	@Autowired
	private CombustivelDao combustivelDao;

	public Combustivel getPorDescricao(String descricao) {
		return this.combustivelDao.getPorDescricao(descricao);
	}

}
