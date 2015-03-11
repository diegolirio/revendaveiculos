#Universidade Nove de Julho
##Ciência da Computação

###### Diego Lirio Damacena   Pereira
###### Tatiane Santos da Silva

## Mapeamento Objeto Relacional

###### Orientador: Prof. Dr. Ovidio

###### São Paulo @2014-2015

Projeto Conclusão de Curso

> O projeto de conclusão de curso tem como objetivo resolver os problemas de paradigma **objeto-relacional**, utilizando tecnologias de ponta como framework **Mapenamento Objeto Relacional** conhecimento pela sigla ORM - Object Relational Mapping, especificamente para este projeto utilizaremos como exemplo o framework Hibernate da linguagem Java, no projeto descrito será citado alguns outros como eclipseLink, o DJango (da linguagem python) que também tem outras funcionalidades como MVC, NHibernate (C#) e outros...

# Tecnologias utilizadas

- Java 7
- Mysql
- Postgre
- Oracle
- Spring MVC
- Spring Security
- Spring IoC ID
- JPA e Hibernate (principal assunto)
- Bootstrap (template html)
- AngularJS (framework para fornt-end client-side)
- Tomcat 8 (servidor de aplicação)

# Arquitetura do projeto.

###### Back-end
- MVC (Spring)
  - view ==> controller ==> service ==> dao ==> database

###### Front-end
- MVC (AngularJS)
  - html ==> controller ==> service ==> Back-end 
  
#Revenda de Veiculos
###### Aplicação

> A aplicação será uma aplicação web simples, trata-se de um website de loja de veículos, onde o cliente poderá entrar na página web e ver os veículos disponiveis a venda, selecionar o veículo desejado e preencher uma ficha para analise. O funcionário da Empresa de veículos receberá as informações da ficha enviada, podendo atualizar o Estado da ficha para "Em andamento/Em analise com a financiadora/Reprovada/Aprovada".


## Passos para apresentação

1. TODO

# Alteracoes de BD

- persistence.xml add o persistence-unit do BD
- servlet-context.xml add o DataSource do BD
- AbstractGenericDao no @PersistenceContext(unitName="mysql_r") do EntityManager
- alterar o unitName para o nome do persistence.xml adicionado! 
