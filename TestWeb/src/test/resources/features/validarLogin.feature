#language: pt
@CenariosLogin
Funcionalidade: validar cenarios de login
  Contexto: 
    Dado que eu acesse a tela de login

	@loginBranco
  Cenario: Login em branco
    Quando eu clicar em Sign in
    Entao devo validar o erro retornado
  
  @loginInvalido 
  Esquema do Cenario: Login invalido
		Quando eu inserir um email <email> e senha <senha> invalidos
		Entao deve retornar um erro de autenticacao
		Exemplos:
		|email					| senha	|
		|teste@teste.com| 12345 |
		    	
  @loginValido
  Esquema do Cenario: Login invalido
		Quando eu inserir um email <email> e senha <senha> validos
		Entao o login deve ser realizado com sucesso
		Exemplos:
		|email					| senha	|
		|teste@teste.com| 123456|