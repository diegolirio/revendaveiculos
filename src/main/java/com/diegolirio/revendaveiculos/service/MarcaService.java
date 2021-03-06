package com.diegolirio.revendaveiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.MarcaDao;
import com.diegolirio.revendaveiculos.model.Marca;

@Service("marcaService")
public class MarcaService {

	@Autowired
	private MarcaDao marcaDao;
	
	public List<Marca> getList() {
		return this.marcaDao.getList(Marca.class);
	}

	public void save(Marca marca) {
		if(marca.getId() > 0) 
			this.marcaDao.update(marca); 
		else
			this.marcaDao.save(marca);
	}

	public Marca get(long id) {
		return this.marcaDao.get(Marca.class, id);
	}

	public void delete(long id) {
		this.marcaDao.delete(Marca.class, id);		
	}

	public Marca getPorDescricao(String descricao) {
		return this.marcaDao.getPorDescricao(descricao);
	}
	
}
