package com.diegolirio.revendaveiculos.dao;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Marca;

@Repository("marcaDao")
public class MarcaDao extends AbstractGenericDao<Marca> {

	public Marca getPorDescricao(String descricao) {
		try {
			return (Marca) super.manager.createQuery("Select m from Marca m where m.descricao = :descricao")
										.setParameter("descricao", descricao)
										.getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}

	 
	
}
