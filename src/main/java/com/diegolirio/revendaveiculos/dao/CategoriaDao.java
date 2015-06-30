package com.diegolirio.revendaveiculos.dao;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Categoria;

@Repository("categoriaDao")
public class CategoriaDao extends AbstractGenericDao<Categoria> {

	public Categoria getPorDescricao(String descricao) {
		try {
			return (Categoria) super.manager.createQuery("Select c from Categoria c where c.descricao = :descricao")
								    .setParameter("descricao", descricao)
								    .getSingleResult();
		} catch(NoResultException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage() + "descricao="+descricao);
		}
	}

}
