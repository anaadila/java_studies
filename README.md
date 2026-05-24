# Projeto Carro

Este é um projeto de estudo em Java que modela um carro simples e cadastra seus atributos via console.

## Estrutura

- `carro/src/Carro.java` - define a classe `Carro` com atributos como número de portas, chassi, ano de fabricação, tipo de combustível, cor, quantidade de pneus, calotas e parafusos.
- `carro/src/Main.java` - classe principal que lê dados do usuário, cria um objeto `Carro` e exibe as informações cadastradas.

## Como compilar e executar

Abra um terminal na pasta `carro` e execute:

```bash
javac src/Carro.java src/Main.java
java -cp src Main
```

## Demonstração de uso

O programa solicita:

1. Quantidade de portas
2. Número do chassi
3. Ano de fabricação
4. Tipo de combustível
5. Quantidade de pneus (sem o step)
6. Se deseja adicionar uma cor ao carro

Depois, exibe os dados do carro, incluindo a quantidade total de pneus com step, calotas e parafusos.

## Observações

- A quantidade de pneus registrada inclui o step automaticamente.
- A quantidade de parafusos é calculada como 4 parafusos por pneu.
- A cor é opcional e, se não fornecida, permanece como `Não definida`.
