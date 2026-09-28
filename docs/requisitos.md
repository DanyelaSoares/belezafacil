# 📋 Levantamento de Requisitos — Beleza Fácil

## 1. Identificação do Projeto

**Projeto:** Beleza Fácil  
**Tipo:** Sistema Web Responsivo de Agendamento para Salões de Beleza  
**Status:** Em desenvolvimento

O Beleza Fácil é um sistema web desenvolvido para auxiliar na organização de salões de beleza, permitindo o gerenciamento de clientes, profissionais, serviços, horários e agendamentos.

A aplicação será acessada por meio de um link e deverá funcionar em dispositivos móveis e computadores.

O sistema também contará com integração com o WhatsApp para envio de confirmações, lembretes e comunicações relacionadas aos agendamentos.

---

# 2. Objetivo do Sistema

O sistema tem como objetivo facilitar o processo de agendamento e gerenciamento de serviços de um salão de beleza, permitindo:

- Que clientes realizem e acompanhem seus agendamentos;
- Que clientes consultem seu histórico de atendimentos;
- Que clientes possam cancelar ou reagendar dentro das regras estabelecidas;
- Que profissionais acompanhem e gerenciem os atendimentos;
- Que a administradora gerencie profissionais, serviços e disponibilidade;
- Que o sistema controle automaticamente os conflitos de horários;
- Que sejam enviados avisos e lembretes por WhatsApp;
- Que a administradora tenha acesso a informações e relatórios do salão.

---

# 3. Perfis de Acesso

O sistema possuirá três funções principais:

- Cliente;
- Profissional;
- Administradora.

Uma mesma pessoa poderá possuir mais de uma função.

### Exemplo

A dona do salão poderá possuir simultaneamente:

- Administradora;
- Profissional.

Dessa forma, ela poderá administrar o salão e também realizar atendimentos.

---

# 4. Cliente

## 4.1 Cadastro

A cliente deverá poder criar sua própria conta no sistema.

O cadastro deverá permitir informações como:

- Nome;
- Telefone;
- Endereço;
- E-mail;
- Senha.

O e-mail será opcional.

---

## 4.2 Login

A cliente deverá possuir acesso autenticado ao sistema.

Após realizar o login, deverá ter acesso às funcionalidades relacionadas à sua própria conta e aos seus agendamentos.

---

## 4.3 Dados Cadastrais

A cliente poderá alterar seus próprios dados cadastrais, incluindo:

- Nome;
- Telefone;
- Endereço;
- E-mail;
- Senha.

A cliente não poderá alterar informações referentes aos serviços, profissionais ou configurações do salão.

---

## 4.4 Agendamento

A cliente poderá realizar um novo agendamento.

Para isso, deverá:

1. Escolher o serviço;
2. Escolher a profissional;
3. Escolher a data;
4. Escolher um horário disponível;
5. Confirmar o agendamento.

O sistema deverá apresentar somente profissionais habilitadas para realizar o serviço selecionado.

---

## 4.5 Visualização de Horários

A cliente poderá consultar os horários disponíveis para o serviço e profissional selecionados.

A cliente não deverá visualizar:

- Nome de outras clientes;
- Serviços agendados por outras clientes;
- Informações pessoais de outras clientes.

A cliente deverá visualizar somente a disponibilidade da agenda.

O sistema poderá apresentar o próximo horário disponível e também permitir que a cliente consulte o calendário para visualizar outros horários disponíveis.

---

## 4.6 Histórico

A cliente deverá possuir acesso ao histórico de seus atendimentos.

O histórico deverá permitir a consulta de informações como:

- Data;
- Horário;
- Serviço;
- Profissional;
- Valor;
- Status do atendimento.

---

## 4.7 Cancelamento

A cliente poderá cancelar seu próprio agendamento somente com antecedência mínima de 24 horas.

Após o prazo de 24 horas, a cliente não poderá realizar o cancelamento diretamente pelo sistema.

Nesse caso, deverá existir a possibilidade de solicitar alteração ao salão por meio do canal de comunicação disponibilizado.

