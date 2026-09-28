# Beleza Fácil — Sistema Web de Agendamento para Salões

![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-green?style=for-the-badge)

O **Beleza Fácil** é um sistema web de agendamento desenvolvido para facilitar o gerenciamento de salões de beleza e proporcionar uma experiência simples para clientes e profissionais.

A cliente pode acessar o sistema por meio de um link, criar sua conta, consultar os serviços disponíveis, escolher a profissional, selecionar uma data e horário e acompanhar seus agendamentos.

O sistema também contará com integração com o **WhatsApp** para envio de lembretes e comunicações relacionadas aos agendamentos.

---

## 🧠 Visão do Projeto

O projeto foi idealizado para solucionar problemas comuns na organização de salões de beleza, como:

- Controle de horários;
- Conflitos entre agendamentos;
- Gerenciamento de profissionais;
- Controle dos serviços oferecidos;
- Cancelamentos e reagendamentos;
- Acompanhamento do histórico das clientes;
- Comunicação com clientes sobre seus agendamentos.

O sistema possui diferentes perfis de acesso, permitindo que clientes gerenciem seus próprios dados e agendamentos, enquanto a administradora do salão possui controle sobre profissionais, serviços e disponibilidade da agenda.

---

## 🎯 Objetivo do Projeto

O projeto tem como objetivos:

- Desenvolver uma aplicação web responsiva;
- Praticar desenvolvimento de APIs REST;
- Implementar regras de negócio para agendamento;
- Trabalhar com autenticação e autorização;
- Desenvolver modelagem de banco de dados relacional;
- Implementar controle de disponibilidade de horários;
- Praticar testes de API e testes automatizados;
- Trabalhar com integração entre sistemas;
- Utilizar boas práticas de desenvolvimento e versionamento com Git e GitHub.

---

# 👩‍💼 Perfis de Usuário

O sistema possui dois perfis principais:

### Cliente

A cliente poderá:

- Criar sua conta;
- Fazer login;
- Alterar seus dados cadastrais;
- Alterar nome, telefone, endereço e e-mail;
- Alterar sua senha;
- Consultar serviços disponíveis;
- Escolher uma profissional;
- Escolher data e horário;
- Realizar agendamentos;
- Consultar seus próximos agendamentos;
- Consultar seu histórico;
- Reagendar atendimentos;
- Cancelar agendamentos com antecedência mínima de 24 horas.

### Administradora do Salão

A administradora terá acesso às funções de gerenciamento do salão.

Ela poderá:

- Cadastrar profissionais;
- Alterar profissionais;
- Ativar ou inativar profissionais;
- Cadastrar serviços;
- Alterar serviços;
- Alterar preços;
- Alterar duração dos serviços;
- Fechar datas para agendamento;
- Abrir datas novamente;
- Bloquear horários;
- Liberar horários;
- Gerenciar agendamentos;
- Cancelar agendamentos;
- Acompanhar os atendimentos realizados;
- Consultar informações gerenciais.

---

# 📅 Regras de Agendamento

O sistema deverá verificar a disponibilidade antes de permitir um novo agendamento.

A disponibilidade será calculada considerando:

- Profissional selecionada;
- Serviço escolhido;
- Data;
- Horário;
- Duração do serviço;
- Outros agendamentos existentes;
- Horários bloqueados;
- Datas fechadas pela administradora.

### Exemplo

Um serviço de **Mão** possui duração de 30 minutos.

Se existir um agendamento:

**15:30 → 16:00**

o sistema não poderá permitir que outro serviço com duração de 1 hora seja iniciado às 15:00, pois haveria conflito de horários.

Nesse caso, o sistema deverá apresentar outro horário disponível.

---

# 💅 Serviços

Os serviços são previamente cadastrados pela administradora do salão.

Cada serviço possui informações como:

- Nome;
- Descrição;
- Preço;
- Duração;
- Profissionais habilitadas para realizá-lo;
- Status de disponibilidade.

Exemplo:

| Serviço | Duração |
|---|---:|
| Mão | 30 minutos |
| Pé | 30 minutos |
| Pé + Mão | 1 hora |

O serviço **Pé + Mão** é cadastrado como um serviço próprio de 1 hora.

A cliente não monta combinações de serviços durante o agendamento. Ela escolhe entre os serviços disponibilizados pelo salão.

---

# 👩‍🦰 Profissionais

As profissionais são cadastradas previamente pela administradora.

A administradora poderá:

