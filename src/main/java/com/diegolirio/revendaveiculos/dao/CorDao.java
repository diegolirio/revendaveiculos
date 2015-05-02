package com.diegolirio.revendaveiculos.dao;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Cor;

@Repository("corDao")
public class CorDao extends AbstractGenericDao<Cor> {

	public Cor getPorDescricao(String descricao) {
		try {
			return (Cor) super.manager.createQuery("Select c from Cor c where c.descricao = :descricao")
								      .setParameter("descricao", descricao)
								      .getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}

	
	
}
