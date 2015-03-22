package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.FotoDao;
import com.diegolirio.revendaveiculos.model.Foto;

@Service("fotoService")
public class FotoService {

	@Autowired
	private FotoDao fotoDao;

	public void save(Foto foto) {
		this.fotoDao.save(foto);
	}
	
}
