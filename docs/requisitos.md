# 📋 Requisitos do Sistema — Beleza Fácil

## 1. Identificação do Projeto

**Projeto:** Beleza Fácil  
**Tipo:** Sistema Web Responsivo de Agendamento para Salões de Beleza  
**Status:** Em desenvolvimento

O **Beleza Fácil** é um sistema web destinado a auxiliar na organização de salões de beleza, permitindo o gerenciamento de clientes, profissionais, serviços, horários e agendamentos.

A aplicação será acessada por meio de um link e deverá funcionar em dispositivos móveis e computadores.

O sistema também contará com integração com o WhatsApp para comunicação relacionada aos agendamentos e divulgação de informações.

---

# 2. Objetivo do Sistema

O sistema tem como objetivo facilitar o processo de agendamento e gerenciamento dos serviços de um salão de beleza.

O Beleza Fácil deverá permitir:

- Cadastro e autenticação de clientes;
- Cadastro e autenticação de profissionais;
- Gerenciamento de profissionais;
- Gerenciamento de serviços;
- Gerenciamento de horários e disponibilidade;
- Realização de agendamentos;
- Consulta de agendamentos;
- Cancelamento de agendamentos;
- Reagendamento de atendimentos;
- Consulta do histórico de atendimentos;
- Registro da situação dos atendimentos;
- Gerenciamento de promoções;
- Consulta de informações gerenciais;
- Comunicação com clientes por meio do WhatsApp.

---

# 3. Perfis de Acesso

O sistema deverá possuir três funções principais:

- Cliente;
- Profissional;
- Administradora.

Uma mesma conta poderá possuir mais de uma função.

### Exemplo

A responsável pelo salão poderá possuir simultaneamente as funções de:

- Administradora;
- Profissional.

O sistema deverá disponibilizar as funcionalidades correspondentes às funções atribuídas à conta.

---

# 4. Requisitos Funcionais

## 4.1 Cadastro e autenticação

### RF001 — Cadastro de cliente

O sistema deve permitir que a cliente crie sua própria conta.

O cadastro deverá contemplar, no mínimo:

- Nome;
- Telefone;
- Endereço;
- E-mail;
- Senha.

O e-mail poderá ser opcional.

---

### RF002 — Autenticação da cliente

O sistema deve permitir que a cliente realize login para acessar sua conta e as funcionalidades destinadas ao seu perfil.

---

### RF003 — Cadastro de profissional

O sistema deve permitir que a administradora cadastre profissionais.

---

### RF004 — Autenticação da profissional

O sistema deve permitir que a profissional possua login próprio para acesso ao sistema.

---

### RF005 — Acesso administrativo

O sistema deve permitir que contas com função de administradora acessem as funcionalidades de gerenciamento do salão.

---

# 5. Gerenciamento de Dados Cadastrais

## RF006 — Alteração dos dados da cliente

O sistema deve permitir que a cliente altere seus próprios dados cadastrais.

Os dados poderão incluir:

- Nome;
- Telefone;
- Endereço;
- E-mail;
- Senha.

---

## RF007 — Gerenciamento de profissionais

O sistema deve permitir que a administradora:

- Cadastre profissionais;
- Altere dados das profissionais;
- Ative profissionais;
- Inative profissionais;
- Defina os serviços que cada profissional pode realizar;
- Defina horários de trabalho;
- Defina dias de trabalho;
- Defina folgas.

---

## RF008 — Gerenciamento de serviços

O sistema deve permitir que a administradora:

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

# 6. Agendamento

## RF009 — Consulta de serviços

O sistema deve permitir que a cliente consulte os serviços disponibilizados pelo salão.

---

## RF010 — Seleção de profissional

O sistema deve permitir que a cliente selecione uma profissional para realizar o serviço escolhido.

O sistema deverá apresentar somente profissionais habilitadas para realizar o serviço selecionado.

---

## RF011 — Consulta de disponibilidade

O sistema deve permitir que a cliente consulte os horários disponíveis para determinado serviço, profissional e data.

A cliente deverá visualizar somente a disponibilidade da agenda, sem acesso às informações pessoais ou aos agendamentos de outras clientes.

