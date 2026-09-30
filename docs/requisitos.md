# 📋 Requisitos do Sistema — Beleza Fácil

## 1. Identificação do Projeto

**Projeto:** Beleza Fácil  
**Tipo:** Sistema Web Responsivo de Agendamento para Salões de Beleza  
**Status:** Em desenvolvimento

O **Beleza Fácil** é um sistema web desenvolvido para auxiliar na organização de salões de beleza, permitindo o gerenciamento de clientes, profissionais, serviços, horários e agendamentos.

A aplicação será acessada por meio de um link e deverá funcionar em dispositivos móveis e computadores.

O sistema também contará com integração com o WhatsApp para envio de confirmações, lembretes e comunicações relacionadas aos agendamentos.

---

## 2. Objetivo do Sistema

O sistema tem como objetivo facilitar o processo de agendamento e gerenciamento de serviços de um salão de beleza.

O Beleza Fácil deverá permitir:

- Que clientes realizem e acompanhem seus agendamentos;
- Que clientes consultem seu histórico de atendimentos;
- Que clientes possam cancelar ou reagendar atendimentos;
- Que profissionais acompanhem e gerenciem atendimentos;
- Que profissionais realizem agendamentos para clientes;
- Que a administradora gerencie profissionais;
- Que a administradora gerencie serviços;
- Que a administradora gerencie a disponibilidade da agenda;
- Que a administradora gerencie agendamentos;
- Que sejam enviados avisos e lembretes por WhatsApp;
- Que a administradora tenha acesso a informações e relatórios do salão;
- Que a administradora cadastre e divulgue promoções.

---

## 3. Perfis de Acesso

O sistema possuirá três funções principais:

- **Cliente**
- **Profissional**
- **Administradora**

Uma mesma conta poderá possuir mais de uma função.

### Exemplo

A dona do salão poderá possuir simultaneamente as funções:

- Administradora;
- Profissional.

Nesse caso, poderá utilizar as funcionalidades correspondentes às duas funções.

---

# 4. Requisitos Funcionais

## 4.1 Cliente

### RF001 — Cadastro de cliente

O sistema deverá permitir que a cliente crie sua própria conta.

O cadastro deverá permitir informações como:

- Nome;
- Telefone;
- Endereço;
- E-mail;
- Senha.

O e-mail será opcional.

---

### RF002 — Login da cliente

O sistema deverá permitir que a cliente realize login e tenha acesso às funcionalidades relacionadas à sua própria conta e aos seus agendamentos.

---

### RF003 — Alteração dos dados cadastrais

O sistema deverá permitir que a cliente altere seus próprios dados cadastrais, incluindo:

- Nome;
- Telefone;
- Endereço;
- E-mail;
- Senha.

---

### RF004 — Consulta de serviços

O sistema deverá permitir que a cliente consulte os serviços disponibilizados pelo salão.

---

### RF005 — Seleção de profissional

O sistema deverá permitir que a cliente escolha uma profissional para realizar o serviço selecionado.

O sistema deverá apresentar somente profissionais habilitadas para realizar o serviço escolhido.

---

### RF006 — Consulta de disponibilidade

O sistema deverá permitir que a cliente consulte os horários disponíveis para o serviço e profissional selecionados.

A cliente deverá visualizar somente a disponibilidade da agenda, sem acesso às informações pessoais ou aos agendamentos de outras clientes.

---

### RF007 — Realização de agendamento

O sistema deverá permitir que a cliente realize um novo agendamento.

O processo deverá permitir a seleção de:

1. Serviço;
2. Profissional;
3. Data;
4. Horário;
5. Confirmação do agendamento.

---

### RF008 — Consulta de próximos agendamentos

O sistema deverá permitir que a cliente consulte seus próximos agendamentos.

---

### RF009 — Consulta do histórico

O sistema deverá permitir que a cliente consulte seu histórico de atendimentos.

O histórico deverá apresentar informações como:

- Data;
- Horário;
- Serviço;
- Profissional;
- Valor;
- Status do atendimento.

---

### RF010 — Cancelamento de agendamento

O sistema deverá permitir que a cliente cancele seus próprios agendamentos de acordo com as regras estabelecidas para cancelamento.

