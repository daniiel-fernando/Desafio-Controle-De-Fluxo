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
   
   Saída: Imprimindo número: 1
          Imprimindo número: 2
          Imprimindo número: 3
          Imprimindo número: 4
          Imprimindo número: 5
          Imprimindo número: 6
          Imprimindo número: 7
          Imprimindo número: 8
          Imprimindo número: 9
          Imprimindo número: 10
          Imprimindo número: 11
          Imprimindo número: 12
          Imprimindo número: 13
          Imprimindo número: 14
          Imprimindo número: 15
          Imprimindo número: 16
          Imprimindo número: 17
          Imprimindo número: 18

2. Entrada:
- Primeiro parâmetro: `25`
- Segundo parâmetro: `20`

Saída: O segundo parâmetro deve ser maior que o primeiro

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

