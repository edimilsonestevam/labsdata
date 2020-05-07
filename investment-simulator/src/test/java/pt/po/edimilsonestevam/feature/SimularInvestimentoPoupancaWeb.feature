#language: pt

@cenario
Funcionalidade: Simulador Investimento Poupanca
  Eu quero fazer um investimento na Poupanca

  @cenario-simulador-investimento-poupanca
  Esquema do Cenario: 
    Dado eu estou na pagina do Simulador de Investimento <url>
    Quando eu informo o perfil <perfil>
    E eu informo o valor a ser aplicado <valorAplicado>, o valor a ser poupado <valorPoupado>, a quantidade de meses ou anos <quantidadeMesesOuAnos>, o tipo do prazo <tipoPrazo>
    E eu confirmo a operacao <mensagemAdvertencia>
    Entao o sistema apresenta uma mensagem <mensagemSucessoInvestimento>

    Exemplos: 
      | url                                                                   | perfil | valorAplicado | valorPoupado | quantidadeMesesOuAnos | tipoPrazo | valorFinal | mensagemAdvertencia              | mensagemSucessoInvestimento       |
      | "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/" | 1      | 1900          | 2000         | 12                    | 2         |            |"Valor mínimo de 20.00"           |                                   |
      | "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/" | 1      | 1900          | 1900         | 12                    | 2         |            |"Valor mínimo de 20.00"           |                                   |
      | "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/" | 1      | 2000          | 1900         | 12                    | 2         |            |"Valor mínimo de 20.00"           |                                   |
      | "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/" | 1      | 2000          | 2000         | 12                    | 2         | 3402       |                                  | "Em 144 meses você terá guardado" |
      | "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/" | 1      | 2100          | 2100         | 12                    | 2         | 3572       |                                  | "Em 144 meses você terá guardado" |
      | "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/" | 1      | 2000          | 2000         |                       | 2         |            |"Obrigatório"                     |                                   |
      | "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/" | 1      | 2000          | 2000         | 0                     | 2         |            |"Valor esperado não confere"      |                                   |
      | "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/" | 1      | 2000          | 2000         | -1                    | 2         |            |"Valor esperado não confere"      |                                   |
      | "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/" | 1      | 2000          | 2000         | 999                   | 2         |            |"Valor esperado não confere"      |                                   |
      
      