---

### RF011 — Reagendamento de atendimento

O sistema deverá permitir que a cliente reagende seus próprios atendimentos de acordo com as regras estabelecidas para reagendamento.

O novo horário deverá ser validado novamente quanto à disponibilidade.

---

## 4.2 Profissional

### RF012 — Login da profissional

O sistema deverá permitir que a profissional possua login próprio para acesso ao sistema.

---

### RF013 — Consulta da agenda

O sistema deverá permitir que a profissional visualize a agenda das profissionais cadastradas no salão.

A visualização deverá apresentar as informações necessárias para o gerenciamento dos atendimentos.

---

### RF014 — Agendamento para clientes

O sistema deverá permitir que a profissional realize agendamentos para clientes.

---

### RF015 — Cancelamento de agendamentos

O sistema deverá permitir que a profissional desmarque agendamentos de acordo com suas permissões.

---

### RF016 — Reagendamento de atendimentos

O sistema deverá permitir que a profissional reagende atendimentos de acordo com suas permissões.

---

### RF017 — Registro do resultado do atendimento

O sistema deverá permitir que a profissional informe o resultado do atendimento.

O atendimento poderá ser registrado como:

- **Realizado**
- **Não realizado**

---

## 4.3 Administradora

### RF018 — Gerenciamento de profissionais

O sistema deverá permitir que a administradora:

- Cadastre profissionais;
- Altere dados das profissionais;
- Ative profissionais;
- Inative profissionais;
- Defina quais serviços cada profissional pode realizar;
- Defina horários de trabalho;
- Defina dias de trabalho;
- Defina folgas.

---

### RF019 — Gerenciamento de serviços

O sistema deverá permitir que a administradora:

- Cadastre serviços;
- Altere serviços;
- Altere preços;
- Altere duração dos serviços;
- Ative serviços;
- Inative serviços.

Cada serviço deverá possuir, no mínimo:

- Nome;
- Descrição;
- Preço;
- Duração;
- Status.

---

### RF020 — Gerenciamento de disponibilidade

O sistema deverá permitir que a administradora:

- Feche uma data inteira;
- Abra novamente uma data fechada;
- Bloqueie horários específicos;
- Libere horários anteriormente bloqueados;
- Bloqueie a agenda de uma profissional;
- Bloqueie a agenda do salão.

---

### RF021 — Gerenciamento de horários de trabalho

O sistema deverá permitir que a administradora defina os dias e horários de trabalho das profissionais.

---

### RF022 — Gerenciamento de folgas

O sistema deverá permitir que a administradora defina as folgas das profissionais.

---

### RF023 — Gerenciamento de feriados

O sistema deverá permitir que a administradora controle o funcionamento da agenda em feriados.

A administradora poderá abrir a agenda em um feriado quando houver necessidade de funcionamento excepcional.

---

### RF024 — Gerenciamento de agendamentos

O sistema deverá permitir que a administradora consulte e gerencie os agendamentos do salão.

---

### RF025 — Cancelamento de agendamentos

O sistema deverá permitir que a administradora cancele agendamentos.

---

### RF026 — Reagendamento de atendimentos

O sistema deverá permitir que a administradora reagende atendimentos.

---

### RF027 — Registro do resultado do atendimento

O sistema deverá permitir que a administradora registre um atendimento como:

- **Realizado**
- **Não realizado**

---

# 5. Serviços

### RF028 — Associação entre profissionais e serviços

O sistema deverá permitir que a administradora defina quais serviços cada profissional está habilitada a realizar.

Uma profissional poderá realizar vários serviços.

Um mesmo serviço poderá ser realizado por várias profissionais.

---

### RF029 — Serviços combinados

O sistema deverá permitir que serviços combinados sejam cadastrados como serviços próprios.

Exemplo:

| Serviço | Duração |
|---|---:|
| Mão | 30 minutos |
| Pé | 30 minutos |
| Pé + Mão | 1 hora |

A cliente deverá escolher entre os serviços previamente cadastrados pelo salão.

A cliente não deverá montar combinações de serviços durante o processo de agendamento.

---

# 6. Agenda e Disponibilidade

### RF030 — Configuração do horário de funcionamento

