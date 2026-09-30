# 📋 Requisitos do Sistema — Beleza Fácil

## 1. Identificação do Projeto

**Projeto:** Beleza Fácil  
**Tipo:** Sistema Web Responsivo de Agendamento para Salões de Beleza  
**Status:** Em desenvolvimento

O **Beleza Fácil** é um sistema web de agendamento desenvolvido para facilitar o gerenciamento de salões de beleza e proporcionar uma experiência simples para clientes, profissionais e administradores.

Cada estabelecimento poderá configurar suas próprias informações e identidade, como **nome, logotipo, endereço, telefone, horários de funcionamento, serviços e profissionais**, permitindo que o sistema se adapte às características de cada salão.

A cliente poderá acessar o sistema por meio de um link, criar sua conta, consultar os serviços disponíveis, escolher uma profissional, selecionar uma data e horário e acompanhar seus agendamentos.

O sistema também contará com integração com o **WhatsApp** para envio de confirmações, lembretes e comunicações relacionadas aos agendamentos.

---

# 2. Objetivo do Sistema

O sistema tem como objetivo facilitar o processo de agendamento e gerenciamento de serviços de salões de beleza.

O Beleza Fácil deverá permitir:

- Que diferentes estabelecimentos utilizem o sistema;
- Que cada estabelecimento configure suas próprias informações;
- Que cada estabelecimento personalize sua identidade visual;
- Que clientes realizem e acompanhem seus agendamentos;
- Que clientes consultem seu histórico de atendimentos;
- Que clientes possam cancelar ou reagendar atendimentos;
- Que profissionais acompanhem e gerenciem atendimentos;
- Que profissionais realizem agendamentos para clientes;
- Que a administradora gerencie profissionais do estabelecimento;
- Que a administradora gerencie serviços do estabelecimento;
- Que a administradora gerencie a disponibilidade da agenda;
- Que a administradora gerencie agendamentos;
- Que sejam enviados avisos e lembretes por WhatsApp;
- Que a administradora tenha acesso a informações e relatórios do estabelecimento;
- Que a administradora cadastre e divulgue promoções.

---

# 3. Estabelecimento

O sistema deverá permitir que cada estabelecimento possua seus próprios dados, configurações e informações operacionais.

Cada estabelecimento deverá possuir, no mínimo, informações como:

- Nome;
- Logotipo;
- Endereço;
- Telefone;
- WhatsApp;
- E-mail;
- Horários de funcionamento;
- Profissionais;
- Serviços;
- Agendamentos;
- Promoções;
- Configurações de disponibilidade.

As informações de cada estabelecimento deverão ser independentes das informações de outros estabelecimentos cadastrados no sistema.

---

## 3.1 Configuração do Estabelecimento

A administradora deverá poder configurar as informações do estabelecimento ao qual está vinculada.

O sistema deverá permitir o cadastro e a alteração de informações como:

- Nome do estabelecimento;
- Logotipo;
- Endereço;
- Telefone;
- WhatsApp;
- E-mail;
- Horários de funcionamento;
- Informações apresentadas às clientes.

---

## 3.2 Identidade Visual

O sistema deverá permitir que o estabelecimento configure elementos de sua identidade visual.

Entre os elementos configuráveis poderão estar:

- Logotipo;
- Cor principal;
- Cor secundária;
- Outros elementos visuais definidos durante o desenvolvimento.

A identidade visual configurada deverá ser apresentada nas áreas públicas destinadas às clientes, quando aplicável.

---

## 3.3 Isolamento entre Estabelecimentos

Os dados de um estabelecimento não poderão ser visualizados ou alterados indevidamente por usuários vinculados a outro estabelecimento.

As informações relacionadas a:

- Clientes;
- Profissionais;
- Serviços;
- Agendamentos;
- Horários;
- Bloqueios;
- Promoções;
- Relatórios;
- Configurações;

deverão estar vinculadas ao respectivo estabelecimento.

---

# 4. Perfis de Acesso

O sistema possuirá três funções principais:

- Cliente;
- Profissional;
- Administradora.

Uma mesma conta poderá possuir mais de uma função.

### Exemplo

A dona do salão poderá possuir simultaneamente as funções:

- Administradora;
- Profissional.

Nesse caso, poderá utilizar as funcionalidades correspondentes às duas funções.

As permissões de cada função deverão respeitar o estabelecimento ao qual a conta estiver vinculada.

---

# 5. Requisitos Funcionais

## 5.1 Cliente

### RF001 — Cadastro de cliente

