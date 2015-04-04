package com.diegolirio.revendaveiculos.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.diegolirio.revendaveiculos.model.Foto;
import com.diegolirio.revendaveiculos.model.Veiculo;

@Repository("fotoDao")
public class FotoDao extends AbstractGenericDao<Foto> {

	public List<Foto> getListaPorVeiculo(Veiculo veiculo) {
		@SuppressWarnings("unchecked")
		List<Foto> fotos = (List<Foto>) super.manager
										.createQuery("Select f from Foto f where f.veiculo.id = :veiculoId")
										.setParameter("veiculoId", veiculo.getId())
										.getResultList();
		return fotos;
	}

}
