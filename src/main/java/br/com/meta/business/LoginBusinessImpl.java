package br.com.meta.business;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meta.domain.UsuarioDTO;
import br.com.meta.repository.UsuarioRepository;

@Service
public class LoginBusinessImpl implements LoginBusiness {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public String login(UsuarioDTO usuarioDto) throws LoginException{
		if(usuarioRepository.login(usuarioDto) != null) {
			return "sucesso";
		} else {
			throw new LoginException("Login ou senha inválido");
		}
	}
}