O sistema deverá permitir que a cliente crie sua própria conta.

O cadastro deverá permitir informações como:

- Nome;
- Telefone;
- Endereço;
- E-mail;
- Senha.

O e-mail será opcional.

A conta da cliente deverá estar vinculada ao estabelecimento no qual ela realizar seu cadastro ou utilizar o sistema, conforme definição da implementação.

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

O sistema deverá permitir que a cliente consulte os serviços disponibilizados pelo estabelecimento.

---

### RF005 — Seleção de profissional

O sistema deverá permitir que a cliente escolha uma profissional para realizar o serviço selecionado.

O sistema deverá apresentar somente profissionais habilitadas para realizar o serviço escolhido e vinculadas ao estabelecimento.

---

### RF006 — Consulta de disponibilidade

O sistema deverá permitir que a cliente consulte os horários disponíveis para o serviço e profissional selecionados.

A disponibilidade deverá considerar:

- Horário de funcionamento do estabelecimento;
- Horário de trabalho da profissional;
- Folgas;
- Bloqueios;
- Agendamentos existentes;
- Duração do serviço;
- Datas não disponíveis.

---

### RF007 — Realização de agendamento

O sistema deverá permitir que a cliente realize um agendamento informando:

1. Serviço;
2. Profissional;
3. Data;
4. Horário.

O sistema deverá validar a disponibilidade antes de confirmar o agendamento.

---

### RF008 — Consulta de agendamentos

A cliente deverá poder visualizar seus agendamentos.

As informações apresentadas deverão incluir, quando aplicável:

- Estabelecimento;
- Serviço;
- Profissional;
- Data;
- Horário;
- Status do agendamento.

---

### RF009 — Cancelamento de agendamento

O sistema deverá permitir que a cliente cancele seus próprios agendamentos, respeitando as regras de cancelamento definidas pelo sistema.

---

### RF010 — Reagendamento

O sistema deverá permitir que a cliente solicite ou realize o reagendamento de seus próprios atendimentos, respeitando as regras estabelecidas.

---

### RF011 — Histórico de atendimentos

O sistema deverá permitir que a cliente consulte seu histórico de atendimentos realizados.

O histórico deverá preservar as informações necessárias para consulta posterior.

---

# 6. Profissional

### RF012 — Acesso da profissional

O sistema deverá permitir que a profissional realize login e acesse as funcionalidades correspondentes à sua função.

---

### RF013 — Visualização da agenda

A profissional poderá visualizar a agenda das profissionais do estabelecimento ao qual está vinculada, respeitando as permissões definidas pelo sistema.

---

### RF014 — Agendamento para cliente

O sistema deverá permitir que a profissional realize agendamentos para clientes.

---

### RF015 — Cancelamento de agendamento

A profissional poderá cancelar agendamentos de acordo com as permissões definidas pelo sistema.

---

### RF016 — Reagendamento de atendimento

A profissional poderá reagendar atendimentos de acordo com as permissões definidas pelo sistema.

---

### RF017 — Registro do atendimento

A profissional deverá poder registrar o resultado do atendimento como:

- Realizado;
- Não realizado.

---

# 7. Administradora

### RF018 — Acesso administrativo

O sistema deverá permitir que a administradora acesse as funcionalidades administrativas do estabelecimento ao qual está vinculada.

---

### RF019 — Gerenciamento de profissionais

A administradora poderá:

- Cadastrar profissionais;
- Alterar dados das profissionais;
- Ativar profissionais;
- Desativar profissionais;
- Definir os serviços que cada profissional poderá realizar.

---

### RF020 — Gerenciamento de serviços

A administradora poderá:

- Cadastrar serviços;
- Alterar serviços;
- Ativar serviços;
- Desativar serviços;
- Definir preços;
- Definir duração.

---

### RF021 — Gerenciamento de preços

O sistema deverá permitir que a administradora configure os preços dos serviços.

Alterações de preço não deverão apagar os valores históricos já utilizados em atendimentos anteriores.

---

### RF022 — Gerenciamento da duração dos serviços

A administradora poderá definir ou alterar a duração dos serviços disponibilizados pelo estabelecimento.

---

### RF023 — Gerenciamento da agenda

A administradora poderá configurar:

- Dias de funcionamento;
- Horários de funcionamento;
- Horários de trabalho das profissionais;
- Folgas;
- Bloqueios;
- Datas indisponíveis.

---

### RF024 — Gerenciamento de agendamentos

A administradora poderá consultar, cancelar e reagendar agendamentos do estabelecimento.

