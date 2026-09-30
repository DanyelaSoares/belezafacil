# Beleza Fácil — Sistema Web de Agendamento para Salões

![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-green?style=for-the-badge)

O **Beleza Fácil** é um sistema web de agendamento desenvolvido para facilitar o gerenciamento de salões de beleza e proporcionar uma experiência simples para clientes, profissionais e administradores.

A cliente poderá acessar o sistema por meio de um link, criar sua conta, consultar os serviços disponíveis, escolher uma profissional, selecionar uma data e horário e acompanhar seus agendamentos.

O sistema também contará com integração com o **WhatsApp** para envio de confirmações, lembretes e comunicações relacionadas aos agendamentos.

---

## 🧠 Visão do Projeto

O projeto foi idealizado para solucionar problemas comuns na organização de salões de beleza, como:

- Controle de horários;
- Conflitos entre agendamentos;
- Gerenciamento de profissionais;
- Controle dos serviços oferecidos;
- Controle de disponibilidade;
- Cancelamentos e reagendamentos;
- Acompanhamento do histórico das clientes;
- Comunicação com clientes sobre seus agendamentos;
- Organização das informações gerenciais do salão.

O sistema possui diferentes funções de acesso, permitindo que clientes gerenciem seus próprios dados e agendamentos, enquanto profissionais e administradores possuem permissões específicas de acordo com suas funções.

Uma mesma conta poderá possuir mais de uma função. Dessa forma, a administradora do salão também poderá atuar como profissional.

---

## 🎯 Objetivo do Projeto

O projeto tem como objetivos:

- Desenvolver uma aplicação web responsiva;
- Praticar desenvolvimento de APIs REST;
- Implementar regras de negócio para agendamento;
- Trabalhar com análise e especificação de requisitos;
- Implementar autenticação e autorização;
- Desenvolver modelagem de banco de dados relacional;
- Implementar controle de disponibilidade de horários;
- Praticar testes de API e testes automatizados;
- Trabalhar com integração entre sistemas;
- Utilizar boas práticas de desenvolvimento;
- Praticar versionamento com Git e GitHub;
- Documentar as decisões e regras do sistema.

---

# 👩‍💼 Funções de Acesso

O sistema possui três funções principais:

- Cliente;
- Profissional;
- Administradora.

Uma mesma conta poderá possuir mais de uma função.

---

## 👩 Cliente

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

A cliente poderá visualizar somente informações relacionadas à sua própria conta e aos seus próprios agendamentos.

---

## 👩‍💼 Profissional

A profissional poderá:

- Fazer login;
- Visualizar a agenda das profissionais;
- Realizar agendamentos para clientes;
- Cancelar agendamentos;
- Reagendar atendimentos;
- Marcar atendimentos como realizados;
- Marcar atendimentos como não realizados.

A profissional não terá acesso às configurações administrativas do salão.

---

## 👩‍💼 Administradora

A administradora terá acesso às funções de gerenciamento do salão.

Ela poderá:

- Cadastrar profissionais;
- Alterar profissionais;
- Ativar ou inativar profissionais;
- Definir quais serviços cada profissional pode realizar;
- Definir dias e horários de trabalho;
- Gerenciar folgas;
- Cadastrar serviços;
- Alterar serviços;
- Alterar preços;
- Alterar duração dos serviços;
- Fechar datas para agendamento;
- Abrir datas novamente;
- Bloquear horários;
- Liberar horários;
- Bloquear a agenda de uma profissional;
- Bloquear a agenda do salão;
- Gerenciar agendamentos;
- Cancelar agendamentos;
- Reagendar atendimentos;
- Acompanhar os atendimentos realizados;
- Gerenciar promoções;
- Consultar informações gerenciais e financeiras.

---

# 📅 Regras de Agendamento

O sistema deverá verificar a disponibilidade antes de permitir um novo agendamento.

A disponibilidade será calculada considerando:

- Profissional selecionada;
- Serviço escolhido;
- Data;
- Horário;
- Duração do serviço;
- Horário de funcionamento;
- Folgas da profissional;
- Agendamentos existentes;
- Horários bloqueados;
- Datas fechadas;
- Feriados;
- Demais restrições aplicáveis.

