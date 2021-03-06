package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.VeiculoOpcionalDao;
import com.diegolirio.revendaveiculos.model.VeiculoOpcional;

@Service("veiculoOpcionalService")
public class VeiculoOpcionalService {

	@Autowired
	private VeiculoOpcionalDao veiculoOpcionalDao;

	public void save(VeiculoOpcional veiculoOpcional) {
		this.veiculoOpcionalDao.save(veiculoOpcional);
	}

}
