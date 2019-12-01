package br.sp.edimilsonestevam.csv;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.sp.edimilsonestevam.analise.Credito;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class LiberacaoDeCreditoPorCSV {

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	public void validarLiberacaoDeCreditoPorCSV(String nome, int score, String resultado) {
		
		Assert.assertEquals(resultado, Credito.riscoDeAtrasoNoPagamento(nome, score));
		
	}
}
