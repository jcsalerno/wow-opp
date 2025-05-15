# 💥 Sistema de Cadastro de Personagens - World of Warcraft

Este projeto em Java simula um sistema de cadastro de personagens baseado no jogo **World of Warcraft**, utilizando os principais conceitos de **Programação Orientada a Objetos (POO)** como **herança, polimorfismo, abstração**, além de **processamento paralelo** com `ExecutorService` e `CompletableFuture`.

## 🧠 Conceitos Abordados

### ✩ Programação Orientada a Objetos (POO)

* **Classe Abstrata (`Character`)**: Serve como modelo base para outros personagens.
* **Herança**: As classes `Warrior`, `Mage` e `Druid` estendem a classe `Character`.
* **Polimorfismo**: Todos os personagens sobrescrevem o método `attack()`, cada um com sua própria implementação.
* **Encapsulamento**: Atributos privados com getters e setters quando necessário.

### ✩ Processamento Paralelo

* Utilização de `ExecutorService` para criar uma thread pool de 4 threads.
* Uso de `CompletableFuture.supplyAsync()` para simular o processamento de missões de forma assíncrona.
* Execução paralela das tarefas e sincronização com `CompletableFuture.allOf().join()`.

---

## 📂 Estrutura de Pacotes

```
src/
├── Main (WorldOfWarcraftSystem.java)
└── characters/
    ├── Character.java       (classe abstrata base)
    ├── Warrior.java         (personagem físico)
    ├── Mage.java            (personagem mágico)
    └── Druid.java           (classe que usa transformação)
```

### Por que criar pacotes?

Os pacotes (`package`) ajudam a organizar o projeto, separando responsabilidades e evitando conflitos de nomes entre classes. Além disso, facilitam a manutenção e o crescimento do código.

---

## 🧪 Como Executar

### Pré-requisitos:

* Java 17+
* IDE ou terminal com suporte a projetos Java

### Passo a passo:

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/wow-characters.git
cd wow-characters
```

2. Compile e execute:

```bash
javac src/WorldOfWarcraftSystem.java
java -cp src WorldOfWarcraftSystem
```

---

## 🧙‍♂️ Exemplo de Saída Esperada

```
Garrosh ataca com um machado gigante!
Jaina lança uma bola de fogo!
Malfurion ataca na forma felina!

--- Processando missões em paralelo ---
Garrosh completou a missão com sucesso!
Malfurion completou a missão com sucesso!
Jaina completou a missão com sucesso!
```

⚠️ A ordem da saída das missões pode variar a cada execução, pois o processamento é feito em paralelo!

---

## ✍️ Explicações Extras

### O que é uma classe abstrata?

Uma classe que **não pode ser instanciada diretamente**, servindo apenas como base para outras classes. Ela pode ter métodos abstratos (sem implementação) que obrigam as subclasses a implementarem.

### O que é polimorfismo?

Capacidade de **um objeto se comportar de diferentes formas** dependendo de seu tipo. Aqui, usamos o método `attack()` de forma polimórfica: cada personagem ataca de uma forma, mesmo usando o mesmo método.

### O que é forEach()?

É um método de collections que **itera sobre todos os elementos da lista**, de forma elegante e funcional:

```java
characters.forEach(c -> System.out.println(c.attack()));
```

### O que é `ExecutorService`?

Um serviço que gerencia threads de forma eficiente, evitando que você crie e destrua threads manualmente.

### O que é `CompletableFuture`?

Uma classe para **programação assíncrona e não bloqueante**, permitindo rodar tarefas em paralelo e combinar resultados.

---

## 📽️ Vídeo Explicativo

Gravei uma vídeo-aula explicando esse projeto passo a passo:
👉 [Assista aqui](https://www.youtube.com/live/Yxioa-jD4MY)

---

## 📘 Autor

**Julio Cesar Salerno da Silva**
Desenvolvedor Java Back-End
[GitHub](https://github.com/jcsalerno) • [Portfólio](https://jcsalerno.com.br) • [LinkedIn](https://linkedin.com/in/juliocesar-developer)

---

## 📜 Licença

Este projeto está sob a licença MIT.
Sinta-se livre para estudar, modificar e usar em seus próprios projetos.
