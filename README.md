# 🎓 Sistema Acadêmico - Deploy Full-Stack

## 📖 Sobre o Projeto
Este projeto nasceu como uma atividade de sala de aula da faculdade, mas decidi expandi-lo para um laboratório real de arquitetura de software. O objetivo principal foi transformar um sistema local em uma **Prova de Conceito (PoC)** totalmente funcional na internet, testando o ciclo completo de desenvolvimento e *deploy* de uma aplicação Full-Stack.

Através deste projeto, foi possível validar na prática a separação de responsabilidades entre o cliente (Front-end) e o servidor (Back-end), bem como a configuração de infraestrutura em nuvem.

## 🚀 Arquitetura e Passo a Passo

Para colocar este ecossistema no ar, o projeto foi estruturado nas seguintes etapas:

* **1. Modernização do Front-end (HTML, JS e CSS Moderno):** A interface foi construída do zero separando a lógica da estrutura. O design foi modernizado utilizando os recursos mais atuais do **CSS nativo**, implementando *CSS Nesting* (aninhamento) e *CSS Variables* para garantir uma estilização limpa, responsiva e de fácil manutenção, sem a necessidade de frameworks externos.

* **2. Integração e Consumo de API (JavaScript):** Implementação de requisições assíncronas via `fetch` para que a interface web pudesse consultar e exibir dinamicamente os dados processados pelo motor do sistema.

* **3. Back-end e Nuvem (Java + Render):** O maior desafio técnico foi retirar o código do ambiente `localhost`. A API construída em **Java** foi conteinerizada via Docker e hospedada na plataforma **Render**, criando um servidor real e ininterrupto na internet que agora responde às requisições do Front-end.

## 🛠️ Tecnologias Utilizadas
* **Back-end:** Java 
* **Front-end:** HTML5, CSS3 (Moderno/Nesting) e JavaScript (Vanilla)
* **Infraestrutura/Deploy:** Docker, Render e GitHub Pages
* **Versionamento:** Git & GitHub

## 🎯 Conclusão e Próximos Passos
Este laboratório foi um sucesso para consolidar o entendimento de como subir aplicações completas para a internet. O fluxo de deploy ponta a ponta validado aqui servirá como base estrutural para os meus futuros projetos e aplicações mais complexas.
