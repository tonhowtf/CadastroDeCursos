
# 🎓 Cadastro de Cursos

<div align="center">
  <img src="CadastroDeCursos.png" alt="Logo do Projeto" width="200"/>
  <h3>Uma aplicação em Spring Boot para gerenciar cursos e professores</h3>
  <p>
    <img src="https://img.shields.io/badge/Spring_Boot-2.7.5-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
    <img src="https://img.shields.io/badge/H2-Database-4B8BBE?style=for-the-badge&logo=h2&logoColor=white" />
    <img src="https://img.shields.io/badge/Flyway-DB_Migration-C71A36?style=for-the-badge&logo=flyway&logoColor=white" />
    <img src="https://img.shields.io/badge/Maven-Build Tool-FF4C3B?style=for-the-badge&logo=apachemaven&logoColor=white" />
    <img src="https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge" />
  </p>
</div>

<br>

## 📋 Índice

- [Sobre](#-sobre)
- [Funcionalidades](#-funcionalidades)
- [Tecnologias](#-tecnologias)
- [Instalação](#-instalação)
- [Modelo de Dados](#-modelo-de-dados)
- [Repositório](#-repositório)
- [Licença](#-licença)

<br>

## 📖 Sobre

O **Cadastro de Cursos** é uma aplicação full stack com arquitetura em camadas desenvolvida com **Spring Boot**, voltada para o gerenciamento de cursos e seus respectivos professores. A aplicação utiliza um banco de dados em memória **H2**, com migrações gerenciadas pelo **Flyway**, e foi construída seguindo boas práticas como versionamento com **Git** e hospedagem no **GitHub**.

Além da funcionalidade de gerenciamento, o projeto também conta com conteúdos extras que abordam conceitos de banco de dados de forma aprofundada.

<br>

## ✨ Funcionalidades

- Cadastro de cursos com nome, descrição e carga horária
- Cadastro de professores com nome, idade e email
- Viculo de professores em cursos
- Cada curso pode ter vários professores
- Interface RESTful para interações via API
- Banco de dados em memória durante execução

<br>

## 🔧 Tecnologias

### Backend
- **Spring Boot** — Framework principal da aplicação
- **Spring Data JPA** — ORM para persistência no banco
- **Flyway** — Migrações de banco de dados
- **H2 Database** — Banco em memória para testes e dev
- **Maven** — Build e gerenciamento de dependências
- **Docker** — Containerização do ambiente
- **Git & GitHub** — Controle de versão e hospedagem

<br>

## 🚀 Instalação

### Pré-requisitos

- Java 17+
- Maven
- Git

### Passo a passo

```bash
# Clonar o repositório
git clone https://github.com/horaciomuller/CadastroDeCursos.git
cd CadastroDeCursos

# Construir o projeto
mvn clean install

# Executar a aplicação
mvn spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

<br>

## 🗃️ Modelo de Dados

O sistema possui dois principais modelos: **Curso** e **Professores**.

### Curso
- `id` (Long)
- `nome` (String)
- `categoria` (String)
- `habilidade` (String)
- `professor` (String)
- `horas` (int)

### Professor
- `id` (Long)
- `nome` (String)
- `telefone` (Integer)
- `email` (String)
- `Cursos` (String)

### Relacionamento
- Um **Curso** pode ter **vários Professores**
- Um **Professor** pode estar dando aula em **um único Curso**

<br>

## 📦 Repositório

O projeto está disponível no GitHub:

🔗 [Cadastro De Cursos](https://github.com/tonhowtf/CadastroDeCursos)

<br>

## 📜 Licença

Este projeto está licenciado sob a Licença MIT.

