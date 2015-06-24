package com.diegolirio.revendaveiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.VeiculoDao;
import com.diegolirio.revendaveiculos.model.Veiculo;

@Service("veiculoService")
public class VeiculoService extends AbstractGenericService<Veiculo> {

	@Autowired
	private VeiculoDao veiculoDao;

	public List<Veiculo> getListHome() {
		return this.veiculoDao.getListHome();
	}

}
