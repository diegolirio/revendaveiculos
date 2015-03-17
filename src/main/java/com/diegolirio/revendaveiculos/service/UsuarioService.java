package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.builder.UsuarioBuilder;
import com.diegolirio.revendaveiculos.dao.UsuarioDao;
import com.diegolirio.revendaveiculos.model.Usuario;

@Service("usuarioService")
public class UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;

	public boolean login(Usuario usuario) {
		return "diegolirio.dl@gmail.com".equals(usuario.getEmail()) && "123456".equals(usuario.getSenha());
	}

	public Usuario getUsuarioPorEmail(String email) {
		UsuarioBuilder ub = new UsuarioBuilder();
		Usuario usuario = ub
				.comId(1l)
				.comNome("Diego Lirio Damacena Pereira")
				.comEmail("diegolirio.dl@gmail.com")
				.getInstance();
		return usuario;
	}

	public void save(Usuario usuario) {
		this.usuarioDao.save(usuario);
	}
	
}