O sistema deverá permitir o gerenciamento do horário de funcionamento do salão.

O horário inicialmente previsto será:

**09:00 às 21:00.**

---

### RF031 — Controle de disponibilidade

O sistema deverá calcular os horários disponíveis considerando:

- Profissional;
- Serviço;
- Data;
- Horário;
- Duração do serviço;
- Agendamentos existentes;
- Bloqueios de horários;
- Datas fechadas;
- Horários de trabalho da profissional;
- Folgas da profissional.

---

### RF032 — Consulta de calendário

O sistema deverá permitir que a cliente consulte o calendário para visualizar outros horários disponíveis.

---

### RF033 — Apresentação do próximo horário disponível

O sistema deverá permitir a apresentação do próximo horário disponível para realização do serviço selecionado.

---

### RF034 — Intervalos de disponibilidade

O sistema deverá trabalhar com intervalos mínimos de 15 minutos para cálculo da disponibilidade.

---

# 7. Atendimento e Histórico

### RF035 — Registro do status do atendimento

O sistema deverá registrar o estado de cada atendimento.

Os estados previstos incluem:

- Agendado;
- Confirmado;
- Cancelado;
- Realizado;
- Não realizado.

---

### RF036 — Histórico de atendimentos

O sistema deverá preservar os registros históricos dos atendimentos realizados.

As informações históricas deverão incluir, quando aplicável:

- Data;
- Horário;
- Serviço;
- Profissional;
- Valor;
- Status.

---

# 8. Promoções

### RF037 — Cadastro de promoções

O sistema deverá permitir que a administradora cadastre promoções.

Cada promoção deverá possuir informações como:

- Nome ou título;
- Descrição;
- Serviço relacionado;
- Valor ou condição promocional;
- Data inicial;
- Data final;
- Status.

---

### RF038 — Gerenciamento de promoções

O sistema deverá permitir que a administradora gerencie as promoções cadastradas.

---

### RF039 — Divulgação de promoções

O sistema deverá permitir que a administradora utilize a integração de comunicação disponível para divulgar promoções às clientes cadastradas.

---

# 9. Relatórios e Informações Gerenciais

### RF040 — Relatório diário de atendimentos

O sistema deverá permitir que a administradora consulte informações dos atendimentos realizados em determinado dia.

---

### RF041 — Relatório mensal de atendimentos

O sistema deverá permitir que a administradora consulte informações dos atendimentos realizados em determinado mês.

---

### RF042 — Informações por profissional

O sistema deverá permitir que a administradora consulte informações relacionadas aos atendimentos por profissional.

---

### RF043 — Informações por serviço

O sistema deverá permitir que a administradora consulte informações relacionadas aos atendimentos por serviço.

---

### RF044 — Informações financeiras

O sistema deverá permitir que a administradora consulte informações financeiras relacionadas aos atendimentos registrados.

---

### RF045 — Previsão financeira

O sistema deverá disponibilizar informações que permitam à administradora acompanhar a previsão financeira do salão.

---

# 10. Comunicação por WhatsApp

### RF046 — Confirmação de agendamento

O sistema deverá utilizar o WhatsApp para enviar confirmação de agendamento à cliente.

A confirmação deverá conter informações como:

- Data;
- Horário;
- Serviço;
- Profissional.

---

### RF047 — Comunicação de alterações

O sistema deverá utilizar o WhatsApp para comunicar à cliente alterações relacionadas ao seu agendamento, incluindo:

- Cancelamentos;
- Reagendamentos;
- Outras alterações relacionadas ao atendimento.

---

### RF048 — Lembretes de atendimento

O sistema deverá utilizar o WhatsApp para enviar lembretes de atendimento.

Estão previstos:

- Lembrete aproximadamente 24 horas antes;
- Lembrete aproximadamente 1 hora antes.

---

### RF049 — Comunicação com a administradora

O sistema deverá permitir que a administradora seja informada sobre novos agendamentos e alterações relevantes.

---

# 11. Segurança e Controle de Acesso

### RF050 — Autenticação

O sistema deverá possuir autenticação para acesso às funcionalidades protegidas.

---

### RF051 — Autorização por função

O sistema deverá controlar o acesso às funcionalidades de acordo com as funções atribuídas à conta.

