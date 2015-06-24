package com.diegolirio.revendaveiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.FotoDao;
import com.diegolirio.revendaveiculos.model.Foto;
import com.diegolirio.revendaveiculos.model.Veiculo;

@Service("fotoService")
public class FotoService extends AbstractGenericService<Foto> {

	@Autowired
	private FotoDao fotoDao;

	public List<Foto> getListaPorVeiculo(Veiculo veiculo) {
		return this.fotoDao.getListaPorVeiculo(veiculo);
	}
	
}
