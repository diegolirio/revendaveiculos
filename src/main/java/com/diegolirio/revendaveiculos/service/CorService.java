package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.CorDao;
import com.diegolirio.revendaveiculos.model.Cor;

@Service("corService")
public class CorService {

	@Autowired
	private CorDao corDao;

	public void save(Cor cor) {
		this.corDao.save(cor);
	}
	
}
