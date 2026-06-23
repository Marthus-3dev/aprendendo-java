package model;

public class Produto {

    //Atributos
    public String nome; public double preco; public int quantidadeEstoque; public String tamanho;

    public Produto(String nm, double prc, int qtde, String taman){
        this.nome = nm; this.preco = prc; this.quantidadeEstoque = qtde; this.tamanho = taman;
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
