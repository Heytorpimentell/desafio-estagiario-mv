# Desafio Estagiário - MV

Teste técnico, lógico e prático para vaga de estágio em desenvolvimento.

## Sobre o Projeto

Projeto que utilizei

---

## Tecnologias

- **Java**
- **Maven**
- **SQL** (MySQL / MariaDB)
- **IntelliJ IDEA**

---


## Instalação

1. **Clone o repositório**
    ```bash
    git clone https://github.com/Heytorpimentell/desafio-estagiario-mv.git
    cd desafio-estagiario-mv

2.  **Configure o Banco de Dados MySQL ou MariDB** 
    
    ```bash
    main/database/criabanco.sql
    main/database/insereprodutos.sql
    main/database/consultaprodutos.sql
    ```

3.  **Execute o Projeto Java no IntelliJ IDEA** 
    
    ```bash
    DesafioComparacaoValores.java
    Produto.java
    ```      


---


## Estrutura de Pastas

```
desafio-estagiario-mv/
└── main/
    ├── database/
    │   ├── consultaprodutos.sql
    │   ├── criabanco.sql
    │   └── insereprodutos.sql
    │
    ├── logica/
    │   └── DesafioComparacaoValores.java
    │
    └── orientacaoobjetos/
        └── Produto.java

```
    

---

## Desafios Resolvidos

### 1. Lógica de Programação
Arquivo: `DesafioComparacaoValores.java`

Programa que recebe **5 números** e exibe:
- Maior número
- Menor número
- Média dos valores

### 2. Orientação a Objetos
Arquivo: `Produto.java`

Classe `Produto` com os atributos:
- `nome` (String)
- `valor` (double)
- `quantidade` (int)

Método implementado:
- `calcularTotalEstoque()` → retorna o valor total do estoque (`valor * quantidade`)

---

### 3. Banco de Dados

#### Criação do banco e da tabela
**Arquivo:** `criabanco.sql`

#### Inserção de produtos
**Arquivo:** `insereprodutos.sql`

#### Consulta de produtos
**Arquivo:** `consultaprodutos.sql`

---

### Diferenciais Aplicados

- Organização clara por pastas
- Código limpo e legível
- Commits semânticos e organizados
- `.gitignore` configurado corretamente
- README estruturado e profissional
- Boas práticas de nomenclatura


## 👤 Autor

**Heytor Pimentel do Nascimento**

- GitHub: [Heytorpimentell](https://github.com/Heytorpimentell)
- LinkedIn: [heytorpimentel](https://www.linkedin.com/in/heytorpimentel/)
