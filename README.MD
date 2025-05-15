# 💥 Sistema de Cadastro de Personagens - World of Warcraft

Este projeto em Java simula um sistema de cadastro de personagens baseado no jogo **World of Warcraft**, utilizando os principais conceitos de **Programação Orientada a Objetos (POO)** como **herança, polimorfismo, abstração**, além de **processamento paralelo** com `ExecutorService` e `CompletableFuture`.

## 🧠 Conceitos Abordados

### 🔹 Programação Orientada a Objetos (POO)

- **Classe Abstrata (`Character`)**: Serve como modelo base para outros personagens.
- **Herança**: As classes `Warrior`, `Mage` e `Druid` estendem a classe `Character`.
- **Polimorfismo**: Todos os personagens sobrescrevem o método `attack()`, cada um com sua própria implementação.
- **Encapsulamento**: Atributos privados com getters e setters quando necessário.

### 🔹 Processamento Paralelo

- Utilização de `ExecutorService` para criar uma thread pool de 4 threads.
- Uso de `CompletableFuture.supplyAsync()` para simular o processamento de missões de forma assíncrona.
- Execução paralela das tarefas e sincronização com `CompletableFuture.allOf().join()`.

---

## 🗂 Estrutura de Pacotes
```
src/
├── Main (WorldOfWarcraftSystem.java)
└── characters/
├── Character.java (classe abstrata base)
├── Warrior.java (personagem físico)
├── Mage.java (personagem mágico)
└── Druid.java (classe que usa transformação)
```


### Por que criar pacotes?
Os pacotes (`package`) ajudam a organizar o projeto, separando responsabilidades e evitando conflitos de nomes entre classes. Além disso, facilitam a manutenção e o crescimento do código.

---

## 🧪 Como Executar

### Pré-requisitos:
- Java 17+
- IDE ou terminal com suporte a projetos Java


### 📹 Vídeo Explicativo

Gravei uma vídeo-aula explicando esse projeto passo a passo:
https://www.youtube.com/live/Yxioa-jD4MY