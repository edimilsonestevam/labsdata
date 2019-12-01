package br.sp.edimilsonestevam.parametrizado;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import br.sp.edimilsonestevam.analise.Credito;

@RunWith(Parameterized.class)
public class LiberacaoDeCreditoPorParametro {

	@Parameter(0) public String nome;
	@Parameter(1) public int score;
	@Parameter(2) public String resultado;
	
	@Test
	public void validarLiberacaoDeCreditoPorDDT() {
		
		Assert.assertEquals(resultado, Credito.riscoDeAtrasoNoPagamento(nome, score));
		
	}
	
	@Parameters(name  = "{0} | {1} | {2}")
	public static Collection<Object[]> data(){
		
		return Arrays.asList(new Object[][] {
			{"Camila", 901, "Camila tem um risco de atraso: Baixo"},
			{"Jessica", 801, "Jessica tem um risco de atraso: Baixo"},
			{"Amanda", 701, "Amanda tem um risco de atraso: Baixo"},
			{"Marcela", 601, "Marcela tem um risco de atraso: Médio"},
			{"Beatriz", 501, "Beatriz tem um risco de atraso: Médio"},
			{"Aline", 401, "Aline tem um risco de atraso: Alto"},
			{"Eduarda", 301, "Eduarda tem um risco de atraso: Alto"},
			{"Monica", 201, "Monica tem um risco de atraso: Muito Alto"},
			{"Renata", 101, "Renata tem um risco de atraso: Muito Alto"},
			{"Caroline", 11, "Caroline tem um risco de atraso: Muito Alto"},
		});
		
	}
}
