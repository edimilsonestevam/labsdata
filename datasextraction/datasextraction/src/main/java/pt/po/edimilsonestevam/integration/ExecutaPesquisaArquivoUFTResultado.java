package pt.po.edimilsonestevam.integration;

public class ExecutaPesquisaArquivoUFTResultado {

	public static void main(String[] args) {
	
		PesquisaArquivoUFTResultado sistema = new PesquisaArquivoUFTResultado();
		sistema.buscarCampoName("C:/Users/edimilsonestevam/Downloads/diretorio/uft/entrada/run_results.xml", "C:\\Users\\edimilsonestevam\\Downloads\\diretorio\\uft\\saida\\output_uft_name.xml");
		sistema.buscarCampoResult("C:/Users/edimilsonestevam/Downloads/diretorio/uft/entrada/run_results.xml", "C:\\Users\\edimilsonestevam\\Downloads\\diretorio\\uft\\saida\\output_uft_result.xml");
		sistema.buscarCampoStartTime("C:/Users/edimilsonestevam/Downloads/diretorio/uft/entrada/run_results.xml","C:\\Users\\edimilsonestevam\\Downloads\\diretorio\\uft\\saida\\output_uft_starttime.xml");
		sistema.buscarCampoDuration("C:/Users/edimilsonestevam/Downloads/diretorio/uft/entrada/run_results.xml","C:\\Users\\edimilsonestevam\\Downloads\\diretorio\\uft\\saida\\output_uft_duration.xml");
		
		sistema.converterCampoName("C:/Users/edimilsonestevam/Downloads/diretorio/uft/saida/output_uft_name.xml","C:\\Users\\edimilsonestevam\\Downloads\\diretorio\\uft\\saida\\output_robot_name.xml");
		sistema.converterCampoResult("C:/Users/edimilsonestevam/Downloads/diretorio/uft/saida/output_uft_result.xml","C:\\Users\\edimilsonestevam\\Downloads\\diretorio\\uft\\saida\\output_robot_result.xml");
		sistema.converterCampoStartTime("C:/Users/edimilsonestevam/Downloads/diretorio/uft/saida/output_uft_starttime.xml","C:\\Users\\edimilsonestevam\\Downloads\\diretorio\\uft\\saida\\output_robot_starttime.xml");
		
	}

}
