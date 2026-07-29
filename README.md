# Sistema de Agenda (POO)

Projeto de uma aplicação de Agenda de Contatos desenvolvida em **Java**, com interface gráfica (**Swing**), persistência de dados em arquivos e testes automatizados com **JUnit 5**.

---

## Funcionalidades

- **Cadastrar Contato:** Adiciona novos contatos (nome e telefone) ao sistema.
- **Pesquisar Contato:** Busca contatos cadastrados pelo nome.
- **Remover Contato:** Exclui um contato existente da agenda.
- **Persistência de Dados:** Salva e carrega automaticamente os dados de um arquivo local.
- **Interface Gráfica:** Tela interativa construída com Java Swing.

---

## Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17+)
- **Interface Gráfica:** Java Swing
- **Testes Unitários:** JUnit 5 (Jupiter)
- **IDE:** IntelliJ IDEA
- **Controle de Versão:** Git & GitHub

---

## Estrutura do Projeto (Arquitetura MVC)

- `br.ufpb.dc.agenda`: Classes de modelo, interface e janelas da interface gráfica (`JanelaPrincipal`).
- `br.ufpb.dc.agenda.controller`: Controladores da interface gráfica (`AgendaAddController`).
- `br.ufpb.dc.agenda`: Testes automatizados com JUnit (`SistemaAgendaTest`).

---

## 👤 Autora

Desenvolvido por **Victoria Lima** como parte das atividades da disciplina de Programação Orientada a Objetos (POO).
