# Contas

Projeto Java simples para gerenciar clientes e suas compras.

## O que faz

O programa permite:

- criar um cliente
- adicionar 10 clientes automaticamente
- listar todos os clientes
- exibir o cliente que fez mais compras
- exibir o cliente que fez menos compras
- calcular a média de compras dos clientes
- autenticar um cliente por nome e senha

## Estrutura do projeto

- `contas/Main.java` — classe principal com o menu de interação
- `contas/db/ClientesDB.java` — armazenamento em memória e operações sobre clientes
- `contas/models/Cliente.java` — modelo de cliente
- `contas/models/Autenticador.java` — interface funcional para autenticação

## Requisitos

- Java 8 ou superior

## Como compilar e rodar

1. Abra o terminal na pasta `contas`:

```powershell
cd d:\Estudos\programacao\java_studies\contas
```

2. Compile os arquivos Java:

```powershell
javac db\ClientesDB.java models\Cliente.java models\Autenticador.java Main.java
```

3. Execute o programa:

```powershell
java Main
```

## Observações

- Os dados são mantidos apenas em memória durante a execução.
- A autenticação compara a senha informada com a senha armazenada no cliente.
