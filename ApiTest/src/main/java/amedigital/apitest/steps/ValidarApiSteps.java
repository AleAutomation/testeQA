package amedigital.apitest.steps;

import java.util.List;

import amedigital.apitest.model.ValidarApiTestsModel;
import amedigital.apitest.tests.ValidarApiTests;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ValidarApiSteps {
	ValidarApiTests apiTests = new ValidarApiTests();

	@Dado("^que eu faca uma requisicao POST e cadastre um empregado$")
	public void euCriarUmUsuario(List<ValidarApiTestsModel> models) {
		for(ValidarApiTestsModel model : models) {
			model.getEmployee_name();
			model.getEmployee_salary();
			model.getEmployee_age();
			apiTests.givenUsuario(model);
		}

	}
	
	@Quando("^eu consultar o id do empregado criado$")
	public void consultarOIdDoEmpregadoCriado() {
		apiTests.getEmpregadoId();
		
	}

	@Entao("^eu devo deletar esse cadastro$")
	public void devoDeletarEsseCadastro()  {
		apiTests.deletarEmpregado();
	}
}
