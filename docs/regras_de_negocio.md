# 📐 Regras de Negócio — Beleza Fácil

Este documento apresenta as regras de negócio que deverão ser respeitadas pelo sistema **Beleza Fácil**.

As regras definem as condições para funcionamento dos usuários, serviços, profissionais, agenda, agendamentos, cancelamentos, notificações e demais operações do sistema.

---

# 1. Perfis e Permissões

## RN001 — Perfis de acesso

O sistema deverá possuir três funções principais:

- Cliente;
- Profissional;
- Administradora.

Uma mesma conta poderá possuir mais de uma função.

---

## RN002 — Administradora também pode ser profissional

A administradora poderá exercer também a função de profissional.

Nesse caso, a mesma conta poderá possuir as funções:

- Administradora;
- Profissional.

A pessoa poderá administrar o salão e também realizar atendimentos.

---

## RN003 — Permissões da cliente

A cliente poderá acessar e alterar somente seus próprios dados e seus próprios agendamentos, respeitando as regras de cancelamento e reagendamento.

---

## RN004 — Permissões da profissional

A profissional poderá:

- Visualizar a agenda das profissionais;
- Realizar agendamentos;
- Desmarcar agendamentos;
- Reagendar atendimentos;
- Marcar atendimentos como realizados;
- Marcar atendimentos como não realizados.

A profissional não poderá alterar configurações administrativas do salão.

---

## RN005 — Permissões da administradora

A administradora poderá gerenciar:

- Profissionais;
- Serviços;
- Preços;
- Duração dos serviços;
- Datas;
- Horários;
- Agendamentos;
- Relatórios;
- Promoções.

---

# 2. Clientes

## RN006 — Alteração dos dados cadastrais

A cliente poderá alterar seus próprios dados cadastrais.

Entre os dados que poderão ser alterados estão:

- Nome;
- Telefone;
- Endereço;
- E-mail;
- Senha.

A alteração dos dados de uma cliente não poderá permitir acesso ou alteração dos dados de outras clientes.

---

# 3. Profissionais

## RN007 — Cadastro de profissionais

Somente a administradora poderá cadastrar profissionais.

---

## RN008 — Serviços realizados pela profissional

Uma profissional poderá realizar vários serviços.

Um mesmo serviço poderá ser realizado por várias profissionais.

O sistema deverá permitir que a administradora defina quais serviços cada profissional está habilitada a realizar.

---

## RN009 — Disponibilidade da profissional

A disponibilidade de uma profissional deverá considerar:

- Dias de trabalho;
- Horário de trabalho;
- Folgas;
- Bloqueios;
- Agendamentos existentes.

---

# 4. Serviços

## RN010 — Cadastro de serviços

Os serviços deverão ser cadastrados previamente pela administradora.

Cada serviço deverá possuir, no mínimo:

- Nome;
- Descrição;
- Preço;
- Duração;
- Status.

---

## RN011 — Serviços pré-cadastrados

A cliente deverá escolher entre os serviços disponibilizados pelo salão.

A cliente não poderá criar combinações de serviços durante o processo de agendamento.

---

## RN012 — Serviços combinados

Serviços combinados deverão ser cadastrados como serviços independentes.

Exemplo:

- Mão — 30 minutos;
- Pé — 30 minutos;
- Pé + Mão — 1 hora.

O serviço "Pé + Mão" deverá ser tratado pelo sistema como um único serviço com duração de 1 hora.

---

## RN013 — Inativação de serviços

Quando um serviço for inativado, ele não deverá aparecer para novos agendamentos.

Os registros históricos relacionados ao serviço deverão ser preservados.

---

# 5. Preços

## RN014 — Alteração de preço

Somente a administradora poderá alterar o preço de um serviço.

---

## RN015 — Preservação do valor histórico

A alteração do preço de um serviço não poderá modificar o valor registrado em agendamentos ou atendimentos anteriores.

### Exemplo

Um serviço foi realizado por:

**R$ 80,00**

Posteriormente, seu preço foi alterado para:

**R$ 100,00**

O atendimento anterior deverá continuar registrado como:

**R$ 80,00.**

---

# 6. Duração dos Serviços

## RN016 — Duração individual

Cada serviço deverá possuir uma duração definida.

A duração poderá variar de acordo com o serviço.

Exemplos:

- 15 minutos;
- 30 minutos;
- 1 hora;
- 2 horas;
- 2 horas e 30 minutos.

---

## RN017 — Alteração da duração

A administradora poderá alterar a duração de um serviço desde que a alteração não gere conflitos com agendamentos existentes.

---

## RN018 — Conflito causado por alteração de duração

Caso uma nova duração gere conflito com outro atendimento já agendado, o sistema não deverá permitir a alteração enquanto o conflito existir.

O conflito deverá ser solucionado por meio de cancelamento ou reagendamento do atendimento afetado.

---

