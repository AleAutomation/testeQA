package amedigital.apitest.model;

public class ValidarApiTestsModel {
	
	private String employee_name;
	private String employee_salary;
	private String employee_age;
	private String endpoint;
	private String status;
	private String id;	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(String employee_salary) {
		this.employee_salary = employee_salary;
	}
	public String getEmployee_age() {
		return employee_age;
	}
	public void setEmployee_age(String employee_age) {
		this.employee_age = employee_age;
	}
}
