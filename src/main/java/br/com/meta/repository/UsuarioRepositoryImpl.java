package br.com.meta.repository;

import br.com.meta.domain.UsuarioDTO;

public class UsuarioRepositoryImpl implements UsuarioRepositoryCustom {

	@Override
	public String login(UsuarioDTO usuarioDTO) {
		if(usuarioDTO.getUsuario().equals("admin") && usuarioDTO.getSenha().equals("123")) {
			return "sucesso";
		} else {
			return null;			
		}
	}

}
