package br.com.correios.map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.correios.core.Driver;

public class PesquisaCorreiosMap {
	public PesquisaCorreiosMap() {
		PageFactory.initElements(new Driver().getDriver(), this);
	}
	
	@FindBy(id = "access_information")
	protected WebElement access_information;
	
	@FindBy(id = "acesso-busca")
	protected WebElement acesso_busca;
	
	@FindBy(xpath = "//form[@action='http://www.buscacep.correios.com.br/sistemas/buscacep/resultadoBuscaCepEndereco.cfm?t']//button[@class='bt-link-ic']")
	protected WebElement btnBuscaCep;
	
	@FindBy(xpath = "//table[@class='tmptabela']")
	protected WebElement dadosCep;
	
	@FindBy(xpath = "//table[@class='tmptabela']//tr[2]//td[1]")
	protected WebElement rua;
	
	@FindBy(xpath = "//table[@class='tmptabela']//tr[2]//td[2]")
	protected WebElement bairro;
	
	@FindBy(xpath = "//table[@class='tmptabela']//tr[2]//td[3]")
	protected WebElement uf;
	
	@FindBy(xpath = "//table[@class='tmptabela']//tr[2]//td[4]")
	protected WebElement cep;
	
	@FindBy(xpath = "//div[@class='tituloimagem']")
	protected WebElement tituloImagem;
	
	@FindBy(id="contrast")
	protected WebElement contrast;
}