Quando um agendamento for cancelado pela cliente, o horário deverá ser liberado novamente para novos agendamentos.

---

## 4.8 Reagendamento

A cliente poderá reagendar seu atendimento desde que respeite a antecedência mínima de 24 horas.

O novo horário deverá passar novamente pela validação de disponibilidade do sistema.

O sistema não deverá permitir que o novo agendamento gere conflito com outro atendimento.

---

# 5. Profissional

## 5.1 Login

A profissional deverá possuir login próprio para acesso ao sistema.

---

## 5.2 Agenda

A profissional poderá visualizar a agenda de todas as profissionais cadastradas no salão.

A visualização da agenda deverá apresentar informações necessárias para o gerenciamento dos atendimentos.

---

## 5.3 Agendamento

A profissional poderá realizar agendamentos para clientes.

O agendamento deverá respeitar as mesmas regras de disponibilidade utilizadas para os agendamentos realizados pelas clientes.

---

## 5.4 Cancelamento e Reagendamento

A profissional poderá:

- Desmarcar agendamentos;
- Reagendar atendimentos.

O sistema deverá registrar a alteração realizada.

---

## 5.5 Status do Atendimento

A profissional poderá informar o resultado do atendimento.

O atendimento poderá ser marcado como:

- Realizado;
- Não realizado.

---

## 5.6 Restrições

A profissional não poderá:

- Cadastrar outras profissionais;
- Alterar profissionais;
- Cadastrar serviços;
- Alterar serviços;
- Alterar preços;
- Alterar duração dos serviços;
- Fechar datas;
- Abrir datas;
- Bloquear horários;
- Liberar horários;
- Gerenciar promoções;
- Emitir relatórios gerenciais.

Essas funcionalidades pertencem à administradora.

---

# 6. Administradora

A administradora será responsável pelo gerenciamento do salão.

A administradora poderá também possuir a função de profissional.

---

## 6.1 Profissionais

A administradora poderá:

- Cadastrar profissionais;
- Alterar dados das profissionais;
- Ativar profissionais;
- Inativar profissionais;
- Definir os serviços que cada profissional pode realizar;
- Definir horários de trabalho;
- Definir dias de trabalho;
- Definir folgas.

Uma profissional poderá realizar vários serviços.

Um mesmo serviço poderá ser realizado por várias profissionais.

---

## 6.2 Serviços

A administradora poderá:

- Cadastrar serviços;
- Alterar serviços;
- Alterar preços;
- Alterar duração;
- Ativar serviços;
- Inativar serviços.

Cada serviço deverá possuir, no mínimo:

- Nome;
- Descrição;
- Preço;
- Duração;
- Status.

---

## 6.3 Alteração de Preços

A alteração do preço de um serviço não deverá modificar os valores registrados em atendimentos anteriores.

O valor praticado no atendimento deverá permanecer registrado no histórico.

---

## 6.4 Alteração de Duração

A administradora poderá alterar a duração de um serviço desde que a alteração não gere conflito com agendamentos existentes.

Caso a nova duração gere conflito com outro atendimento já agendado, a alteração deverá ser impedida até que o conflito seja solucionado por meio de cancelamento ou reagendamento do atendimento afetado.

---

# 7. Agenda do Salão

## 7.1 Horário de Funcionamento

O horário de funcionamento inicialmente previsto para o salão será:

**09:00 às 21:00.**

Essa configuração deverá ser administrável conforme as necessidades do salão.

---

## 7.2 Intervalos entre Atendimentos

Não haverá intervalo obrigatório entre atendimentos.

Um atendimento poderá iniciar imediatamente após o término do atendimento anterior, desde que o horário esteja disponível.

---

## 7.3 Unidade de Horário

O sistema deverá trabalhar com intervalos mínimos de 15 minutos para cálculo da disponibilidade.

Os horários poderão ser apresentados, por exemplo:

- 09:00;
- 09:15;
- 09:30;
- 09:45;
- 10:00.

A duração do serviço determinará o período total ocupado na agenda.

