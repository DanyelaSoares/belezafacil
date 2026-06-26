# Beleza Fácil — App Mobile de Agendamento para Salões

![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-green?style=for-the-badge)

O **Beleza Fácil** é um aplicativo mobile desenvolvido para facilitar o agendamento de serviços em salões de beleza. A plataforma permite que clientes visualizem serviços disponíveis, realizem agendamentos e acompanhem seus atendimentos de forma simples e prática.

---

## 🧠 Visão do Projeto

O projeto foi idealizado para solucionar problemas comuns enfrentados por salões e clientes, como dificuldades de agendamento, controle de horários e organização dos atendimentos.

O aplicativo busca oferecer uma experiência intuitiva para os clientes e uma gestão mais eficiente dos serviços oferecidos.

---

## 🎯 Objetivo do Projeto

Este projeto tem como foco a prática de:

* Desenvolvimento Mobile
* Desenvolvimento Backend
* APIs REST
* Autenticação com JWT
* Banco de Dados Relacional
* Testes de API
* Modelagem de Dados
* Versionamento com Git e GitHub

---

## 📱 Funcionalidades da Versão 1 (MVP)

### Clientes

* Cadastro de usuário
* Login seguro
* Visualização de serviços disponíveis
* Agendamento de serviços
* Consulta de agendamentos
* Cancelamento de agendamentos

---

## 🚀 Tecnologias Utilizadas

### Mobile

* React Native
* Expo
* TypeScript

### Backend

* Java 17
* Spring Boot
* Spring Security
* JWT
* JPA / Hibernate

### Banco de Dados

* MySQL

### Ferramentas

* Git
* GitHub
* Postman
* MySQL Workbench

---

## 🗄 Modelo de Dados

### 📌 Entidade User

| Campo | Tipo   |
| ----- | ------ |
| id    | Long   |
| nome  | String |
| email | String |
| senha | String |

---

### 📌 Entidade Service

| Campo          | Tipo    |
| -------------- | ------- |
| id             | Long    |
| nome           | String  |
| descricao      | String  |
| preco          | Decimal |
| duracaoMinutos | Integer |

---

### 📌 Entidade Appointment

| Campo    | Tipo          |
| -------- | ------------- |
| id       | Long          |
| dataHora | LocalDateTime |
| status   | Enum          |
| user     | User          |
| service  | Service       |

---

## 📌 Escopo Futuro

Funcionalidades previstas para próximas versões:

* Cadastro de profissionais
* Especialidades dos profissionais
* Pagamentos
* Histórico de atendimentos
* Avaliações dos serviços
* Notificações de agendamento
* Relatórios gerenciais

---
## 📈 Status do Projeto

Em fase inicial de modelagem e desenvolvimento.

---
## ▶️ Como executar

### Backend

```bash
# Clonar o repositório
git clone https://github.com/DanyelaSoares/BelezaFacil.git

# Entrar na pasta do projeto
cd BelezaFacil

# Executar a aplicação Spring Boot
./mvnw spring-boot:run
```

### Mobile

> Em desenvolvimento.

## 👩‍💻 Autoria

**Daniela Soares**

Estudante de Engenharia de Software e Analista de Sistemas.
