package com.diegolirio.revendaveiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.VeiculoDao;
import com.diegolirio.revendaveiculos.model.Veiculo;

@Service("veiculoService")
public class VeiculoService {

	@Autowired
	private VeiculoDao veiculoDao;

	public List<Veiculo> getListHome() {
		return this.veiculoDao.getListHome();
	}

	public Veiculo get(long id) {
		return this.veiculoDao.get(Veiculo.class, id);
	}

	public void save(Veiculo veiculo) {
		this.veiculoDao.save(veiculo);
	}

	public List<Veiculo> getList() {
		return this.veiculoDao.getList(Veiculo.class);
	}

}
