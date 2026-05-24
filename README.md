# Banco Java

Projeto simples de simulação de banco em Java.

## Visão geral

Esta aplicação em Java implementa um sistema bancário de linha de comando que permite:

- cadastrar contas de diferentes tipos
- listar contas
- realizar operações financeiras (saque, depósito, transferência)
- visualizar saldo total por categoria de banco

## Tipos de conta suportados

- `ContaCorrente` (conta corrente)
- `ContaPoupanca` (conta poupança)
- `ContaSalario` (conta salário)

## Estrutura do projeto

- `banco/Main.java` - ponto de entrada da aplicação e menu interativo
- `banco/db/ContasDB.java` - banco de dados simples para contas de bancos diferentes de `Adila`
- `banco/models/` - classes de domínio:
  - `Banco.java`
  - `Cliente.java`
  - `Conta.java`
  - `ContaCorrente.java`
  - `ContaPoupanca.java`
  - `ContaSalario.java`
  - `TipoConta.java`
  - `Tributavel.java`

## Como compilar

Abra um terminal na pasta raiz do projeto (`d:\Estudos\programacao\java_studies`) e execute:

```powershell
javac banco\Main.java banco\db\ContasDB.java banco\models\*.java
```

## Como executar

Ainda na pasta raiz do projeto, execute:

```powershell
java -cp banco Main
```

## Uso

Ao iniciar, o menu apresenta as opções:

1. Cadastrar Conta Corrente
2. Cadastrar Conta Poupança
3. Cadastrar Conta Salário
4. Listar Contas
5. Fazer operação com conta
6. Admin
0. Sair

### Operações disponíveis

- Saque
- Depósito
- Transferência
- Visualizar saldo total do Banco Ádila
- Visualizar saldo total dos demais bancos

## Observações

- Contas do banco `Adila` são armazenadas na classe `Banco`.
- Contas de outros bancos são armazenadas em `ContasDB`.
- A `ContaCorrente` aplica imposto sobre saldo e tem cheque especial.
- A `ContaPoupanca` aplica juros e usa data de aniversário para aumento de limite de saque.
- A `ContaSalario` permite até 3 saques e aplica imposto sobre o saldo.
