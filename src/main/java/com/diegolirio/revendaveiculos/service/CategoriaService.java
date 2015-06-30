package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.CategoriaDao;
import com.diegolirio.revendaveiculos.model.Categoria;

@Service("categoriaService")
public class CategoriaService extends AbstractGenericService<Categoria> {

	@Autowired
	private CategoriaDao categoriaDao;

	public Categoria getPorDescricao(String descricao) {
		return this.categoriaDao.getPorDescricao(descricao);
	}

}
