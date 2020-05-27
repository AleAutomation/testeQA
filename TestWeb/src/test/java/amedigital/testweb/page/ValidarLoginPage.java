package amedigital.testweb.page;

import org.junit.After;
import org.junit.Before;

import amedigital.testweb.core.BasePage;
import amedigital.testweb.core.Driver;
import amedigital.testweb.map.ValidarLoginMap;

public class ValidarLoginPage extends ValidarLoginMap{
	BasePage base = new BasePage();
	
	@Before
	public void inicializarDriver() {
		new Driver().getDriver();
	}
	
	public void acessarSignIn() {
		base.clicarBtn(signin);
		base.aguardarElementoAparecer(submitLogin, 10);
	}
	
	public void logar() {
		base.clicarBtn(submitLogin);
	}
	
	public String validarLoginError() {
		return base.pegarTexto(errorLogin);
	}
	
	@After
	public void finalizarDriver() {
		new Driver().killDriver();
	}

	public void informarDadosLogin(String email, String senha) {
		base.escrever(emailInput, email);
		base.escrever(senhaInput, senha);
	}

	public String loginSucesso() {
		return base.pegarTexto(welcomeAccount);
	}
}
