package com.diegolirio.revendaveiculos.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Opcional;
import com.diegolirio.revendaveiculos.model.Veiculo;

@Repository("opcionalDao")
public class OpcionalDao extends AbstractGenericDao<Opcional> {

	public List<Opcional> getListaPorVeiculo(Veiculo veiculo) {
		@SuppressWarnings("unchecked")
		List<Opcional> list = (List<Opcional>) super.manager
												.createQuery("Select o from Opcional o where o.veiculo.id = :veiculoId")
												.setParameter("veiculoId", veiculo.getId())
												.getResultList();
		return list;
	}

}
