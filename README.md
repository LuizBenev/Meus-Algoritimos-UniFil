# Sistema de Caixa de Supermercado em Java
Este projeto foi desenvolvido como parte da avaliação prática de **Lógica de Programação** do 1º ano (2º bimestre) de Ciência da Computação na **UniFil**. O objetivo é simular o fluxo de atendimento de um caixa, processando compras, aplicando regras de negócio para descontos e gerando um relatório final de fechamento.

## Funcionalidades
* **Entrada Dinâmica:** Coleta de dados do cliente, produto, valor unitário e quantidade.

* **Cálculo de Descontos Progressivos:**

* **Dinheiro:** 10% de desconto.

* **Pix:** 5% de desconto.

* **Cartão:** Valor integral.

* **Interface via Console:** Menu interativo para seleção da forma de pagamento.

* **Fechamento de Caixa:** Ao final de 3 atendimentos, o sistema exibe o total bruto, o total de descontos concedidos e a quantidade de vendas realizadas por método de pagamento.

## Conceitos Técnicos Aplicados
O código utiliza fundamentos essenciais da linguagem Java e da lógica de programação estruturada:

* **Entrada de Dados:** Uso da classe Scanner.

* **Tratamento de Dados:** Conversão de strings para tipos numéricos com Double.parseDouble e Integer.parseInt (evitando erros de buffer do teclado).

* **Estruturas de Repetição:** Laço for para processamento de múltiplos atendimentos.

* **Estruturas Condicionais:** Utilização de switch-case para lógica de menus e tratamento de opções inválidas (default).

* **Acumuladores:** Variáveis para somatória de totais e contadores para estatísticas de pagamento.

## Como executar o projeto
Certifique-se de ter o JDK instalado em sua máquina.

Faça o download ou clone este repositório.

Compile o arquivo:

```Bash
javac CAIXA_DE_SUPERMERCADO.java
```
Execute o programa:

```Bash
java CAIXA_DE_SUPERMERCADO
```
Este repositório serve como portfólio de evolução acadêmica, demonstrando a base sólida em algoritmos e a capacidade de resolver problemas lógicos reais.
