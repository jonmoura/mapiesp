# Padrão de Projeto: Composite

Centro Universitário UNIESP

Professora: Drª Alana Morais (alanamm.prof@gmail.com)

Aluno: Jonathan Soares de A. Moura (jonathansamoura@gmail.com)

Nome: 

O padrão Composite tem como principal objetivo compor objetos em estrutura em árvore para que se possa trabalhar individualmente com cada objeto.
Seu principal destaque está na capacidade de executar vários métodos dentro de uma estrutura e obter um resultado geral.


Problema: 

Se trata de um padrão de projeto estrutural que lida com a composição de classes ou objetos. 
Neste caso, o Composite possui sub-elementos que trabalham para ele através de uma interface que contém operações comuns a vários tipos de classes. 
Em outras palavras, o Composite delega o trabalho para os componentes filhos (classes) que estão associadas com uma interface. 
Este tipo de situação pode ser associado com a estrutura de uma árvore. 
Por exemplo, dado dois objetos criados, um pode ser elemento do outro ou estarem contidos e vice-versa. 
Desta forma, dimensionar a composição desta estrutura de objetos será papel do Composite.

Solução: 

Quando temos uma interface como referência para dois objetos é possível executar um método que traga um resultado comum para toda a estrutura. 
Sendo assim, dada a criação de um ou mais objetos associados entre si, o Composite utiliza a interface para retornar todas as operações possíveis.

![alt text](https://refactoring.guru/images/patterns/diagrams/composite/structure-pt-br.png)

Consequências: 

O padrão Composite pode trazer vantagens e desvantagens em sua aplicação. 
A primeira vantagem se refere a não preocupação com as classes concretas dos objetos, pois não importa se um objeto é simples ou complexo quando no final todos serão tratados pela mesma interface. 
A segunda vantagem é a capacidade de serem acrescentados novos elementos sem quebrar o código atual. 
Por outro lado, o Composite possui uma grande desvantagem que é a dificuldade de se criar uma interface comum para classes com funcionalidades muito diferentes entre si.