---

### RF025 — Gerenciamento de promoções

A administradora poderá cadastrar e gerenciar promoções relacionadas aos serviços do estabelecimento.

---

### RF026 — Consulta de relatórios

A administradora poderá consultar relatórios relacionados às atividades do estabelecimento.

---

### RF027 — Gerenciamento das configurações do estabelecimento

A administradora poderá cadastrar e alterar as informações e configurações do estabelecimento, respeitando as funcionalidades disponibilizadas pelo sistema.

---

# 8. Serviços

### RF028 — Cadastro de serviços

O sistema deverá permitir que a administradora cadastre serviços contendo, no mínimo:

- Nome;
- Descrição;
- Preço;
- Duração;
- Status.

---

### RF029 — Associação entre profissionais e serviços

O sistema deverá permitir associar profissionais aos serviços que estão habilitadas a realizar.

Uma profissional poderá realizar vários serviços.

Um serviço poderá ser realizado por várias profissionais.

---

# 9. Agenda e Disponibilidade

### RF030 — Configuração do horário de funcionamento

O sistema deverá permitir configurar os horários de funcionamento do estabelecimento.

O horário inicial considerado para o sistema será:

**09:00 às 21:00.**

Esse horário deverá ser configurável pela administradora.

---

### RF031 — Disponibilidade em intervalos de 15 minutos

Os horários disponíveis para agendamento deverão ser apresentados em intervalos de 15 minutos.

---

### RF032 — Validação da duração do serviço

O sistema deverá verificar se o serviço escolhido possui tempo suficiente para ser realizado integralmente dentro do horário disponível.

---

### RF033 — Controle de conflitos

O sistema deverá impedir a criação de agendamentos que apresentem conflito com:

- Outro agendamento da profissional;
- Horário de trabalho;
- Folgas;
- Bloqueios;
- Datas indisponíveis;
- Horário de funcionamento do estabelecimento.

---

### RF034 — Consulta de próximos horários disponíveis

O sistema poderá apresentar os próximos horários disponíveis quando não houver disponibilidade para a data selecionada.

---

# 10. Atendimento e Histórico

### RF035 — Registro do atendimento

O sistema deverá permitir o registro do resultado do atendimento como:

- Realizado;
- Não realizado.

---

### RF036 — Preservação do histórico

O sistema deverá preservar os dados dos atendimentos realizados para consulta futura.

O histórico deverá manter informações relevantes, incluindo os valores utilizados no momento do atendimento.

---

# 11. Promoções

### RF037 — Cadastro de promoção

A administradora poderá cadastrar promoções contendo informações como:

- Título;
- Descrição;
- Serviço relacionado;
- Valor promocional ou condição;
- Data de início;
- Data de término;
- Status.

---

### RF038 — Gerenciamento de promoção

A administradora poderá:

- Criar promoções;
- Alterar promoções;
- Ativar promoções;
- Desativar promoções.

---

### RF039 — Divulgação de promoções

O sistema deverá permitir a divulgação das promoções por meio dos canais de comunicação disponíveis, incluindo integração com WhatsApp quando aplicável.

---

# 12. Relatórios e Informações Gerenciais

### RF040 — Relatório de agendamentos

O sistema deverá permitir consultar os agendamentos do estabelecimento.

---

### RF041 — Relatório por período

O sistema deverá permitir consultar informações de agendamentos por período.

---

### RF042 — Relatório por profissional

O sistema deverá permitir consultar informações relacionadas aos atendimentos realizados por profissional.

---

### RF043 — Relatório por serviço

O sistema deverá permitir consultar informações relacionadas aos serviços realizados.

---

### RF044 — Registro de valores

O sistema deverá permitir consultar os valores associados aos atendimentos realizados.

---

### RF045 — Previsão financeira

O sistema deverá permitir apresentar informações que auxiliem na previsão financeira do estabelecimento.

---

# 13. Comunicação por WhatsApp

### RF046 — Confirmação de agendamento

O sistema deverá permitir o envio de confirmação de agendamento por WhatsApp, quando a integração estiver disponível.

---

### RF047 — Lembrete de atendimento

O sistema deverá permitir o envio de lembretes de atendimento por WhatsApp.

Os lembretes deverão considerar, inicialmente:

- 24 horas antes;
- 1 hora antes.

---

### RF048 — Comunicação sobre alterações

O sistema deverá permitir o envio de comunicações relacionadas a alterações ou cancelamentos de agendamentos.

---

### RF049 — Divulgação de promoções

