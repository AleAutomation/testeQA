package br.com.correios.page;

import org.junit.Assert;

import br.com.correios.core.BasePage;
import br.com.correios.map.PesquisaCorreiosMap;

public class PesquisaCorreiosPage extends PesquisaCorreiosMap{
	BasePage base = new BasePage();
	
	public void pesquisarCep(String endereco) {
		base.aguardarElementoClicavelAparecer(btnBuscaCep, 20);
		base.escrever(acesso_busca, endereco);
		base.clicarBtn(btnBuscaCep);
	
	}
	
	public void retornoCepPesquisado() {
		base.alternarAbas(1);
		base.aguardarElementoAparecer(tituloImagem, 10);
		Assert.assertTrue(base.isDisplayed(contrast));
		base.listaTabela();	
	}
}
