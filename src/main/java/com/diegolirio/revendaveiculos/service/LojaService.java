package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.LojaDao;
import com.diegolirio.revendaveiculos.model.Loja;

@Service("lojaService")
public class LojaService {

	@Autowired
	private LojaDao lojaDao;

	public void save(Loja loja) {
		this.lojaDao.save(loja);
	}

	public Loja getPorDescricao(String descricao) {
		return this.lojaDao.getPorDescricao(descricao);
	}
	
}