- Cadastrar profissionais;
- Alterar seus dados;
- Ativar ou inativar profissionais;
- Definir quais serviços cada profissional pode realizar.

Durante o agendamento, a cliente poderá escolher a profissional que deseja para o serviço selecionado.

---

# ⏰ Controle de Disponibilidade

A administradora poderá controlar a disponibilidade da agenda.

Será possível:

- Fechar uma data inteira;
- Bloquear determinados horários;
- Liberar horários anteriormente bloqueados.

O sistema deverá considerar esses bloqueios juntamente com os agendamentos existentes ao calcular os horários disponíveis.

---

# ❌ Cancelamento e Reagendamento

### Cliente

A cliente poderá cancelar seu próprio agendamento somente com **24 horas ou mais de antecedência**.

Após esse prazo, o cancelamento não poderá ser realizado pela cliente através do sistema.

### Administradora

A administradora poderá cancelar um agendamento a qualquer momento.

O sistema também permitirá o reagendamento conforme as regras de disponibilidade e antecedência definidas para o atendimento.

---

# 📱 WhatsApp

O sistema deverá utilizar o WhatsApp como canal de comunicação com as clientes.

Entre as funcionalidades previstas estão:

- Lembretes de agendamento;
- Confirmação de atendimento;
- Comunicação sobre alterações;
- Acesso rápido ao sistema para cancelamento ou reagendamento.

O WhatsApp será utilizado como meio de comunicação, enquanto o gerenciamento dos agendamentos permanecerá na aplicação web.

---

# 🗄️ Modelo de Dados

As principais entidades previstas para o sistema são:

### 📌 Client

Representa a cliente cadastrada no sistema.

Principais informações:

- id
- nome
- telefone
- endereço
- e-mail
- senha
- status
- data de cadastro

### 📌 Professional

Representa uma profissional do salão.

Principais informações:

- id
- nome
- telefone
- status

### 📌 Service

Representa um serviço oferecido pelo salão.

Principais informações:

- id
- nome
- descrição
- preço
- duração
- status

### 📌 Appointment

Representa um agendamento.

Principais informações:

- id
- cliente
- profissional
- serviço
- data
- horário
- status
- informação de execução

### 📌 ScheduleBlock

Representa um período bloqueado pela administradora.

Principais informações:

- id
- profissional
- data
- horário inicial
- horário final
- motivo
- status

---

# 🔐 Segurança

O sistema contará com autenticação e autorização para controlar o acesso às funcionalidades.

As permissões serão determinadas de acordo com o perfil do usuário.

### Cliente

A cliente poderá acessar e alterar somente seus próprios dados e agendamentos.

### Administradora

A administradora terá acesso às funcionalidades de gerenciamento do salão.

---

# 🚀 Tecnologias Utilizadas

## Frontend

- React
- TypeScript
- Vite

## Backend

- Java
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- Hibernate

## Banco de Dados

- MySQL

## Testes

- JUnit
- Mockito
- Postman

## Ferramentas

- Git
- GitHub
- IntelliJ IDEA
- MySQL Workbench

---

# 📂 Estrutura do Projeto

```text
BelezaFacil/
│
├── backend/
│   └── src/
│
├── frontend/
│   └── src/
│
├── docs/
│   ├── requisitos.md
│   ├── regras-de-negocio.md
│   ├── fluxograma.png
│   └── arquitetura.png
│
└── README.md

```

## 📈 Status do Projeto

🚧 **Em desenvolvimento**

O projeto encontra-se atualmente na etapa de levantamento de requisitos, modelagem e desenvolvimento inicial do backend.

---

# 🛣️ Próximas Etapas

- [ ] Finalizar levantamento de requisitos
- [ ] Definir regras de negócio
- [ ] Finalizar modelagem do banco de dados
- [ ] Implementar entidades do backend
- [ ] Implementar autenticação e autorização
- [ ] Desenvolver API REST
- [ ] Implementar regras de disponibilidade
- [ ] Criar testes automatizados
- [ ] Desenvolver frontend web
- [ ] Integrar frontend e backend
- [ ] Implementar integração com WhatsApp
- [ ] Criar relatórios gerenciais
- [ ] Documentar API
- [ ] Publicar aplicação

---

## 👩‍💻 Autoria

**Daniela Soares**

Projeto desenvolvido para estudos e prática de desenvolvimento de sistemas, análise de requisitos, desenvolvimento backend, frontend, testes e modelagem de software.

O código e a documentação deste repositório são de autoria de **Daniela Soares**.
