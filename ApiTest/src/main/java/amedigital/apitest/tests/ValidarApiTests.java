package amedigital.apitest.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import amedigital.apitest.core.BaseTest;
import amedigital.apitest.model.ValidarApiTestsModel;

public class ValidarApiTests extends BaseTest{
	
	private static Integer MOV_ID;
	
	public void givenUsuario(ValidarApiTestsModel model) {		
		MOV_ID = given()
			.body("{\"name\":\""+model.getEmployee_name()+"\",\"salary\":\""+model.getEmployee_salary()+"\",\"age\":\""+model.getEmployee_age()+"\"}")
		.when()
			.post(APP_BASE_URL + "/api/v1/create")
		.then()
			.log().all()
			.statusCode(200)
			.extract().path("data.id")
		;
	}

	public void getEmpregadoId() {
		given()
		.when()
			.get(APP_BASE_URL + "/api/v1/employee/" + MOV_ID)
		.then()
			.log().all()
			.statusCode(200)
			.body("data.id", is(MOV_ID))
		;
		
	}

	public void deletarEmpregado() {
		given()
		.when()
			.delete(APP_BASE_URL + "/api/v1/delete/" + MOV_ID)
		.then()
			.statusCode(204)
		;		
	}
	
}
