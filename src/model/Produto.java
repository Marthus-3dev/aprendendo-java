package model;

public class Produto {

    //Atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String tamanho;

    //Construtor de objeto vazio
    public Produto(){}

    //Construtor de objeto com parametro
    public Produto(String nome, double preco, int quantidadeEstoque, String tamanho){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    //Métodos
    public void mostrarEstoque(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Tamanho: " + tamanho);
    }
    public int adicionarEstoque(int quantidade){
        this.quantidadeEstoque += quantidade; //Atualiza o valor do estoque
        return quantidadeEstoque; //Retorna o valor do estoque atualizado
    }
}
