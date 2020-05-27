package amedigital.testweb.steps;

import org.junit.Assert;

import amedigital.testweb.page.ValidarLoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ValidarLoginSteps {
	ValidarLoginPage validarPage = new ValidarLoginPage();

//Contexto
	@Dado("^que eu acesse a tela de login$")
	public void queEuAcesseATelaDeLogin() {
		validarPage.inicializarDriver();
		validarPage.acessarSignIn();
	}

//Login em branco
	@Quando("^eu clicar em Sign in$")
	public void euClicarEmSignIn() {
		validarPage.logar();
	}

	@Entao("^devo validar o erro retornado$")
	public void devoValidarOErroRetornado() {
		Assert.assertEquals("An email address required." , validarPage.validarLoginError());
		validarPage.finalizarDriver();
	}

//Login inválido
	@Quando("^eu inserir um email (.*) e senha (.*) invalidos$")
	public void euInserirUmEmailSenhaInvalidos(String email,String senha) {
		validarPage.informarDadosLogin(email, senha);
		validarPage.logar();
	}

	@Entao("^deve retornar um erro de autenticacao$")
	public void deveRetornarUmErroDeAutenticacao() {
		Assert.assertEquals("Authentication failed." , validarPage.validarLoginError());
		validarPage.finalizarDriver();
	}
	
//Login válido
	@Quando("^eu inserir um email (.*) e senha (.*) validos$")
	public void euInserirUmEmailSenhaValidos(String email, String senha) {
		validarPage.informarDadosLogin(email, senha);
		validarPage.logar();
	}
	
	@Entao("^o login deve ser realizado com sucesso$")
	public void loginDeveSerRealizadoComSucesso() {
		String texto = "Welcome to your account. Here you can manage all of your personal information and orders.";
		Assert.assertEquals(texto, validarPage.loginSucesso());
		validarPage.finalizarDriver();
	}
}
