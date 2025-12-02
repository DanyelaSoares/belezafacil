# Documentação do Sistema: Beleza Fácil 💇‍♀️💅🧖‍♀️

## 1. Visão Geral
O **Beleza Fácil** é um sistema para gerenciamento de salão de beleza, desenvolvido em Java, que permite organizar serviços de cabelo, unhas e depilação.  
O sistema gerencia horários de atendimento, clientes, funcionários, serviços e pagamentos, facilitando o controle diário do salão.  

---

## 2. Objetivo do Sistema
Permitir que o usuário (salão/gerente) organize de forma prática e eficiente:  
- Cadastro de clientes e histórico de atendimentos  
- Serviços oferecidos com preço e duração específicos  
- Funcionários com especialidades  
- Agendamento de serviços  
- Notificações ou lembretes para clientes e funcionários  
- Registro de pagamentos via PIX/Qrcode  
- Relatórios diários de atendimentos e pagamentos  

---

## 3. Regras de Negócio
1. O sistema deve gerenciar três áreas: cabelo, unhas e depilação.  
2. Cada serviço possui **preço e duração específicos**.  
3. Serviços podem ser combinados em um único agendamento.  
4. Cada cliente deve ter cadastro com **nome, telefone, WhatsApp e histórico de atendimentos**.  
5. Funcionários possuem **nome, especialidade e WhatsApp**.  
6. Notificações ou lembretes devem ser enviados a clientes e funcionários antes do horário do agendamento.  
7. Pagamentos podem ser realizados via **PIX/Qrcode** e devem ser registrados no sistema para controle e relatório.  

---

## 4. Requisitos Funcionais (RF)
- **RF01:** Cadastro de clientes (nome, telefone, WhatsApp, histórico)  
- **RF02:** Cadastro de funcionários (nome, especialidade, WhatsApp)  
- **RF03:** Cadastro de serviços (nome, preço, duração, área)  
- **RF04:** Agendamento de serviços, com possibilidade de combinar múltiplos serviços  
- **RF05:** Notificação ou lembrete para clientes e funcionários sobre o agendamento  
- **RF06:** Registro de pagamentos com PIX/Qrcode  
- **RF07:** Geração de relatórios diários de atendimentos e pagamentos  

---

## 5. Requisitos Não Funcionais (RNF)
- **RNF01:** Sistema deve rodar no terminal (sem GUI, inicialmente)  
- **RNF02:** Compatível com Java 8 ou superior  
- **RNF03:** Mensagens do sistema claras e amigáveis  
- **RNF04:** Desempenho rápido mesmo com múltiplos agendamentos e clientes cadastrados  

---

## 6. Fluxo do Usuário / Casos de Uso
**Caso de Uso: Agendar Serviço**  
1. Usuário acessa o sistema.  
2. Sistema lista serviços disponíveis e funcionários.  
3. Usuário escolhe cliente ou cadastra novo cliente.  
4. Usuário seleciona serviço(s) e funcionário responsável.  
5. Sistema verifica disponibilidade de horário.  
6. Agendamento confirmado, sistema envia notificação/lembrete.  
7. Após serviço concluído, usuário registra pagamento (PIX/Qrcode) e atualiza histórico do cliente.  

---

## 7. Possíveis Melhorias Futuras
- Interface gráfica (GUI) para facilitar o uso  
- Integração com agenda de calendário (Google Calendar, Outlook)  
- Sistema de fidelidade ou descontos para clientes frequentes  
- Multiusuário com permissões (recepcionista, gerente)  
- Integração com banco de dados externo  

---

## 8. Tecnologias Utilizadas
- Java (JDK 8+)  
- Terminal / Prompt de Comando  

---

## 9. Autor
**Daniela Soares** — Estudante de Análise de Requisitos e Desenvolvedora em aprendizado  

---

## 10. Documentação Completa
Para detalhes adicionais, fluxos detalhados e regras futuras, consulte: [DOCUMENTATION.md](#)  
