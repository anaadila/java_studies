# Produtos

Projeto em Java para gerenciar produtos, estoque, usuários e pedidos de venda.

## Estrutura do projeto

- `produtos/src/Main.java` - ponto de entrada da aplicação
- `produtos/src/db/` - classes de acesso a dados para estoque, pedidos, produtos e usuários
- `produtos/src/models/` - modelos de domínio como `Produto`, `Usuario`, `PedidoVenda`, `Estoque`, etc.
- `produtos/src/validadores/` - validações de pedidos, quantidades e datas

## Como compilar

No terminal, execute:

```powershell
javac produtos/src/**/*.java
```

> Dependendo da versão do PowerShell, pode ser necessário compilar os arquivos em etapas ou dentro de um `for`.

## Como executar

```powershell
java -cp produtos/src Main
```

## Observações

- Ajuste o caminho se o pacote `Main` estiver dentro de um `package`.
- Esta aplicação parece usar um design simples baseado em classes de domínio, banco de dados em memória e validadores.
