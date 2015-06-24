package com.diegolirio.revendaveiculos.dao;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Combustivel;

@Repository("combustivelDao")
public class CombustivelDao extends AbstractGenericDao<Combustivel> {

	public Combustivel getPorDescricao(String descricao) {
		try {
			return (Combustivel) super.manager.createQuery("Select c from Combustivel c where c.descricao = :descricao")
											  .setParameter("descricao", descricao)
											  .getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}

}
