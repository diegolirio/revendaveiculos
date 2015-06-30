package com.diegolirio.revendaveiculos.service;

import com.diegolirio.revendaveiculos.dao.SubcategoriaDao;
import com.diegolirio.revendaveiculos.model.Subcategoria;

public class SubcategoriaService extends AbstractGenericService<Subcategoria> {

	private SubcategoriaDao subcategoriaDao;

	public Subcategoria getPorDescricao(String descricao) {
		return this.subcategoriaDao.getPorDescricao(descricao);
	}

}
