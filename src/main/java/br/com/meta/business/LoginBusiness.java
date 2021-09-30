package br.com.meta.business;

import javax.security.auth.login.LoginException;

import br.com.meta.domain.UsuarioDTO;

public interface LoginBusiness {

	public String login(UsuarioDTO usuarioDto) throws LoginException;
}
