package pt.po.edimilsonestevam.stepDefinition;

import junitparams.mappers.CsvWithHeaderMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import pt.po.edimilsonestevam.page.SimularInvestimentoPoupancaWeb;
import pt.po.edimilsonestevam.setup.Configuracao;

@RunWith(JUnitParamsRunner.class)
public class TestSteps {

	protected static WebDriver navegador;

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Dado("^eu estou na pagina do Simulador de Investimento \"([^\"]*)\"$")
	public void eu_estou_na_pagina_do_Simulador_de_Investimento(String url) throws Throwable {

		navegador = new Configuracao().AbrirNavegador("chrome", url);
		
	}

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Quando("^eu informo o perfil (\\d+)$")
	public void eu_informo_o_perfil(int perfil) throws Throwable {

		new SimularInvestimentoPoupancaWeb(navegador).informarSeuPerfil(perfil);
		
	}

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Quando("^eu informo o valor a ser aplicado (\\d+), o valor a ser poupado (\\d+), a quantidade de meses ou anos (\\d+), o tipo do prazo (\\d+)$")
	public void eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo1(int valorAplicado, int valorPoupado, int quantidadeMesesOuAnos, int tipoPrazo) throws Throwable {

		new SimularInvestimentoPoupancaWeb(navegador).informarValorAplicado(valorAplicado);
		new SimularInvestimentoPoupancaWeb(navegador).informarValorPoupado(valorPoupado);
		new SimularInvestimentoPoupancaWeb(navegador).informarQuantidadeMesesOuAnos(quantidadeMesesOuAnos);
		new SimularInvestimentoPoupancaWeb(navegador).clicarBotaoMesAno(tipoPrazo);
		
	}

	@Test
	@Quando("^eu confirmo a operacao \"([^\"]*)\"$")
	public void eu_confirmo_a_operacao() throws Throwable {

		new SimularInvestimentoPoupancaWeb(navegador).clicarBotaoSimular();
	
	}
	
	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Quando("^eu confirmo a operacao $")
	public void eu_confirmo_a_operacao(String mensagemAdvertencia) throws Throwable {

		new SimularInvestimentoPoupancaWeb(navegador).clicarBotaoSimular();
		new SimularInvestimentoPoupancaWeb(navegador).validarValorAplicadoMaiorOuIgualValorMinimo(mensagemAdvertencia);
		new SimularInvestimentoPoupancaWeb(navegador).validarValorPoupadoMaiorOuIgualValorMinimo(mensagemAdvertencia);
		new SimularInvestimentoPoupancaWeb(navegador).validarQuantidadeMesesOuAnos(mensagemAdvertencia);
		
	}
	
	@Test
	@Entao("^o sistema apresenta uma mensagem $")
	public void o_sistema_apresenta_uma_mensagem() throws Throwable {
		
		new SimularInvestimentoPoupancaWeb(navegador).validarMensagemSucessoInvestimento();
		
	}
	
	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Entao("^o sistema apresenta uma mensagem \"([^\"]*)\"$")
	public void o_sistema_apresenta_uma_mensagem(String mensagemSucessoInvestimento) throws Throwable {

		new SimularInvestimentoPoupancaWeb(navegador).validarMensagemSucessoInvestimento(mensagemSucessoInvestimento);
		
	}

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Quando("^eu informo o valor a ser aplicado (\\d+), o valor a ser poupado (\\d+), a quantidade de meses ou anos , o tipo do prazo (\\d+)$")
	public void eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo(int valorAplicado, int valorPoupado, int tipoPrazo) throws Throwable {

		new SimularInvestimentoPoupancaWeb(navegador).informarValorAplicado(valorAplicado);
		new SimularInvestimentoPoupancaWeb(navegador).informarValorPoupado(valorPoupado);
		new SimularInvestimentoPoupancaWeb(navegador).clicarBotaoMesAno(tipoPrazo);
		
	}

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Quando("^eu informo o valor a ser aplicado (\\d+), o valor a ser poupado (\\d+), a quantidade de meses ou anos -(\\d+), o tipo do prazo (\\d+)$")
	public void eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo(int valorAplicado, int valorPoupado, int quantidadeMesesOuAnos, int tipoPrazo) throws Throwable {

		new SimularInvestimentoPoupancaWeb(navegador).informarValorAplicado(valorAplicado);
		new SimularInvestimentoPoupancaWeb(navegador).informarValorPoupado(valorPoupado);
		new SimularInvestimentoPoupancaWeb(navegador).informarQuantidadeMesesOuAnos(quantidadeMesesOuAnos);
		new SimularInvestimentoPoupancaWeb(navegador).clicarBotaoMesAno(tipoPrazo);
		
	}

}