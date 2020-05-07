package pt.po.edimilsonestevam.page;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pt.po.edimilsonestevam.setup.Base;

public class SimularInvestimentoPoupancaWeb extends Base {
	
	public SimularInvestimentoPoupancaWeb(WebDriver navegador) {
		super(navegador);

	}
	
	public SimularInvestimentoPoupancaWeb informarSeuPerfil(int perfil) {
		
		System.out.println("Informando o Perfil...");
		
		if(perfil == 1) {
			navegador.findElement(By.xpath("//div[text()='Para você']")).click();
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		else if(perfil == 2){
			navegador.findElement(By.xpath("//div[text()='Para sua empresa ou agronegócio                ']")).click();
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		else {
			System.out.println("Informe 1 para Pessoa Física ou 2 para Pessoa Juridica!");
		}
		return new SimularInvestimentoPoupancaWeb(navegador);
	}
	
	public SimularInvestimentoPoupancaWeb informarValorAplicado(int valorAplicado) {
		
		System.out.println("Informando o Valor Aplicado...");

		String valorAplicadoParametro = Integer.toString(valorAplicado);
		
		if(valorAplicado >= 20) {
			navegador.findElement(By.id("valorAplicar")).sendKeys(valorAplicadoParametro);
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		else {
			System.out.println("Informe um valor igual ou acima de R$ 20.00!");
		}
		return new SimularInvestimentoPoupancaWeb(navegador);
	}
	
	public SimularInvestimentoPoupancaWeb informarValorPoupado(int valorPoupado) {
		
		System.out.println("Informando o Valor Poupado...");
		
		String valorPoupadoParametro = Integer.toString(valorPoupado);
		
		if(valorPoupado >= 20) {
			navegador.findElement(By.id("valorInvestir")).sendKeys(valorPoupadoParametro);
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		else {
			System.out.println("Informe um valor igual ou acima de R$ 20.00!");
		}
		return new SimularInvestimentoPoupancaWeb(navegador);
	}

	public SimularInvestimentoPoupancaWeb informarQuantidadeMesesOuAnos(int quantidadeMesesOuAnos) {
		
		System.out.println("Informando a Quantidade de Meses ou Anos...");

		String quantidadeMesesOuAnosParametro = Integer.toString(quantidadeMesesOuAnos);
		
		if(quantidadeMesesOuAnos > 0) {
			navegador.findElement(By.id("tempo")).sendKeys(quantidadeMesesOuAnosParametro);
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		else {
			System.out.println("Informe um valor acima de 0!");
		}
		return new SimularInvestimentoPoupancaWeb(navegador);
	}
	
	public void clicarBotaoMesAno(int tipoPrazo) {
		
		System.out.println("Escolhendo o Tipo de Prazo...");
		
		if(tipoPrazo == 1) {
			navegador.findElement(By.xpath("//a[@class='btSelect']")).click();
			navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			navegador.findElement(By.xpath("//a[contains(text(),'Meses')]")).click();	
		}
		else if(tipoPrazo == 2) {
			navegador.findElement(By.xpath("//a[@class='btSelect']")).click();
			navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			navegador.findElement(By.xpath("//a[contains(text(),'Anos')]")).click();	
		}
		else {
			System.out.println("Informe por número o Mẽs ou o Ano desejado!");
		}
		
	}
	
	public SimularInvestimentoPoupancaWeb clicarBotaoSimular() {
		
		System.out.println("Clicando no Botão Simular...");
		
		navegador.findElement(By.xpath("//button[@class='btn btnAmarelo btnSimular']")).click();
		return new SimularInvestimentoPoupancaWeb(navegador);
		
	}
	
	public SimularInvestimentoPoupancaWeb clicarBotaoRefazerSimulacao() {
		
		System.out.println("Clicando no Botão Refazer Simulado...");
		
		navegador.findElement(By.xpath("//a[@class='btn btnAmarelo btnRefazer']")).click();
		return new SimularInvestimentoPoupancaWeb(navegador);
		
	}
	
	public void clicarLinkLimparFormulario() {
		
		System.out.println("Clicando no Link Limpar Formulário...");
		
		navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		navegador.findElement(By.xpath("//a[@class='btn btnLimpar']")).click();
		
	}
	
	public SimularInvestimentoPoupancaWeb validarValorAplicadoMaiorOuIgualValorMinimo(String mensagemAdvertencia) {
		
		System.out.println("Validando o Valor Aplicado é maior ou igual ao Valor Mínimo...");

		if(mensagemAdvertencia.isEmpty()) {
			System.out.println("Não tem mensagem de advertência para verificar!");
		}
		else {
			String mensagemAdvertenciaValorMinimo = navegador.findElement(By.xpath("//label[@id='valorAplicar-error']")).getText();
			Assert.assertEquals("Valor Mínimo para Aplicação: ", mensagemAdvertencia, mensagemAdvertenciaValorMinimo);
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		return new SimularInvestimentoPoupancaWeb(navegador);
	}
	
	public SimularInvestimentoPoupancaWeb validarValorPoupadoMaiorOuIgualValorMinimo(String mensagemAdvertencia) {
		
		System.out.println("Validando o Valor Poupado é maior ou igual ao Valor Mínimo...");

		if(mensagemAdvertencia.isEmpty()) {
			System.out.println("Não tem mensagem de advertência para verificar!");
		}
		else {
			String mensagemAdvertenciaValorMinimo = navegador.findElement(By.xpath("//label[@id='valorInvestir-error']")).getText();
			Assert.assertEquals("Valor Mínimo para Poupança: ", mensagemAdvertencia, mensagemAdvertenciaValorMinimo);
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		return new SimularInvestimentoPoupancaWeb(navegador);	
	}
	
	public SimularInvestimentoPoupancaWeb validarQuantidadeMesesOuAnos(String mensagemAdvertencia) {
		
		System.out.println("Validando o Tipo do Prazo...");
		
		if(mensagemAdvertencia.isEmpty()) {
			System.out.println("Não tem mensagem de advertência para verificar!");
		}
		else {
			String mensagemAdvertenciaValorMinimo = navegador.findElement(By.xpath("//label[@id='tempo-error']")).getText();
			Assert.assertEquals("Valor Mínimo para Poupança: ", mensagemAdvertencia, mensagemAdvertenciaValorMinimo);
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		return new SimularInvestimentoPoupancaWeb(navegador);
	}
	
	public SimularInvestimentoPoupancaWeb validarMensagemSucessoInvestimento() {
		
		String resultadoSimulado = navegador.findElement(By.xpath("//div[@class='blocoResultadoSimulacao']")).getText();
		if(resultadoSimulado.isEmpty()) {
			System.out.println("Não teve resultado do Simulado!");
		}
		else {
			System.out.println(resultadoSimulado);
			return new SimularInvestimentoPoupancaWeb(navegador);
		}	
		return new SimularInvestimentoPoupancaWeb(navegador);
	}
	
	public SimularInvestimentoPoupancaWeb validarMensagemSucessoInvestimento(String mensagemSucessoInvestimento) {
		
		System.out.println("Validando a Mensagem de Sucesso do Investimento...");
		
		if(mensagemSucessoInvestimento.isEmpty()) {
			System.out.println("Não tem mensagem de sucesso de investimento para verificar!");
		}
		else {
			String mensagemSucessoInvestimentoParametro = navegador.findElement(By.xpath("//span[@class='texto']")).getText();
			Assert.assertEquals("Valor do Investimento: ", mensagemSucessoInvestimento, mensagemSucessoInvestimentoParametro);
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		return new SimularInvestimentoPoupancaWeb(navegador);
	}
	
	public SimularInvestimentoPoupancaWeb validarValorFinalInvestimento(String valorFinalInvestimento) {
		
		System.out.println("Validando o Valor Total Investido...");

		if(valorFinalInvestimento.isEmpty()) {
			System.out.println("Não tem dado para verificar!");
		}
		else {
			String valorFinalInvestimentoAtual = navegador.findElement(By.xpath("//span[@class='valor']")).getText();
			Assert.assertEquals("Valor Total Investido: ", valorFinalInvestimento, valorFinalInvestimentoAtual);
			return new SimularInvestimentoPoupancaWeb(navegador);
		}
		return new SimularInvestimentoPoupancaWeb(navegador);
	}

}