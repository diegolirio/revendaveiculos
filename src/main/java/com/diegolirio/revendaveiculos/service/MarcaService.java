package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.MarcaDao;
import com.diegolirio.revendaveiculos.model.Marca;

@Service("marcaService")
public class MarcaService extends AbstractGenericService<Marca> {

	@Autowired
	private MarcaDao marcaDao;

	public Marca getPorDescricao(String descricao) {
		return this.marcaDao.getPorDescricao(descricao);
	}
	
}
