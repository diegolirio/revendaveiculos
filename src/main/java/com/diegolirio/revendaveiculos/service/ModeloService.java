package com.diegolirio.revendaveiculos.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.ModeloDao;
import com.diegolirio.revendaveiculos.model.Modelo;

@Service("modeloService")
public class ModeloService {

	@Autowired
	private ModeloDao modeloDao;

	public void save(Modelo modelo) {
		this.modeloDao.save(modelo);
	}
	
}
