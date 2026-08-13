## Decisões Técnicas

### Java e JDK 21

A solução foi desenvolvida utilizando **Java 21 e JDK 21**. A versão 21 foi escolhida por ser uma versão **LTS (Long Term Support)**, oferecendo maior estabilidade e um ciclo de suporte mais longo.

A escolha também busca utilizar uma versão consolidada da plataforma, proporcionando maior previsibilidade para o desenvolvimento e manutenção do projeto.

### Separação entre aplicação e banco de dados

Os scripts SQL foram mantidos separados da aplicação Java, dentro do diretório `database`. Os arquivos foram organizados de acordo com suas responsabilidades:

- `criabanco.sql`, criação do banco e da tabela.
- `insereprodutos.sql`, inserção dos produtos.
- `consultaprodutos.sql`, consulta dos dados.

Essa separação mantém a lógica da aplicação independente dos scripts de banco de dados e facilita a execução e análise de cada parte do desafio.

### Organização por responsabilidade

Os arquivos foram separados de acordo com o objetivo de cada desafio:

- `logica/`, para o desafio de lógica de programação.
- `orientacaoobjetos/`, para o desafio de orientação a objetos.
- `database/`, para os desafios relacionados ao banco de dados.

Essa organização facilita a compreensão do projeto e permite localizar rapidamente cada solução.

### Orientação a Objetos

No desafio de orientação a objetos, foi criada a classe `Produto`, responsável por representar um produto e seus respectivos dados.

O método `calcularTotalEstoque()` foi implementado na própria classe, mantendo o comportamento relacionado ao produto junto aos seus atributos.

### IntelliJ IDEA

O **IntelliJ IDEA** foi utilizado como ambiente de desenvolvimento Java.

Os arquivos específicos da IDE, como `.idea`, foram adicionados ao `.gitignore` para evitar o versionamento de configurações locais do ambiente de desenvolvimento. Dessa forma, o repositório permanece independente das configurações específicas da máquina utilizada para desenvolver o projeto.

### Uso de Inteligência Artificial

A inteligência artificial foi utilizada como ferramenta de apoio durante o desenvolvimento, principalmente para:

- Análise e interpretação de mensagens de erro.
- Revisão do código e identificação de possíveis melhorias.
- Esclarecimento de dúvidas técnicas.

A IA não foi utilizada para desenvolver integralmente as soluções dos desafios. A implementação e a resolução dos problemas foram realizadas de forma autônoma.

Meu fluxo de resolução de problemas prioriza:

1. **Documentação oficial**
2. **Fóruns e discussões técnicas**
3. **Inteligência artificial como recurso complementar**

As sugestões fornecidas pela IA foram analisadas e compreendidas antes de serem utilizadas. A tomada de decisões, implementação e validação das soluções permaneceram sob minha responsabilidade.
