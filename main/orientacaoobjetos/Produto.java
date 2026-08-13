package orientacaoobjetos;

public class Produto {

    //Atributos do tipo privado(encapsulados) para que outras classes não acessem diretamente.
    private String nome;
    private String nicho; //Acrescentei porque achei necessário ter essa divisão.
    private int quantidade;
    private float valor;

    //Construtor vazio.
    public Produto() {}


    //Construtor com parâmetro obrigatório.
    public Produto(String nome, String nicho, int quantidade, float valor) {
        this.nome = nome;
        this.nicho = nicho;
        this.quantidade = quantidade;
        this.valor = valor;
    }


    //Metódo que Calcula o total de produtos em estoque(foi pedido conforme enunciado e achei redundante)
//    public int calcularTotalProdutosEstoque() {
//        return this.quantidade;
//    }

    //Metódo que retorna o valor total de produtos em estoque.
    public double calcularTotalValorEstoque() {
        return valor * quantidade;
    }


    //Metodo para facilitar a impressão.
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.nicho);
        System.out.println(this.quantidade);
        System.out.println(this.valor);
    }


    //Getter criado para permitir que outra classe consiga "ler" informações dos nossos atributos privados.
    public String getNome() {
        return nome;
    }

    // criado para permitir que outra classe consiga modificar.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