# 7. Disponibilidade de Horários

## RN019 — Intervalo de cálculo

O sistema deverá utilizar intervalos de 15 minutos para cálculo da disponibilidade.

Exemplos:

- 09:00;
- 09:15;
- 09:30;
- 09:45;
- 10:00.

---

## RN020 — Duração integral do serviço

A disponibilidade deverá considerar todo o período necessário para executar o serviço.

O sistema não deverá verificar somente se o horário inicial está livre.

---

## RN021 — Conflito de horários

O sistema não poderá permitir que dois atendimentos da mesma profissional ocupem períodos sobrepostos.

### Exemplo

Existe um atendimento:

**15:30 → 16:00**

Uma cliente tenta agendar um serviço de 1 hora às:

**15:00 → 16:00**

O sistema deverá impedir o agendamento porque os períodos se sobrepõem.

---

## RN022 — Próximo horário disponível

Quando o horário solicitado não estiver disponível, o sistema deverá procurar outro horário em que o serviço possa ser realizado integralmente.

O sistema deverá apresentar o próximo horário disponível.

---

## RN023 — Consulta do calendário

A cliente poderá abrir o calendário para visualizar outros horários disponíveis.

A cliente não poderá visualizar:

- Nome de outras clientes;
- Serviço realizado por outra cliente;
- Informações pessoais de outras clientes.

Somente a disponibilidade deverá ser apresentada.

---

# 8. Funcionamento do Salão

## RN024 — Horário padrão

O horário de funcionamento inicialmente definido para o salão será:

**09:00 às 21:00.**

Esse horário poderá ser administrado conforme as necessidades do salão.

---

## RN025 — Ausência de intervalo obrigatório

Não haverá intervalo obrigatório entre atendimentos.

Um novo atendimento poderá iniciar imediatamente após o término do atendimento anterior, desde que o horário esteja disponível.

---

# 9. Folgas

## RN026 — Definição de folgas

A administradora poderá definir folgas das profissionais.

As folgas poderão ser:

- Semanais;
- Mensais;
- Permanentes.

Os períodos definidos como folga deverão ser considerados indisponíveis para novos agendamentos.

---

# 10. Datas e Horários Bloqueados

## RN027 — Fechamento de datas

A administradora poderá fechar uma data inteira para novos agendamentos.

---

## RN028 — Abertura de datas

A administradora poderá reabrir uma data anteriormente fechada.

---

## RN029 — Bloqueio de horários

A administradora poderá bloquear horários específicos para novos agendamentos.

---

## RN030 — Liberação de horários

A administradora poderá liberar horários anteriormente bloqueados.

---

## RN031 — Bloqueio de profissional

A administradora poderá bloquear a agenda de uma profissional.

Nesse período, a profissional não deverá aparecer como disponível para novos agendamentos.

---

## RN032 — Bloqueio do salão

A administradora poderá bloquear a agenda do salão inteiro.

Durante o período bloqueado, nenhum novo agendamento deverá ser permitido.

---

# 11. Feriados

## RN033 — Fechamento em feriados

Por padrão, a agenda deverá permanecer fechada em feriados.

---

## RN034 — Funcionamento excepcional em feriados

A administradora poderá abrir a agenda em um feriado quando houver necessidade de funcionamento excepcional.

---

# 12. Agendamentos

## RN035 — Seleção do serviço

A cliente deverá selecionar um serviço antes de escolher o horário.

---

## RN036 — Seleção da profissional

A cliente deverá selecionar uma profissional habilitada para realizar o serviço escolhido.

---

## RN037 — Validação de disponibilidade

Todo agendamento deverá passar pela validação de disponibilidade antes de ser confirmado.

---

## RN038 — Conflito de agendamento

O sistema não deverá permitir a criação de um agendamento que gere conflito com outro atendimento da mesma profissional.

---

## RN039 — Agendamento realizado pela profissional

A profissional poderá realizar agendamentos para clientes.

Os mesmos deverão respeitar as regras de disponibilidade do sistema.

---

# 13. Status dos Atendimentos

## RN040 — Registro do status

O sistema deverá registrar o status do atendimento.

Os estados previstos incluem:

- Agendado;
- Confirmado;
- Cancelado;
- Realizado;
- Não realizado.

---

## RN041 — Atendimento realizado

A profissional ou administradora poderá marcar um atendimento como realizado.

---

## RN042 — Atendimento não realizado

A profissional ou administradora poderá marcar um atendimento como não realizado.

---

# 14. Cancelamento

## RN043 — Cancelamento pela cliente

A cliente poderá cancelar seu próprio agendamento somente com antecedência mínima de 24 horas.

---

## RN044 — Cancelamento após o prazo

Após o prazo de 24 horas, a cliente não poderá cancelar diretamente pelo sistema.

Nesse caso, deverá solicitar a alteração ao salão por meio do canal de comunicação disponibilizado.

