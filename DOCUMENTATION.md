# Documentação do Sistema: Beleza Fácil 💇‍♀️💅🧖‍♀️

## 1. Visão Geral

O sistema de agendamento de salão é uma aplicação para gerenciar atendimentos de serviços de cabelo, unhas e depilação.  
Permite o cadastro de clientes, funcionários, serviços, horários de atendimento e pagamentos, com notificações e relatórios básicos.

---

## 2. Objetivo do Sistema

Permitir que o salão organize seus atendimentos de forma eficiente, garantindo:  
- Controle de horários e disponibilidade de funcionários  
- Registro de clientes e histórico de atendimentos  
- Gerenciamento de serviços, preços e durações  
- Registro de pagamentos com diferentes métodos  
- Notificações e lembretes para clientes e funcionários  

---

## 3. Regras de Negócio

1. O sistema deve gerenciar clientes, serviços, funcionários, horários de atendimento e pagamentos.  
2. Cada serviço possui preço e duração específicos.  
3. Serviços podem ser combinados em um único atendimento.  
4. O sistema deve controlar a disponibilidade dos funcionários, bloqueando horários já agendados.  
5. Pagamentos devem ser registrados e possibilitar relatórios diários.  
6. Notificações devem ser enviadas para clientes e funcionários sobre agendamentos futuros.

---

## 4. Requisitos Funcionais (RF)

- **RF01:** Cadastrar clientes com nome, telefone, WhatsApp e histórico de atendimentos.  
- **RF02:** Cadastrar serviços com preço, duração e possibilidade de combinação de serviços.  
- **RF03:** Cadastrar funcionários com nome, especialidade e WhatsApp.  
- **RF04:** Agendar horários de atendimento vinculando cliente, serviço(s) e funcionário.  
- **RF05:** Bloquear horários já agendados para evitar conflitos.  
- **RF06:** Registrar pagamentos via QR Code ou Pix, com valor, forma e data.  
- **RF07:** Gerar relatório diário de pagamentos realizados.  
- **RF08:** Enviar notificações e lembretes sobre agendamentos para clientes e funcionários.

---

## 5. Requisitos Não Funcionais (RNF)

- **RNF01:** O sistema deve ser fácil de usar e intuitivo.  
- **RNF02:** Deve ser compatível com Java (versão 8 ou superior).  
- **RNF03:** Mensagens do sistema devem ser claras e amigáveis.  
- **RNF04:** O desempenho deve ser rápido, mesmo com múltiplos agendamentos simultâneos.  

---

## 6. Fluxo do Usuário / Casos de Uso

**Caso de Uso: Agendar Atendimento**  

1. O usuário (funcionário ou administrador) acessa o sistema.  
2. O sistema solicita os dados do cliente ou permite selecionar cliente existente.  
3. O usuário seleciona o(s) serviço(s) desejado(s).  
4. O sistema exibe horários disponíveis do funcionário selecionado.  
5. O usuário escolhe o horário desejado.  
6. O sistema confirma o agendamento, registra o atendimento e envia notificações ao cliente e funcionário.  
7. Após o atendimento, o pagamento é registrado no sistema.  

---

## 7. Tecnologias Utilizadas

* Java (JDK 8+)  
* Banco de dados: MySQL  
* Terminal / Interface gráfica (GUI futura)  

---

## 8. Possíveis Melhorias Futuras

* Implementar interface gráfica (GUI) para facilitar o uso.  
* Suporte a múltiplos salões e funcionários adicionais.  
* Integração com WhatsApp ou SMS para envio automático de lembretes.  
* Histórico detalhado de pagamentos e atendimentos com gráficos e relatórios avançados.  
* Implementar sistema de fidelidade ou promoções para clientes frequentes.  

---

## 9. Autor

* Daniela Soares — Estudante de Análise de Requisitos e Desenvolvedora em aprendizado
