package com.diegolirio.revendaveiculos.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Opcional;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.model.VeiculoOpcional;

@Repository("opcionalDao")
public class OpcionalDao extends AbstractGenericDao<Opcional> {

	public List<VeiculoOpcional> getListaPorVeiculo(Veiculo veiculo) {
		@SuppressWarnings("unchecked")
		List<VeiculoOpcional> list = (List<VeiculoOpcional>) super.manager
												.createQuery("Select vo from VeiculoOpcional vo WHERE vo.veiculo.id = :veiculoId")
												.setParameter("veiculoId", veiculo.getId())
												.getResultList();
		return list;
	}

	public Opcional getPorDescricao(String descricao) {
		try {
			return (Opcional) super.manager.createQuery("Select o from Opcional o where o.descricao = :descricao")
										   .setParameter("descricao", descricao)
										   .getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}

}