Os horários disponíveis serão calculados em intervalos de **15 minutos**.

O serviço deverá caber integralmente no período disponível.

### Exemplo

Um serviço de **Mão** possui duração de 30 minutos.

Se existir um agendamento:

**15:30 → 16:00**

o sistema não poderá permitir que outro serviço com duração de 1 hora seja iniciado às 15:00, pois haveria conflito de horários.

Nesse caso, o sistema deverá procurar outro horário disponível.

---

# 💅 Serviços

Os serviços são previamente cadastrados pela administradora do salão.

Cada serviço possui informações como:

- Nome;
- Descrição;
- Preço;
- Duração;
- Status.

Os serviços poderão ser associados às profissionais habilitadas para realizá-los.

### Exemplo

| Serviço | Duração |
|---|---:|
| Mão | 30 minutos |
| Pé | 30 minutos |
| Pé + Mão | 1 hora |

O serviço **Pé + Mão** é cadastrado como um serviço próprio de 1 hora.

A cliente não monta combinações de serviços durante o agendamento. Ela escolhe entre os serviços disponibilizados pelo salão.

Quando um serviço for inativado, ele não deverá aparecer para novos agendamentos, mas seus registros históricos deverão ser preservados.

---

# 👩‍🦰 Profissionais

As profissionais são cadastradas previamente pela administradora.

A administradora poderá:

- Cadastrar profissionais;
- Alterar seus dados;
- Ativar ou inativar profissionais;
- Definir quais serviços cada profissional pode realizar;
- Definir dias de trabalho;
- Definir horários de trabalho;
- Definir folgas;
- Bloquear períodos de atendimento.

A disponibilidade de cada profissional será calculada individualmente.

O fato de existir um horário livre no salão não significa que todas as profissionais estejam disponíveis naquele horário.

---

# ⏰ Controle de Disponibilidade

A administradora poderá controlar a disponibilidade da agenda.

Será possível:

- Fechar uma data inteira;
- Reabrir uma data;
- Bloquear determinados horários;
- Liberar horários anteriormente bloqueados;
- Bloquear a agenda de uma profissional;
- Bloquear a agenda do salão.

Por padrão, a agenda deverá permanecer fechada em feriados.

A administradora poderá abrir excepcionalmente a agenda em um feriado.

O sistema deverá considerar todos esses bloqueios ao calcular os horários disponíveis.

---

# ❌ Cancelamento e Reagendamento

## Cliente

A cliente poderá cancelar seu próprio agendamento somente com **24 horas ou mais de antecedência**.

A mesma regra será aplicada ao reagendamento realizado diretamente pela cliente.

Após o prazo de 24 horas, a cliente não poderá realizar o cancelamento ou reagendamento diretamente pelo sistema e deverá entrar em contato com o salão pelo canal de comunicação disponibilizado.

---

## Profissional

A profissional poderá:

- Cancelar agendamentos;
- Reagendar atendimentos.

O novo horário deverá respeitar as regras de disponibilidade.

---

## Administradora

A administradora poderá:

- Cancelar agendamentos;
- Reagendar atendimentos.

A administradora poderá realizar essas operações a qualquer momento, respeitando a disponibilidade do novo horário quando houver reagendamento.

Quando um agendamento for cancelado, o horário deverá ser liberado para novos agendamentos, desde que não exista outro bloqueio ou restrição.

---

# 📋 Status dos Atendimentos

Os atendimentos poderão possuir os seguintes status:

- **Agendado**
- **Confirmado**
- **Cancelado**
- **Realizado**
- **Não realizado**

A profissional ou a administradora poderá registrar o resultado do atendimento como:

- Realizado;
- Não realizado.

---

# 🕐 Histórico

O sistema deverá preservar o histórico dos atendimentos.

O histórico poderá apresentar informações como:

- Data;
- Horário;
- Serviço;
- Profissional;
- Valor;
- Status.

Alterações futuras no preço de um serviço não deverão alterar o valor registrado em atendimentos anteriores.

