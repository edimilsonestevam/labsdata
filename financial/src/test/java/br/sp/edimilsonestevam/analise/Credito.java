package br.sp.edimilsonestevam.analise;

public class Credito {

	public static String riscoDeAtrasoNoPagamento(String nome, int score) {
		
		String retorno = null;

		if(score >= 900 && score <= 1000) {
			retorno = nome + " tem um risco de atraso: Baixo";
		}
		else if(score >= 800 && score <= 899) {
			retorno = nome + " tem um risco de atraso: Baixo";
		}
		else if(score >= 700 && score <= 799) {
			retorno = nome + " tem um risco de atraso: Baixo";
		}
		else if(score >= 600 && score <= 699) {
			retorno = nome + " tem um risco de atraso: Médio";
		}
		else if(score >= 500 && score <= 599) {
			retorno = nome + " tem um risco de atraso: Médio";
		}
		else if(score >= 400 && score <= 499) {
			retorno = nome + " tem um risco de atraso: Alto";
		}
		else if(score >= 300 && score <= 399) {
			retorno = nome + " tem um risco de atraso: Alto";
		}
		else if(score >= 200 && score <= 299) {
			retorno = nome + " tem um risco de atraso: Muito Alto";
		}
		else if(score >= 100 && score <= 199) {
			retorno = nome + " tem um risco de atraso: Muito Alto";
		}
		else if(score >= 0 && score <= 99) {
			retorno = nome + " tem um risco de atraso: Muito Alto";
		}
		else {
			retorno = "Score informado está incorreto!";
		}
			return retorno;
	}
}