---

## RF012 — Realização de agendamento

O sistema deve permitir que a cliente realize um agendamento mediante seleção de:

1. Serviço;
2. Profissional;
3. Data;
4. Horário.

O agendamento deverá ser validado antes de sua confirmação.

---

## RF013 — Agendamento realizado pela profissional

O sistema deve permitir que a profissional realize agendamentos para clientes.

---

## RF014 — Consulta de agendamentos

O sistema deve permitir que a cliente consulte seus próximos agendamentos.

O sistema deverá permitir que profissionais e administradoras consultem os agendamentos aos quais possuem acesso de acordo com suas funções.

---

## RF015 — Gerenciamento de agendamentos

O sistema deve permitir que profissionais e administradoras gerenciem os agendamentos de acordo com suas respectivas permissões.

---

# 7. Cancelamento e Reagendamento

## RF016 — Cancelamento pela cliente

O sistema deve permitir que a cliente cancele seus próprios agendamentos quando as condições estabelecidas para cancelamento forem atendidas.

---

## RF017 — Reagendamento pela cliente

O sistema deve permitir que a cliente solicite o reagendamento de seus próprios atendimentos quando as condições estabelecidas forem atendidas.

O novo horário deverá ser submetido novamente à validação de disponibilidade.

---

## RF018 — Cancelamento pela profissional

O sistema deve permitir que a profissional desmarque agendamentos de acordo com suas permissões.

---

## RF019 — Reagendamento pela profissional

O sistema deve permitir que a profissional reagende atendimentos de acordo com suas permissões.

---

## RF020 — Cancelamento pela administradora

O sistema deve permitir que a administradora cancele agendamentos.

---

## RF021 — Reagendamento pela administradora

O sistema deve permitir que a administradora reagende agendamentos.

---

# 8. Gerenciamento da Agenda

## RF022 — Configuração do horário de funcionamento

O sistema deve permitir que a administradora configure o horário de funcionamento do salão.

O horário inicialmente previsto é das **09:00 às 21:00**.

---

## RF023 — Configuração dos horários de trabalho

O sistema deve permitir que a administradora defina os dias e horários de trabalho das profissionais.

---

## RF024 — Gerenciamento de folgas

O sistema deve permitir que a administradora cadastre e gerencie as folgas das profissionais.

---

## RF025 — Fechamento de datas

O sistema deve permitir que a administradora feche uma data para novos agendamentos.

---

## RF026 — Abertura de datas

O sistema deve permitir que a administradora reabra uma data anteriormente fechada.

---

## RF027 — Bloqueio de horários

O sistema deve permitir que a administradora bloqueie horários específicos para novos agendamentos.

---

## RF028 — Liberação de horários

O sistema deve permitir que a administradora libere horários anteriormente bloqueados.

---

## RF029 — Bloqueio da agenda de uma profissional

O sistema deve permitir que a administradora bloqueie a agenda de uma profissional durante determinado período.

---

## RF030 — Bloqueio da agenda do salão

O sistema deve permitir que a administradora bloqueie a agenda do salão durante determinado período.

---

## RF031 — Gerenciamento de feriados

O sistema deve considerar o calendário de feriados para controle da disponibilidade da agenda.

O sistema deverá permitir que a administradora configure funcionamento excepcional em feriados.

---

# 9. Serviços

## RF032 — Associação entre profissionais e serviços

O sistema deve permitir que a administradora defina quais serviços cada profissional está habilitada a realizar.

Uma profissional poderá realizar vários serviços.

Um mesmo serviço poderá ser realizado por várias profissionais.

---

## RF033 — Serviços combinados

O sistema deve permitir que serviços combinados sejam cadastrados como serviços próprios.

Exemplo:

| Serviço | Duração |
|---|---:|
| Mão | 30 minutos |
| Pé | 30 minutos |
| Pé + Mão | 1 hora |

A cliente deverá selecionar entre os serviços disponibilizados pelo salão, não sendo responsável por criar combinações durante o agendamento.

---

# 10. Controle de Disponibilidade

## RF034 — Cálculo de disponibilidade