---

## RN045 — Cancelamento pela profissional

A profissional poderá desmarcar agendamentos.

---

## RN046 — Cancelamento pela administradora

A administradora poderá cancelar agendamentos a qualquer momento.

---

## RN047 — Liberação do horário

Quando um agendamento for cancelado, o horário deverá ser liberado imediatamente para novos agendamentos, desde que não exista outro bloqueio ou restrição.

---

# 15. Reagendamento

## RN048 — Reagendamento pela cliente

A cliente poderá reagendar seu atendimento somente com antecedência mínima de 24 horas.

---

## RN049 — Validação do novo horário

O novo horário deverá passar novamente por todas as regras de disponibilidade.

---

## RN050 — Reagendamento pela profissional

A profissional poderá reagendar atendimentos.

---

## RN051 — Reagendamento pela administradora

A administradora poderá reagendar atendimentos.

---

# 16. Histórico

## RN052 — Preservação do histórico

O cancelamento ou alteração de um serviço não deverá apagar registros históricos de atendimentos.

---

## RN053 — Histórico da cliente

A cliente deverá conseguir consultar seu histórico de atendimentos.

O histórico deverá preservar informações como:

- Data;
- Horário;
- Serviço;
- Profissional;
- Valor;
- Status.

---

# 17. WhatsApp

## RN054 — Confirmação do agendamento

Após a realização de um agendamento, a cliente deverá receber uma mensagem de confirmação contendo, no mínimo:

- Data;
- Horário;
- Serviço;
- Profissional.

---

## RN055 — Comunicação com a administradora

A administradora deverá ser informada quando um novo agendamento for realizado.

---

## RN056 — Alteração do agendamento

Quando um agendamento for cancelado ou reagendado, a cliente deverá receber uma comunicação informando a alteração.

---

## RN057 — Lembrete de 24 horas

A cliente deverá receber um lembrete aproximadamente 24 horas antes do atendimento.

---

## RN058 — Lembrete de 1 hora

A cliente deverá receber um segundo lembrete aproximadamente 1 hora antes do atendimento.

---

# 18. Promoções

## RN059 — Cadastro de promoções

A administradora poderá cadastrar promoções.

---

## RN060 — Validade da promoção

Toda promoção deverá possuir um período de validade.

A promoção deverá possuir:

- Data inicial;
- Data final;
- Status.

---

## RN061 — Divulgação de promoções

A administradora poderá utilizar o sistema para enviar promoções às clientes cadastradas por meio da integração de comunicação disponível.

---

# 19. Relatórios

## RN062 — Relatório diário

A administradora deverá poder consultar informações dos atendimentos realizados em determinado dia.

---

## RN063 — Relatório mensal

A administradora deverá poder consultar informações dos atendimentos realizados em determinado mês.

---

## RN064 — Previsão financeira

A administradora deverá possuir acesso a informações que permitam acompanhar a previsão financeira do salão.

Os critérios de cálculo da previsão financeira serão definidos durante a implementação das regras financeiras.

---

# 20. Segurança e Autorização

## RN065 — Controle de acesso

O sistema deverá verificar a função da conta antes de permitir acesso às funcionalidades.

---

## RN066 — Acesso aos próprios dados

A cliente deverá acessar e alterar somente seus próprios dados cadastrais.

---

## RN067 — Proteção das funcionalidades administrativas

Funcionalidades administrativas deverão estar disponíveis somente para contas com função de administradora.

---

## RN068 — Acúmulo de funções

Uma conta poderá possuir mais de uma função.

### Exemplo

A dona do salão poderá possuir:

- Administradora;
- Profissional.

Nesse caso, ela deverá ter acesso às funcionalidades correspondentes às duas funções.

---

# 21. Integridade dos Dados

## RN069 — Preservação dos registros

Registros históricos não deverão ser apagados simplesmente porque um serviço, profissional ou configuração deixou de estar ativo.

---

## RN070 — Inativação

Quando possível, informações que não deverão mais ser utilizadas em novos registros deverão ser inativadas em vez de excluídas fisicamente.

Isso permitirá preservar o histórico do sistema.

---

# 22. Princípio Geral de Disponibilidade

## RN071 — Disponibilidade real

Um horário somente deverá ser apresentado como disponível quando houver tempo suficiente para executar integralmente o serviço escolhido.

O sistema deverá considerar simultaneamente:

- Horário de funcionamento;
- Profissional;
- Serviço;
- Duração;
- Agendamentos existentes;
- Folgas;
- Bloqueios;
- Datas fechadas;
- Demais restrições aplicáveis.

---

# 📌 Observações

As regras deste documento poderão ser refinadas durante as etapas de:

**Levantamento → Modelagem → Desenvolvimento → Testes.**

Alterações nas regras deverão ser documentadas para manter a rastreabilidade entre os requisitos, a implementação e os casos de teste.
