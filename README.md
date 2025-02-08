# Desafio Controle de Fluxo - Java

Este projeto implementa um sistema simples de contagem de números inteiros com base em dois parâmetros fornecidos pelo usuário. O programa recebe dois números inteiros e imprime, na tela, a contagem de números que estão entre esses dois valores, desde que o segundo valor seja maior que o primeiro. Caso contrário, uma exceção personalizada será lançada.

## Funcionalidade

- O sistema recebe dois parâmetros (números inteiros) via terminal.
- Se o primeiro número for maior que o segundo, uma exceção personalizada chamada `ParametrosInvalidosException` é lançada.
- O sistema então imprime no console os números de 1 até a diferença entre o segundo e o primeiro número (inclusive).
  
### Exemplo

1. Entrada:
   - Primeiro parâmetro: `12`
   - Segundo parâmetro: `30`
   
   Saída:

2. Entrada:
- Primeiro parâmetro: `25`
- Segundo parâmetro: `20`

Saída:

## Estrutura do Projeto

O projeto contém duas classes principais:

- **Contador.java**: Classe responsável pela lógica de contagem e interação com o usuário.
- **ParametrosInvalidosException.java**: Exceção personalizada que é lançada quando o primeiro parâmetro é maior que o segundo.

## Como Rodar o Projeto

1. Clone este repositório para sua máquina.
2. Abra o terminal ou prompt de comando na pasta do projeto.
3. Compile o código utilizando o comando:
```bash
javac src/Contador.java src/ParametrosInvalidosException.java

java src.Contador

