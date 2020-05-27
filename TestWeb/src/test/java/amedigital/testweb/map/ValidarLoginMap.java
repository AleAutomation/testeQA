package amedigital.testweb.map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amedigital.testweb.core.Driver;

public class ValidarLoginMap {
	
	public ValidarLoginMap() {
		PageFactory.initElements(new Driver().getDriver(), this);
	}
	
@FindBy(className = "header_user_info")
protected WebElement signin;

@FindBy(id = "SubmitLogin")
protected WebElement submitLogin;

@FindBy(xpath = "//div[@class='alert alert-danger']/ol/li")
protected WebElement errorLogin;

@FindBy(id = "email")
protected WebElement emailInput;

@FindBy(id = "passwd")
protected WebElement senhaInput;

@FindBy(xpath = "//div[@id='center_column']/p")
protected WebElement welcomeAccount;
	
}
