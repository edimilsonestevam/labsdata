package pt.po.edimilsonestevam.integration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PesquisaArquivoUFTResultado {
	
	public void buscarCampoName(String diretorioEntradaArquivoUFT, String diretorioSaidaArquivoUFT) {  
		
		 System.out.println("• Buscando o campo Name...");
		 
		   try {  
			  File arquivoEntrada = new File(diretorioEntradaArquivoUFT); 
		      Scanner leitura = new Scanner(arquivoEntrada); 
		      PrintWriter escrita = new PrintWriter(new FileWriter(diretorioSaidaArquivoUFT));   
		      
		      while (leitura.hasNextLine()) { 
		         String linha = leitura.nextLine();   
		        
		         if (linha.contains("<Name>") && !linha.contains("<Name><![")) {
		        	 escrita.write(linha + "\n");
		         } 
		      }   
		      escrita.flush();
		      leitura.close();   
		      escrita.close();   
		   } catch (IOException e) {
			   e.getMessage();
		   }   
		} 
	
	public void buscarCampoResult(String diretorioEntradaArquivoUFT, String diretorioSaidaArquivoUFT) { 
		
		 System.out.println("• Buscando o campo Result...");
		 
		   try {  
			  File arquivoEntrada = new File(diretorioEntradaArquivoUFT); 
		      Scanner leitura = new Scanner(arquivoEntrada); 
		      PrintWriter escrita = new PrintWriter(new FileWriter(diretorioSaidaArquivoUFT));   
		      
		      while (leitura.hasNextLine()) { 
		         String linha = leitura.nextLine();   
		        
		         if (linha.contains("<Result>")) {
		        	 escrita.write(linha + "\n");
		         } 
		      }   
		      escrita.flush();
		      leitura.close();   
		      escrita.close();   
		   } catch (IOException e) {
			   e.getMessage();
		   }   
		} 
	
	public void buscarCampoStartTime(String diretorioEntradaArquivoUFT, String diretorioSaidaArquivoUFT) { 
		
		 System.out.println("• Buscando o campo StartTime...");
		 
		   try {  
			  File arquivoEntrada = new File(diretorioEntradaArquivoUFT); 
		      Scanner leitura = new Scanner(arquivoEntrada); 
		      PrintWriter escrita = new PrintWriter(new FileWriter(diretorioSaidaArquivoUFT));   
		      
		      while (leitura.hasNextLine()) { 
		         String linha = leitura.nextLine();   
		        
		         if (linha.contains("<StartTime>")) {
		        	 escrita.write(linha + "\n");
		         } 
		      }   
		      escrita.flush();
		      leitura.close();   
		      escrita.close();   
		   } catch (IOException e) {
			   e.getMessage();
		   }   
		} 
	
	public void buscarCampoDuration(String diretorioEntradaArquivoUFT, String diretorioSaidaArquivoUFT) {  
		
		 System.out.println("• Buscando o campo Duration...");
		 
		   try {  
			  File arquivoEntrada = new File(diretorioEntradaArquivoUFT); 
		      Scanner leitura = new Scanner(arquivoEntrada); 
		      PrintWriter escrita = new PrintWriter(new FileWriter(diretorioSaidaArquivoUFT));   
		      
		      while (leitura.hasNextLine()) { 
		         String linha = leitura.nextLine();   
		        
		         if (linha.contains("<Duration>")) {
		        	 escrita.write(linha + "\n");
		         } 
		      }   
		      escrita.flush();
		      leitura.close();   
		      escrita.close();   
		   } catch (IOException e) {
			   e.getMessage();
		   }   
		}

	public void converterCampoName(String diretorioSaidaArquivoUFT, String diretorioSaidaArquivoUFTAlterado) { 
		
		 System.out.println("• Convertendo o campo Name...");
		 
		   try {  
			  File arquivoEntrada = new File(diretorioSaidaArquivoUFT); 
		      Scanner leitura = new Scanner(arquivoEntrada); 
		      PrintWriter escrita = new PrintWriter(new FileWriter(diretorioSaidaArquivoUFTAlterado));   
		      
		      String conteudoInicioAntigo = "<Name>";
		      String conteudoFimAntigo = "</Name>";
		      String conteudoInicioNovo = "<kw name=\"";
		      String conteudoFimNovo = "\" library=\"LLKW\">";
		      
		      while (leitura.hasNextLine()) { 
		         String linha = leitura.nextLine();   
		        
		         if (linha.contains("<Name>") && linha.contains("</Name>")) {
		        	 String linhaInicioNova = linha.replaceAll(conteudoInicioAntigo, conteudoInicioNovo);
		        	 String linhaFimNova = linhaInicioNova.replaceAll(conteudoFimAntigo, conteudoFimNovo);
		        	 escrita.write(linhaFimNova + "\n");
		         } 
		         
		      }   
		      escrita.flush();
		      leitura.close();   
		      escrita.close();   
		   } catch (IOException e) {
			   e.getMessage();
		   }   
		} 
	
	public void converterCampoResult(String diretorioSaidaArquivoUFT, String diretorioSaidaArquivoUFTAlterado) { 

		 System.out.println("• Convertendo o campo Result...");
		 
		   try {  
			  File arquivoEntrada = new File(diretorioSaidaArquivoUFT); 
		      Scanner leitura = new Scanner(arquivoEntrada); 
		      PrintWriter escrita = new PrintWriter(new FileWriter(diretorioSaidaArquivoUFTAlterado));   
		      
		      String conteudoResultadoPositovoAntigo = "<Result>Done</Result>";
		      String conteudoResultadoPositovoNovo = "<status status=\"PASS\"";
		      String conteudoResultadoNegativoAntigo = "<Result>Failed</Result>";
		      String conteudoResultadoNegativoNovo = "<status status=\"FAIL\"";
		      
		      while (leitura.hasNextLine()) { 
		         String linha = leitura.nextLine();   
		        
		         if (linha.contains("Done") || linha.contains("Failed")) {
		        	 String linhaResultadoInicioNova = linha.replaceAll(conteudoResultadoPositovoAntigo, conteudoResultadoPositovoNovo);
		        	 String linhaResultadoFimNova = linhaResultadoInicioNova.replaceAll(conteudoResultadoNegativoAntigo, conteudoResultadoNegativoNovo);
		        	 escrita.write(linhaResultadoFimNova + "\n");
		         } 
		      }   
		      escrita.flush();
		      leitura.close();   
		      escrita.close();   
		   } catch (IOException e) {
			   e.getMessage();
		   }   
		} 

	public void converterCampoStartTime(String diretorioSaidaArquivoUFT, String diretorioSaidaArquivoUFTAlterado) { 

	 System.out.println("• Convertendo o campo StartTime...");
	 
	   try {  
		  File arquivoEntrada = new File(diretorioSaidaArquivoUFT); 
	      Scanner leitura = new Scanner(arquivoEntrada); 
	      PrintWriter escrita = new PrintWriter(new FileWriter(diretorioSaidaArquivoUFTAlterado));   
	      
	      String conteudoStartTimeInicioAntigo = "<StartTime>";
	      String conteudoStartTimeInicioNovo = "starttime=\"";      
	      String conteudoStartTimeFimAntigo = "</StartTime>";
	      String conteudoStartTimeFimNovo = ".000\"";
	      
	      while (leitura.hasNextLine()) { 
	         String linha = leitura.nextLine();   
	        
	         if (linha.contains("<StartTime>") || linha.contains("</StartTime>")) {
	        	 String linhaStartTimeInicioNova = linha.replaceAll(conteudoStartTimeInicioAntigo, conteudoStartTimeInicioNovo);
	        	 String linhaStartTimeFimNova = linhaStartTimeInicioNova.replaceAll(conteudoStartTimeFimAntigo, conteudoStartTimeFimNovo);
	        	 escrita.write(linhaStartTimeFimNova.replace( "-" , "") + "\n");
	         } 
	      }   
	      escrita.flush();
	      leitura.close();   
	      escrita.close();   
	   } catch (IOException e) {
		   e.getMessage();
	   }   
	} 
	
	public void converterCampoEndTime() {
		//ROBOT: endtime="20201125 11:33:10.645"
		
	}

}