O sistema deve calcular os horários disponíveis considerando as informações necessárias para determinar se o atendimento pode ser realizado integralmente.

O cálculo deverá considerar, entre outros elementos:

- Profissional;
- Serviço;
- Data;
- Horário;
- Duração do serviço;
- Agendamentos existentes;
- Horários bloqueados;
- Datas fechadas;
- Horários de trabalho;
- Folgas.

---

## RF035 — Apresentação de horários disponíveis

O sistema deve apresentar à cliente os horários que estiverem disponíveis para o serviço e profissional selecionados.

---

## RF036 — Próximo horário disponível

Quando solicitado, o sistema deverá apresentar o próximo horário disponível para realização integral do serviço.

---

## RF037 — Consulta de calendário

O sistema deverá permitir que a cliente consulte o calendário para visualizar outros horários disponíveis.

---

# 11. Atendimento

## RF038 — Registro do status do atendimento

O sistema deve permitir o registro da situação do atendimento.

Os estados previstos incluem:

- Agendado;
- Confirmado;
- Cancelado;
- Realizado;
- Não realizado.

---

## RF039 — Registro de atendimento realizado

O sistema deve permitir que profissional ou administradora registre um atendimento como realizado.

---

## RF040 — Registro de atendimento não realizado

O sistema deve permitir que profissional ou administradora registre um atendimento como não realizado.

---

# 12. Histórico

## RF041 — Histórico da cliente

O sistema deve permitir que a cliente consulte seu histórico de atendimentos.

O histórico deverá apresentar informações como:

- Data;
- Horário;
- Serviço;
- Profissional;
- Valor;
- Status do atendimento.

---

## RF042 — Preservação de informações históricas

O sistema deve preservar as informações necessárias para consulta dos atendimentos realizados anteriormente, mesmo quando houver alterações posteriores nos serviços ou profissionais cadastrados.

---

# 13. Promoções

## RF043 — Cadastro de promoções

O sistema deve permitir que a administradora cadastre promoções.

Uma promoção deverá possuir informações como:

- Nome ou título;
- Descrição;
- Serviço relacionado;
- Valor ou condição promocional;
- Data inicial;
- Data final;
- Status.

---

## RF044 — Gerenciamento de promoções

O sistema deve permitir que a administradora consulte, altere, ative ou inative promoções cadastradas.

---

## RF045 — Divulgação de promoções

O sistema deverá permitir que a administradora utilize o canal de comunicação disponível para divulgar promoções às clientes cadastradas.

---

# 14. Relatórios e Informações Gerenciais

## RF046 — Relatório diário

O sistema deve permitir que a administradora consulte informações dos atendimentos de determinado dia.

---

## RF047 — Relatório mensal

O sistema deve permitir que a administradora consulte informações dos atendimentos de determinado mês.

---

## RF048 — Informações por profissional

O sistema deve permitir que a administradora consulte informações relacionadas aos atendimentos realizados por profissional.

---

## RF049 — Informações por serviço

O sistema deve permitir que a administradora consulte informações relacionadas aos serviços realizados.

---

## RF050 — Informações financeiras

O sistema deve disponibilizar informações financeiras relacionadas aos atendimentos registrados.

---

## RF051 — Previsão financeira

O sistema deverá disponibilizar informações que permitam à administradora acompanhar a previsão financeira do salão.

---

# 15. Comunicação por WhatsApp

## RF052 — Confirmação de agendamento

O sistema deverá utilizar o WhatsApp para enviar confirmação de agendamento à cliente.

A comunicação deverá conter informações como:

- Data;
- Horário;
- Serviço;
- Profissional.

---

## RF053 — Comunicação de alterações

O sistema deverá utilizar o WhatsApp para comunicar à cliente alterações relacionadas ao seu agendamento, incluindo cancelamentos e reagendamentos.

---

## RF054 — Lembrete de agendamento

O sistema deverá utilizar o WhatsApp para enviar lembretes relacionados aos atendimentos.

Estão previstos:

- Lembrete aproximadamente 24 horas antes;
- Lembrete aproximadamente 1 hora antes.

