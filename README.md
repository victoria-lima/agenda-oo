<h1 align="center">
  📇 <br>
  Sistema de Agenda (POO)
</h1>

<p align="center">
  <b>Aplicação Java desenvolvida para gestão de contatos com interface gráfica, persistência de dados e testes automatizados.</b>
</p>

<p align="center">
  <a href="https://www.java.com/" target="_blank">
    <img src="https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
  </a>
  <img src="https://img.shields.io/badge/JUnit-5-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit 5" />
  <img src="https://img.shields.io/badge/Status-Conclu%C3%ADdo-00C853?style=for-the-badge" alt="Status" />
  <img src="https://img.shields.io/badge/UFPB-DCX-0052CC?style=for-the-badge" alt="UFPB DCX" />
</p>

<p align="center">
  <a href="#sobre">💻 Sobre</a> &nbsp;•&nbsp;
  <a href="#funcionalidades">✨ Funcionalidades</a> &nbsp;•&nbsp;
  <a href="#tecnologias">🛠️ Tecnologias</a> &nbsp;•&nbsp;
  <a href="#estrutura">🏛️ Estrutura</a> &nbsp;•&nbsp;
  <a href="#pastas">📁 Pastas</a>
</p>

<a id="sobre"></a>
##
💻 Sobre o Projeto

O **Sistema de Agenda** é uma aplicação desktop desenvolvida em Java adotando a arquitetura **MVC (Model-View-Controller)**. O sistema oferece uma interface gráfica interativa para o gerenciamento de contatos, garantindo a permanência dos registros salvos através de persistência em arquivos locais e a confiabilidade das regras de negócio por meio de testes unitários.

> 🎯 **Objetivo:** Aplicar na prática os pilares de **Programação Orientada a Objetos (POO)**, construção de interfaces gráficas com **Java Swing**, manipulação de arquivos (E/S) para persistência de dados e automação de testes com **JUnit 5**.

<a id="funcionalidades"></a>
##
✨ Funcionalidades

- [x] **➕ Cadastrar Contato:** Adiciona novos contatos informando nome e telefone.
- [x] **🔍 Pesquisar Contato:** Realiza busca dinâmica de contatos cadastrados pelo nome.
- [x] **🗑️ Remover Contato:** Exclui contatos existentes da agenda.
- [x] **💾 Persistência de Dados:** Salva e carrega automaticamente as informações em arquivo local.
- [x] **🖼️ Interface Gráfica:** Tela interativa amigável desenvolvida com Java Swing.

<a id="tecnologias"></a>
##
🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17+)
- **Interface Gráfica:** Java Swing
- **Testes Unitários:** JUnit 5 (Jupiter)
- **IDE Recomendada:** IntelliJ IDEA
- **Controle de Versão:** Git & GitHub

<a id="estrutura"></a>
##
🏛️ Estrutura do Código (Arquitetura MVC)

| Camada / Componente | Descrição / Responsabilidade |
| :--- | :--- |
| 📄 `Contato` & `SistemaAgenda` | **Modelo (Model):** Representação dos dados do contato e contratos/regras da agenda. |
| 🖼️ `JanelaPrincipal` | **Visão (View):** Interface gráfica em Swing com componentes de interação. |
| ⚙️ `AgendaAddController` | **Controlador (Controller):** Gerencia os eventos da interface e orquestra as ações do sistema. |
| 💾 `GravadorDeDados` | **Persistência:** Leitura e escrita dos dados da agenda em arquivos. |
| 🧪 `SistemaAgendaTest` | **Testes Automatizados:** Suíte de testes com JUnit 5 para validação das regras de negócio. |

<a id="pastas"></a>
##
📁 Estrutura de Pastas do Repositório

```text
agenda/
└── 📁 src/
    ├── 📁 main/
    │   └── 📁 java/
    │       └── 📁 br/ufpb/dc/agenda/
    │           ├── 📁 controller/
    │           │   └── 📄 AgendaAddController.java
    │           ├── 📄 Contato.java
    │           ├── 📄 GravadorDeDados.java
    │           ├── 📄 JanelaPrincipal.java
    │           └── 📄 SistemaAgenda.java
    └── 📁 test/
        └── 📁 java/
            └── 📁 br/ufpb/dc/agenda/
                └── 📄 SistemaAgendaTest.java
```
👩‍💻 Autora

Desenvolvido por Victoria Lima como parte das atividades da disciplina de Programação Orientada a Objetos (POO) — UFPB.
