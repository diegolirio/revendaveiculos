package com.diegolirio.revendaveiculos.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Veiculo;

@Repository("veiculoDao")
public class VeiculoDao extends AbstractGenericDao<Veiculo> {

	public List<Veiculo> getListHome() {
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Veiculo> getListPagination(int first, int countReturn) {
		List<Veiculo> list = (List<Veiculo>) super.manager.createQuery("Select v from Veiculo v").setFirstResult(first).setMaxResults(countReturn).getResultList();
		return list;
	}
	

	
	
}
