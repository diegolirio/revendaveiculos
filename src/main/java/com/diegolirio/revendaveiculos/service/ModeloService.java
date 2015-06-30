package com.diegolirio.revendaveiculos.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.ModeloDao;
import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Subcategoria;

@Service("modeloService")
public class ModeloService extends AbstractGenericService<Modelo> {

	@Autowired
	private ModeloDao modeloDao;

	public Modelo getPorDescricaoMarca(String descricao, Marca marca, Subcategoria subcategoria) {
		return this.modeloDao.getPorDescricaoMarca(descricao, marca, subcategoria);
	}

	
}
