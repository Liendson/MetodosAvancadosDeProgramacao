# Métodos Avançados de Programação

## UNIESP Faculdades

### Professor(a)

* Drª Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno(a)

* Liendson Douglas ([liendsondouglas1@gmail.com](mailto:liendsondouglas1@gmail.com))

### Padrão Comportamental

* Interpreter

## Padrão Interpreter

### Problema

O Padrão Interpreter, tem a seguinte definição de problema:

>Dada uma linguagem, definir uma representação para sua gramática juntamente com um interpretador que usa a representação para interpretar sentenças dessa linguagem.”

Ou seja, dada a linguagem, números romanos, construir uma representação para a gramática dela junto com um interpretador para essa gramática.

A estrutura do padrão é muito parecido com a do padrão Composite , é definido inicialmente uma classe abstrata que será a base de todas as classes interpretadoras. Nela é construída a interface básica e o método de interpretar. Este método recebe como atributo um contexto, que é uma classe que vai armazenar as informações de entrada e saída.

### Solução

O Interpreter é um padrão responsável por criar interpretações de código, ou seja, passamos algo para ele e o mesmo será responsável por processar e interpretar nosso parâmetro.

Com ele, vamos criar nossas expressões e pedir para que realize a interpretação, ou seja, ele irá realizar o cálculo da expressão matemática passada.

### Consequências

Para gramáticas complexas, a hierarquia de classes se torna grande e incontrolável. Em tais casos, existem ferramentas melhores.

