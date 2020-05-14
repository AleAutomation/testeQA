#language: pt
Funcionalidade: Teste Alelo

  Esquema do Cenario: Pesquisar um CEP e dar output das informacoes retornadas
    Dado que eu faca uma pesquisa de cep ou endereco <endereco>
    Entao as informacoes devem retornar no console

    Exemplos: 
      | endereco    |
      |    79079185 |
      | Av Paulista |
