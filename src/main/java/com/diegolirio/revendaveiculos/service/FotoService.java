package com.diegolirio.revendaveiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.FotoDao;
import com.diegolirio.revendaveiculos.model.Foto;
import com.diegolirio.revendaveiculos.model.Veiculo;

@Service("fotoService")
public class FotoService {

	@Autowired
	private FotoDao fotoDao;

	public void save(Foto foto) {
		this.fotoDao.save(foto);
	}

	public List<Foto> getListaPorVeiculo(Veiculo veiculo) {
		return this.fotoDao.getListaPorVeiculo(veiculo);
	}
	
}