---

# 8. Duração dos Serviços

Cada serviço deverá possuir uma duração própria.

Os serviços poderão possuir durações diferentes, incluindo, por exemplo:

- 15 minutos;
- 30 minutos;
- 1 hora;
- 2 horas;
- 2 horas e 30 minutos.

O sistema deverá utilizar a duração cadastrada para calcular a disponibilidade.

### Exemplo

Se um serviço possui duração de 30 minutos:

**15:30 → 16:00**

Se outro serviço possui duração de 1 hora, ele não poderá ser iniciado às 15:00 caso exista um atendimento entre 15:30 e 16:00.

O sistema deverá procurar outro horário em que o serviço possa ser realizado integralmente.

---

# 9. Serviços Combinados

Serviços combinados deverão ser cadastrados como serviços próprios.

### Exemplo

| Serviço | Duração |
|---|---:|
| Mão | 30 minutos |
| Pé | 30 minutos |
| Pé + Mão | 1 hora |

O serviço **Pé + Mão** será tratado pelo sistema como um único serviço com duração de 1 hora.

A cliente não poderá montar combinações livremente durante o agendamento.

Ela deverá escolher entre os serviços previamente cadastrados pela administradora.

---

# 10. Controle de Disponibilidade

O sistema deverá verificar a disponibilidade antes de permitir um agendamento.

O cálculo deverá considerar:

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

O sistema não deverá permitir sobreposição de atendimentos.

---

# 11. Fechamento de Datas e Horários

A administradora poderá:

- Fechar uma data inteira;
- Abrir uma data anteriormente fechada;
- Bloquear horários específicos;
- Liberar horários anteriormente bloqueados;
- Bloquear a agenda de uma profissional;
- Bloquear a agenda do salão.

---

# 12. Folgas das Profissionais

A administradora poderá definir folgas das profissionais.

As folgas poderão ser:

- Semanais;
- Mensais;
- Permanentes.

Os períodos definidos como folga deverão ser considerados indisponíveis para novos agendamentos.

---

# 13. Feriados

Por padrão, a agenda deverá permanecer fechada em feriados.

A administradora poderá abrir a agenda em um feriado quando houver necessidade de funcionamento excepcional.

---

# 14. Status dos Agendamentos

O sistema deverá registrar o estado de cada atendimento.

Entre os estados previstos estão:

- Agendado;
- Confirmado;
- Cancelado;
- Realizado;
- Não realizado.

O modelo definitivo de status poderá ser refinado durante a modelagem do banco de dados.

---

# 15. Cancelamento e Reagendamento

## 15.1 Cliente

A cliente poderá cancelar ou reagendar um atendimento com antecedência mínima de 24 horas.

Após esse período, a alteração deverá ser solicitada diretamente ao salão por meio do canal de comunicação disponibilizado.

---

## 15.2 Profissional

A profissional poderá desmarcar e reagendar atendimentos conforme as permissões do seu perfil.

---

## 15.3 Administradora

A administradora poderá cancelar ou reagendar atendimentos a qualquer momento.

Quando a administradora cancelar um atendimento, a cliente deverá ser comunicada.

---

# 16. WhatsApp

O sistema deverá utilizar o WhatsApp como canal de comunicação com as clientes.

## 16.1 Confirmação de Agendamento

Após um agendamento, a cliente deverá receber uma confirmação contendo informações como:

- Data;
- Horário;
- Serviço;
- Profissional.

A administradora também deverá ser informada sobre o novo agendamento.

---

## 16.2 Alteração de Agendamento

Quando um atendimento for cancelado ou reagendado, a cliente deverá receber uma comunicação informando a alteração.

---

## 16.3 Lembretes

A cliente deverá receber:

- Um lembrete 24 horas antes do atendimento;
- Um lembrete 1 hora antes do atendimento.

---

# 17. Promoções

A administradora poderá cadastrar promoções para divulgação às clientes cadastradas.

Cada promoção deverá possuir informações como:

