package com.diegolirio.revendaveiculos.service;
 
import java.util.List;

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

	public List<Modelo> getAllList() {
		return this.modeloDao.getList(Modelo.class);
	}
	
}
