package br.com.meta.service;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.meta.business.LoginBusiness;
import br.com.meta.domain.UsuarioDTO;

@RestController
@RequestMapping("autenticacao")
public class LoginService {

	@Autowired
	private LoginBusiness business;

	@RequestMapping(method = RequestMethod.POST, name = "login", produces="application/json")
	public String login(@RequestBody UsuarioDTO usuarioDto) throws LoginException{
		return business.login(usuarioDto);
	}
	
}