---

### RF052 — Controle de acesso aos próprios dados

O sistema deverá permitir que a cliente consulte e altere somente seus próprios dados cadastrais e seus próprios agendamentos.

---

### RF053 — Controle de acesso administrativo

O sistema deverá restringir as funcionalidades administrativas às contas que possuam a função de administradora.

---

### RF054 — Acúmulo de funções

O sistema deverá permitir que uma mesma conta possua mais de uma função.

---

# 12. Interface e Acesso

### RF055 — Interface responsiva

O sistema deverá possuir uma interface responsiva para utilização em:

- Celulares;
- Tablets;
- Computadores.

---

### RF056 — Acesso por link

O sistema deverá permitir que a cliente acesse a aplicação por meio de um link.

---

### RF057 — Acesso por link através do WhatsApp

O sistema deverá permitir que links de acesso à aplicação sejam utilizados nas comunicações enviadas pelo WhatsApp.

---

### RF058 — Utilização sem instalação

O sistema deverá permitir sua utilização sem necessidade de instalação de aplicativo mobile.

---

# 13. Requisitos Não Funcionais

### RNF001 — Responsividade

A aplicação deverá adaptar sua interface aos diferentes tamanhos de tela.

---

### RNF002 — API REST

A comunicação entre frontend e backend deverá utilizar uma API REST.

---

### RNF003 — Segurança dos dados

O sistema deverá proteger os dados dos usuários e restringir o acesso às funcionalidades conforme as permissões da conta.

---

### RNF004 — Integridade dos agendamentos

O sistema deverá evitar conflitos de horários e impedir a criação de agendamentos incompatíveis com a disponibilidade existente.

---

### RNF005 — Preservação do histórico

O sistema deverá preservar os dados necessários para consulta do histórico de atendimentos.

---

### RNF006 — Testabilidade

A aplicação deverá possuir estrutura que permita a realização de testes automatizados e testes de API.

---

# 14. Requisitos Técnicos

### RT001 — Frontend

A aplicação frontend será desenvolvida utilizando:

- React;
- TypeScript;
- Vite.

---

### RT002 — Backend

A aplicação backend será desenvolvida utilizando:

- Java;
- Spring Boot;
- Spring Security;
- Spring Data JPA;
- Hibernate;
- JWT.

---

### RT003 — Banco de Dados

O sistema utilizará:

- MySQL.

---

### RT004 — Testes

Serão utilizadas ferramentas e tecnologias como:

- JUnit;
- Mockito;
- Postman.

---

### RT005 — Versionamento

O projeto utilizará:

- Git;
- GitHub.

---

# 15. Integrações

### RI001 — Integração com WhatsApp

O sistema deverá possuir integração com o WhatsApp para comunicação com clientes e divulgação de promoções.

A solução técnica específica da integração será definida durante a etapa de desenvolvimento, considerando a API escolhida e suas regras de utilização.

---

# 16. Escopo Inicial

A primeira versão do sistema deverá contemplar:

- Cadastro e login de clientes;
- Cadastro e login de profissionais;
- Acesso administrativo;
- Gerenciamento de profissionais;
- Gerenciamento de serviços;
- Controle de preços;
- Controle de duração dos serviços;
- Controle de disponibilidade;
- Agendamentos;
- Cancelamentos;
- Reagendamentos;
- Histórico de atendimentos;
- Registro de atendimentos realizados e não realizados;
- Relatórios básicos;
- Previsão financeira;
- Comunicação por WhatsApp;
- Cadastro de promoções.

---

# 17. Rastreabilidade

Os requisitos deverão manter rastreabilidade durante as etapas de desenvolvimento do projeto.

A relação deverá ser mantida entre:

**Requisitos → Regras de Negócio → Casos de Uso → Modelagem → Implementação → Testes**

Alterações nos requisitos deverão ser documentadas para evitar inconsistências entre a especificação e o sistema implementado.

---

## 📌 Observação

Este documento representa a especificação dos requisitos do sistema **Beleza Fácil** e poderá ser atualizado conforme as necessidades do negócio forem refinadas e validadas durante as etapas de análise, modelagem, desenvolvimento e testes.
