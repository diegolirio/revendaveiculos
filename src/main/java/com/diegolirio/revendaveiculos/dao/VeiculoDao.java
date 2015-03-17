package com.diegolirio.revendaveiculos.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Veiculo;

@Repository("veiculoDao")
public class VeiculoDao extends AbstractGenericDao<Veiculo> {

	public List<Veiculo> getListHome() {
		return null;
	}
	
	

	
	
}
