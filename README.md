# 🦜 Parrot Refactoring Kata - Java

Este projeto é baseado no exercício didático "Parrot Refactoring Kata", que simula a refatoração de uma classe com múltiplas responsabilidades e baixa coesão.

## Como rodar os testes

```bash
mvn test
```

## Melhorias Realizadas
Questão 1 - Verificação Inicial
Clonado o projeto original.

Testes executados com sucesso usando JUnit.

## Questão 2 - Reestruturação de Métodos
Método getSpeed() dividido em três métodos claros para cada tipo de papagaio.

## Questão 3 - Clareza com Variáveis
Remoção de duplicações e uso de variáveis com nomes claros como baseSpeed, load, maxSpeed.

## Questão 4 - Encapsulamento
Criada a classe ParrotAttributes para agrupar os dados ao invés de múltiplos parâmetros soltos.

## Questão 5 - Reorganização com Polimorfismo
Transformado o design para orientação a objetos com subclasses específicas, eliminando switch e enum centralizador.