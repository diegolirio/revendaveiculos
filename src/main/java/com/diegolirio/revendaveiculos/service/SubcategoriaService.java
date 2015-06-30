package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.SubcategoriaDao;
import com.diegolirio.revendaveiculos.model.Subcategoria;

@Service("subcategoriaService")
public class SubcategoriaService extends AbstractGenericService<Subcategoria> {

	@Autowired
	private SubcategoriaDao subcategoriaDao;

	public Subcategoria getPorDescricao(String descricao) {
		return this.subcategoriaDao.getPorDescricao(descricao);
	}

}
