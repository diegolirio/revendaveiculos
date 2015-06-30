package com.diegolirio.revendaveiculos.dao;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Subcategoria;

@Repository("modeloDao")
public class ModeloDao extends AbstractGenericDao<Modelo> {

	public Modelo getPorDescricaoMarca(String descricao, Marca marca, Subcategoria subcategoria) {
		try {
			String sql = "Select m from Modelo m where m.descricao = :descricao and m.marca.id = :marcaId and m.subcategoria.id = :subcategoriaId";
			return (Modelo) super.manager.createQuery(sql)
								    .setParameter("descricao", descricao)
								    .setParameter("marcaId", marca.getId())
								    .getSingleResult();
		} catch(NoResultException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage() + " marca="+marca+";descricao="+descricao+";subcategoria="+subcategoria);
		}
	}	

}
