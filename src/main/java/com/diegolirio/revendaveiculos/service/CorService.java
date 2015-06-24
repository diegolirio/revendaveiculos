package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.CorDao;
import com.diegolirio.revendaveiculos.model.Cor;

@Service("corService")
public class CorService extends AbstractGenericService<Cor> {

	@Autowired
	private CorDao corDao;

	public Cor getPorDescricao(String descricao) {
		return this.corDao.getPorDescricao(descricao);
	}
	
}
