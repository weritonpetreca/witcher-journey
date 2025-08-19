# ⚔️ Jornada do Bruxo: Um Guia Prático para o Java Collections Framework

*Forjando Maestria em Java, uma Coleção de Cada Vez.*

---

### **Índice**
1.  [Sobre o Projeto](#sobre-o-projeto)
2.  [A Filosofia: O Bruxo-Programador](#a-filosofia-o-bruxo-programador)
3.  [As Ferramentas no Arsenal](#as-ferramentas-no-arsenal)
4.  [Como Aprender com Este Projeto](#como-aprender-com-este-projeto)
5.  [Como Construir e Executar (Usando Maven)](#como-construir-e-executar-usando-maven)
6.  [Como Contribuir](#como-contribuir)

---

### **Sobre o Projeto**

Este projeto é a materialização da série de posts "A Guilda dos Coletores de Dados". O objetivo é sair da teoria e demonstrar, de forma prática e temática, o uso das principais interfaces do **Java Collections Framework**.

Em vez de exemplos abstratos com `foo` e `bar`, aqui simulamos a jornada de um Bruxo, onde cada estrutura de dados é uma ferramenta essencial para a sua sobrevivência e sucesso, tornando o aprendizado mais intuitivo e memorável.

Este repositório é para:
* **Estudantes de Java** que querem entender *quando* e *por que* usar `List`, `Set`, `Map` ou `Queue`.
* **Desenvolvedores experientes** que buscam uma forma criativa de revisitar e solidificar conceitos fundamentais.
* **Qualquer pessoa** que acredita que aprender a programar pode ser uma aventura épica.

---

### **A Filosofia: O Bruxo-Programador**

O processo de pensamento por trás deste projeto é baseado em uma analogia central: **um bom programador, assim como um bom Bruxo, sabe que a vitória não depende da força, mas da preparação e da escolha da ferramenta certa para o trabalho.**

Um Bruxo nunca usaria sua espada de prata contra um humano, nem sua espada de aço contra uma aparição. Da mesma forma, cada problema de programação envolvendo um conjunto de dados exige uma `Collection` específica. Este projeto foi criado para treinar essa mentalidade.

---

### **As Ferramentas no Arsenal**

O projeto demonstra o uso das quatro grandes interfaces do Framework:

* **`Queue<Contrato>` (O Quadro de Avisos):** Simula uma fila de tarefas onde a ordem de chegada importa (FIFO).
* **`Map<String, String>` (O Bestiário):** Permite acesso instantâneo a dados (fraquezas) a partir de uma chave única (o nome do monstro).
* **`List<String>` (A Receita de Poção):** Garante a ordem e permite a repetição de elementos (ingredientes).
* **`Set<String>` (O Saco de Troféus):** Garante que cada elemento (troféu) seja único, ignorando duplicatas.

---

### **Como Aprender com Este Projeto**

1.  **Pense como um Bruxo:** Antes de codificar, analise os requisitos dos seus dados. Ordem? Unicidade? Acesso por chave? A resposta determina a `Collection` a ser usada.
2.  **Conheça suas Ferramentas:** Execute o código, modifique-o, experimente. Veja o que acontece ao tentar adicionar itens duplicados a um `Set` ou ao mudar a ordem em uma `List`.
3.  **Leia o Bestiário (Documentação):** A documentação é sua aliada. Gere a do projeto e acostume-se a consultá-la.
4.  **Pratique na Arena:** Adicione novas funcionalidades. Crie novas poções, monstros ou contratos para solidificar seu aprendizado.

---

### **Como Construir e Executar (Usando Maven)**

Este projeto utiliza o **Maven** para gerenciar o ciclo de vida da construção e execução. Todos os comandos abaixo devem ser executados no terminal, a partir do **diretório raiz do projeto** (a pasta que contém o arquivo `pom.xml`).

#### **1. Compilar o Código-Fonte**
Este comando verifica seu código por erros e o compila, gerando os arquivos `.class` no diretório `target/classes`.
```bash
mvn compile
```

#### **2. Executar a Simulação**
Para executar o programa, é necessário que o plugin `exec-maven-plugin` esteja configurado no seu `pom.xml`. Garanta que o seguinte trecho exista no arquivo:
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>3.1.0</version>
            <configuration>
                <mainClass>JornadaDoBruxo</mainClass>
            </configuration>
        </plugin>
    </plugins>
</build>
```
Com o plugin configurado, execute o comando:
```bash
mvn exec:java
```

#### **3. Gerar a Documentação (Javadoc)**
Este comando executa a ferramenta Javadoc nos seus arquivos-fonte.
```bash
mvn javadoc:javadoc
```
A documentação HTML será gerada no diretório **`target/apidocs`**. Para visualizar, abra o arquivo **`index.html`** localizado nessa pasta em seu navegador.

---

### **Como Contribuir**

Este projeto é um ponto de partida. Se você tem ideias para torná-lo uma ferramenta de aprendizado ainda melhor, sua contribuição é bem-vinda!

Sinta-se à vontade para abrir uma *Issue* para discutir ideias ou enviar um *Pull Request* com melhorias.

**Algumas ideias para o futuro:**
* Adicionar interatividade via terminal para o usuário tomar decisões.
* Implementar um sistema para salvar/carregar o progresso do Bruxo em um arquivo.
* Criar testes unitários para a classe `BolsaDeItens`.

Obrigado por se juntar a esta jornada. Que suas caçadas de código sejam sempre vitoriosas!