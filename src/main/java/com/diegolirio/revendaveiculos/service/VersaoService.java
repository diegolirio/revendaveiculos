package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.VersaoDao;
import com.diegolirio.revendaveiculos.model.Versao;

@Service("versaoService")
public class VersaoService {

	@Autowired
	private VersaoDao versaoDao;

	public void save(Versao versao) {
		this.versaoDao.save(versao);
	}
}