- Nome ou título;
- Descrição;
- Serviço relacionado;
- Valor ou condição promocional;
- Data inicial;
- Data final;
- Status.

A promoção deverá possuir período de validade.

A administradora poderá utilizar o sistema para enviar promoções às clientes cadastradas por meio da integração de comunicação disponível.

---

# 18. Relatórios

A administradora deverá possuir acesso a relatórios gerenciais.

Entre os relatórios previstos estão:

- Relatório diário de atendimentos;
- Relatório mensal de atendimentos;
- Atendimentos realizados;
- Atendimentos não realizados;
- Informações por profissional;
- Informações por serviço;
- Valores registrados;
- Previsão financeira.

Os relatórios poderão ser refinados durante a definição das regras de negócio.

---

# 19. Histórico Financeiro

O sistema deverá preservar o valor praticado no momento do atendimento.

Alterações futuras no preço do serviço não deverão modificar registros históricos.

### Exemplo

Um serviço foi realizado por:

**R$ 80,00**

Posteriormente, o preço do serviço foi alterado para:

**R$ 100,00**

O atendimento anterior deverá continuar registrado como:

**R$ 80,00.**

---

# 20. Requisitos de Segurança

O sistema deverá possuir autenticação e autorização.

O acesso às funcionalidades deverá ser controlado de acordo com as funções atribuídas à conta.

Uma conta poderá possuir mais de uma função.

### Exemplo

A dona do salão poderá possuir:

- Administradora;
- Profissional.

Nesse caso, poderá utilizar tanto as funcionalidades administrativas quanto as funcionalidades destinadas à profissional.

---

# 21. Requisitos de Interface

A aplicação deverá ser responsiva.

O sistema deverá funcionar em:

- Celulares;
- Tablets;
- Computadores.

A interface deverá priorizar a utilização em dispositivos móveis, especialmente para o fluxo de agendamento das clientes.

A cliente deverá conseguir acessar o sistema por meio de um link recebido, inclusive através do WhatsApp.

Não será necessária a instalação de um aplicativo mobile para utilização do sistema.

---

# 22. Requisitos Técnicos

A solução será desenvolvida inicialmente utilizando:

### Frontend

- React;
- TypeScript;
- Vite.

### Backend

- Java;
- Spring Boot;
- Spring Security;
- Spring Data JPA;
- Hibernate;
- JWT.

### Banco de Dados

- MySQL.

### Testes

- JUnit;
- Mockito;
- Postman.

### Versionamento

- Git;
- GitHub.

---

# 23. Integrações

O sistema deverá possuir integração com o WhatsApp para comunicação com clientes.

A implementação específica da integração será definida durante a etapa de desenvolvimento, considerando a solução de API escolhida e suas regras de utilização.

---

# 24. Requisitos Não Funcionais

O sistema deverá:

- Possuir interface responsiva;
- Possuir controle de acesso por função;
- Proteger os dados dos usuários;
- Evitar conflitos de agendamento;
- Manter histórico dos atendimentos;
- Manter os valores históricos dos serviços;
- Permitir manutenção dos serviços e profissionais sem apagar informações históricas;
- Possuir estrutura preparada para testes automatizados;
- Utilizar API REST para comunicação entre frontend e backend.

---

# 25. Escopo Inicial

A primeira versão do sistema deverá contemplar:

- Cadastro e login de clientes;
- Cadastro e login de profissionais;
- Acesso administrativo;
- Cadastro e gerenciamento de profissionais;
- Cadastro e gerenciamento de serviços;
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
- Notificações por WhatsApp;
- Cadastro de promoções.

---

# 26. Evolução do Projeto

Os requisitos poderão ser refinados durante as etapas de análise, modelagem, desenvolvimento e testes.

Alterações deverão ser documentadas para manter a rastreabilidade entre:

**Requisitos → Regras de Negócio → Modelagem → Implementação → Testes.**

---

## 📌 Observação

Este documento representa o levantamento inicial de requisitos do sistema **Beleza Fácil** e poderá ser atualizado conforme novas necessidades do negócio sejam identificadas e validadas.
