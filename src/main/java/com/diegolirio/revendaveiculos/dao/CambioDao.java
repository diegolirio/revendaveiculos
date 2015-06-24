package com.diegolirio.revendaveiculos.dao;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Cambio;

@Repository("cambioDao")
public class CambioDao extends AbstractGenericDao<Cambio> {

	public Cambio getPorDescricao(String descricao) {
		try {
			return (Cambio) super.manager.createQuery("Select c from Cambio c where c.descricao = :descricao")
						 						  .setParameter("descricao", descricao)
						 						  .getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}

}