### Exemplo

Um serviço foi realizado por:

**R$ 80,00**

Posteriormente, o preço do serviço foi alterado para:

**R$ 100,00**

O atendimento histórico deverá continuar registrado como:

**R$ 80,00.**

---

# 📱 WhatsApp

O sistema deverá utilizar o WhatsApp como canal de comunicação com as clientes.

Entre as funcionalidades previstas estão:

- Confirmação de agendamento;
- Lembrete aproximadamente 24 horas antes;
- Lembrete aproximadamente 1 hora antes;
- Comunicação sobre cancelamentos;
- Comunicação sobre reagendamentos;
- Outras comunicações relacionadas aos atendimentos;
- Divulgação de promoções.

O WhatsApp será utilizado como meio de comunicação, enquanto o gerenciamento dos agendamentos permanecerá na aplicação web.

A solução técnica específica para integração com o WhatsApp será definida durante a etapa de desenvolvimento.

---

# 🎁 Promoções

A administradora poderá cadastrar e gerenciar promoções.

Uma promoção poderá possuir:

- Título;
- Descrição;
- Serviço relacionado;
- Valor ou condição promocional;
- Data inicial;
- Data final;
- Status.

As promoções deverão respeitar seu período de validade.

---

# 📊 Relatórios e Informações Gerenciais

A administradora terá acesso a informações gerenciais relacionadas aos atendimentos do salão.

Estão previstos:

- Relatórios diários;
- Relatórios mensais;
- Informações por profissional;
- Informações por serviço;
- Informações financeiras;
- Previsão financeira.

Os critérios específicos para cálculo da previsão financeira serão definidos durante a implementação das regras financeiras.

---

# 🗄️ Modelo de Dados

O sistema será baseado em um banco de dados relacional.

Entre as principais entidades previstas estão:

### 📌 Client

Representa a cliente cadastrada no sistema.

Principais informações previstas:

- id;
- nome;
- telefone;
- endereço;
- e-mail;
- senha;
- status;
- data de cadastro.

### 📌 Professional

Representa uma profissional do salão.

Principais informações previstas:

- id;
- nome;
- telefone;
- status.

### 📌 Service

Representa um serviço oferecido pelo salão.

Principais informações previstas:

- id;
- nome;
- descrição;
- preço;
- duração;
- status.

### 📌 Appointment

Representa um agendamento.

Principais informações previstas:

- id;
- cliente;
- profissional;
- serviço;
- data;
- horário;
- status;
- informações relacionadas à execução do atendimento.

### 📌 ScheduleBlock

Representa um período bloqueado na agenda.

Principais informações previstas:

- id;
- profissional, quando aplicável;
- data;
- horário inicial;
- horário final;
- motivo;
- status.

> **Observação:** esta é uma visão inicial das principais entidades. A modelagem definitiva do banco de dados será documentada separadamente em `docs/modelagem.md`.

---

# 🔐 Segurança

O sistema contará com autenticação e autorização para controlar o acesso às funcionalidades.

As permissões serão determinadas de acordo com as funções atribuídas à conta.

### Cliente

A cliente poderá acessar e alterar somente seus próprios dados e agendamentos.

### Profissional

A profissional terá acesso às funcionalidades relacionadas aos atendimentos e à agenda, conforme suas permissões.

### Administradora

A administradora terá acesso às funcionalidades de gerenciamento do salão.

Uma mesma conta poderá possuir mais de uma função.

---

# 📱 Interface

O sistema será desenvolvido como uma aplicação web responsiva.

A aplicação deverá funcionar em:

- Celulares;
- Tablets;
- Computadores.

A cliente poderá acessar o sistema por meio de um link, sem necessidade de instalar um aplicativo mobile.

A experiência de agendamento será pensada inicialmente com foco em dispositivos móveis.

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
│   ├── regras_de_negocio.md
│   ├── casos-de-uso.md
│   ├── modelagem.md
│   ├── arquitetura.md
│   │
│   └── imagens/
│       ├── esboco-inicial.png
│       ├── fluxograma.png
│       └── arquitetura.png
│
└── README.md

````