O sistema poderá utilizar a integração com WhatsApp para divulgação de promoções do estabelecimento, respeitando as regras da integração utilizada.

---

# 14. Segurança e Controle de Acesso

### RF050 — Autenticação

O sistema deverá possuir mecanismo de autenticação para acesso às áreas restritas.

---

### RF051 — Autorização por função

O sistema deverá controlar o acesso às funcionalidades conforme a função atribuída à conta.

---

### RF052 — Controle de acesso por estabelecimento

O sistema deverá garantir que usuários administrativos tenham acesso somente às informações e funcionalidades do estabelecimento ao qual estão vinculados.

---

### RF053 — Proteção dos dados

O sistema deverá impedir acesso não autorizado aos dados dos usuários e dos estabelecimentos.

---

### RF054 — Controle de múltiplas funções

Uma mesma conta poderá possuir mais de uma função, devendo o sistema aplicar as permissões correspondentes a cada função.

---

# 15. Interface e Acesso

### RF055 — Interface responsiva

A aplicação deverá funcionar em:

- Celulares;
- Tablets;
- Computadores.

---

### RF056 — Acesso por link

A cliente deverá poder acessar o sistema por meio de um link disponibilizado pelo estabelecimento.

---

### RF057 — Interface personalizada por estabelecimento

A área pública do sistema deverá apresentar, quando aplicável, as informações e identidade visual configuradas pelo estabelecimento.

---

### RF058 — Acesso sem instalação de aplicativo

A cliente deverá poder utilizar o sistema por meio do navegador, sem necessidade de instalação de aplicativo mobile.

---

# 16. Requisitos Não Funcionais

### RNF001 — Responsividade

A aplicação deverá possuir interface responsiva e adequada para diferentes tamanhos de tela.

---

### RNF002 — API REST

A comunicação entre frontend e backend deverá utilizar uma API REST.

---

### RNF003 — Segurança dos dados

O sistema deverá proteger os dados dos usuários e restringir o acesso às funcionalidades conforme as permissões da conta e do estabelecimento.

---

### RNF004 — Integridade dos agendamentos

O sistema deverá evitar conflitos de horários e impedir a criação de agendamentos incompatíveis com a disponibilidade existente.

---

### RNF005 — Preservação do histórico

O sistema deverá preservar os dados necessários para consulta do histórico de atendimentos e dos valores históricos dos serviços.

---

### RNF006 — Isolamento dos dados dos estabelecimentos

Os dados pertencentes a um estabelecimento não deverão ser disponibilizados indevidamente a outro estabelecimento.

---

### RNF007 — Testabilidade

A aplicação deverá possuir estrutura que permita a realização de testes automatizados e testes de API.

---

# 17. Requisitos Técnicos

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

# 18. Integrações

### RI001 — Integração com WhatsApp

O sistema deverá possuir integração com o WhatsApp para comunicação com clientes e divulgação de promoções.

A solução técnica específica da integração será definida durante a etapa de desenvolvimento, considerando a API escolhida e suas regras de utilização.

---

# 19. Escopo Inicial

A primeira versão do sistema deverá contemplar:

- Cadastro e login de clientes;
- Cadastro e login de profissionais;
- Acesso administrativo;
- Cadastro e gerenciamento de estabelecimentos;
- Configuração das informações do estabelecimento;
- Configuração da identidade visual do estabelecimento;
- Gerenciamento de profissionais;
- Gerenciamento de serviços;
- Controle de preços;
- Controle de duração dos serviços;
- Associação entre profissionais e serviços;
- Controle de disponibilidade;
- Agendamentos;
- Cancelamentos;
- Reagendamentos;
- Histórico de atendimentos;
- Registro de atendimentos realizados e não realizados;
- Relatórios básicos;
- Previsão financeira;
- Notificações por WhatsApp;
- Cadastro de promoções;
- Controle de acesso por função;
- Controle de acesso por estabelecimento.

---

# 20. Rastreabilidade

Os requisitos deverão manter rastreabilidade durante as etapas de desenvolvimento do projeto.

A relação deverá ser mantida entre:

**Requisitos → Regras de Negócio → Casos de Uso → Modelagem → Implementação → Testes**

Alterações nos requisitos deverão ser documentadas para evitar inconsistências entre a especificação e o sistema implementado.

---

## 📌 Observação

Este documento representa a especificação dos requisitos do sistema **Beleza Fácil** e poderá ser atualizado conforme as necessidades do negócio forem refinadas e validadas durante as etapas de análise, modelagem, desenvolvimento e testes.
