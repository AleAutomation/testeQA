#language: pt
Funcionalidade: Validar criacao e exclusao de um empregado da API

  Cenario: Criar um empregado
    Dado que eu faca uma requisicao POST e cadastre um empregado
      | employee_name  | employee_salary | employee_age |
      | Zidane				 |         976542  |           45 |
    Quando eu consultar o id do empregado criado
    Entao eu devo deletar esse cadastro