---

## RF055 — Comunicação com a administradora

O sistema deverá permitir comunicação com a administradora sobre novos agendamentos e alterações relevantes.

---

# 16. Segurança e Controle de Acesso

## RF056 — Autenticação

O sistema deve possuir mecanismo de autenticação para acesso às funcionalidades protegidas.

---

## RF057 — Autorização por função

O sistema deve controlar o acesso às funcionalidades de acordo com as funções atribuídas à conta.

---

## RF058 — Acesso aos próprios dados

O sistema deve permitir que a cliente consulte e altere somente seus próprios dados cadastrais.

---

## RF059 — Proteção das funcionalidades administrativas

O sistema deve restringir funcionalidades administrativas às contas que possuam a função de administradora.

---

## RF060 — Acúmulo de funções

O sistema deve permitir que uma mesma conta possua mais de uma função.

---

# 17. Interface e Acesso

## RF061 — Interface responsiva

O sistema deve possuir interface responsiva e funcionar adequadamente em:

- Celulares;
- Tablets;
- Computadores.

---

## RF062 — Acesso por link

O sistema deve permitir que a cliente acesse a aplicação por meio de um link.

---

## RF063 — Acesso pelo WhatsApp

O sistema deve permitir que links de acesso à aplicação sejam utilizados nas comunicações enviadas pelo WhatsApp.

---

## RF064 — Utilização sem instalação

O sistema deverá ser utilizável sem a necessidade de instalação de um aplicativo mobile.

---

# 18. Requisitos Não Funcionais

## RNF001 — Responsividade

A aplicação deverá possuir interface responsiva, adaptando-se aos diferentes tamanhos de tela.

---

## RNF002 — API REST

A comunicação entre frontend e backend deverá utilizar uma API REST.

---

## RNF003 — Segurança

O sistema deverá proteger os dados dos usuários e controlar o acesso às funcionalidades de acordo com as funções atribuídas.

---

## RNF004 — Integridade dos agendamentos

O sistema deverá evitar conflitos de horários e garantir que somente horários válidos sejam disponibilizados para novos agendamentos.

---

## RNF005 — Preservação do histórico

O sistema deverá preservar informações históricas necessárias para consulta dos atendimentos.

---

## RNF006 — Testabilidade

A aplicação deverá possuir estrutura que permita a realização de testes automatizados e testes de API.

---

# 19. Requisitos Técnicos

## RT001 — Frontend

A aplicação frontend será desenvolvida utilizando:

- React;
- TypeScript;
- Vite.

---

## RT002 — Backend

A aplicação backend será desenvolvida utilizando:

- Java;
- Spring Boot;
- Spring Security;
- Spring Data JPA;
- Hibernate;
- JWT.

---

## RT003 — Banco de Dados

O sistema utilizará:

- MySQL.

---

## RT004 — Testes

Serão utilizadas ferramentas e tecnologias como:

- JUnit;
- Mockito;
- Postman.

---

## RT005 — Versionamento

O projeto utilizará:

- Git;
- GitHub.

---

# 20. Integrações

## RI001 — Integração com WhatsApp

O sistema deverá possuir integração com o WhatsApp para comunicação relacionada aos agendamentos e divulgação de promoções.

A solução técnica específica para a integração será definida durante a etapa de desenvolvimento.

---

# 21. Escopo Inicial

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
- Informações financeiras;
- Previsão financeira;
- Comunicação por WhatsApp;
- Cadastro e gerenciamento de promoções.

---

# 22. Rastreabilidade

Os requisitos deverão manter rastreabilidade durante as etapas de desenvolvimento do projeto.

A relação deverá ser mantida entre:

**Requisitos → Regras de Negócio → Casos de Uso → Modelagem → Implementação → Testes**

Alterações nos requisitos deverão ser documentadas para evitar inconsistências entre a especificação e o sistema implementado.

---

## 📌 Observação

Este documento representa a especificação dos requisitos do sistema **Beleza Fácil** e poderá ser atualizado conforme as necessidades do negócio forem refinadas e validadas durante as etapas de análise, modelagem, desenvolvimento e testes.
