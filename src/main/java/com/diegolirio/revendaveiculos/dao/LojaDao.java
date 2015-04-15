package com.diegolirio.revendaveiculos.dao;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Loja;

@Repository("lojaDao")
public class LojaDao extends AbstractGenericDao<Loja> {

	public Loja getPorDescricao(String descricao) {
		try {
			return (Loja) super.manager.createQuery("Select l from Loja l where l.descricao = :descricao")
									   .setParameter("descricao", descricao)
									   .getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}

}
