package br.com.correios.steps;

import br.com.correios.core.Driver;
import br.com.correios.page.PesquisaCorreiosPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class PesquisaCorreiosSteps {
	PesquisaCorreiosPage pesqPage = new PesquisaCorreiosPage();
	
	@Dado("^que eu faca uma pesquisa de cep ou endereco (.*)$")
	public void que_eu_faca_uma_pesquisa_de_cep_ou_endereco(String endereco) throws Throwable {
		pesqPage.pesquisarCep(endereco);
		
	}

	@Entao("^as informacoes devem retornar no console$")
	public void as_informacoes_devem_retornar_no_console() throws Throwable {
		pesqPage.retornoCepPesquisado();
		new Driver().killDriver();

	}

}
