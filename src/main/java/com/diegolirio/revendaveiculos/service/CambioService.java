package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.CambioDao;
import com.diegolirio.revendaveiculos.model.Cambio;

@Service("cambioService")
public class CambioService extends AbstractGenericService<Cambio> {

	@Autowired
	private CambioDao cambioDao;

	public Cambio getPorDescricao(String descricao) {
		return this.cambioDao.getPorDescricao(descricao);
	}

}
