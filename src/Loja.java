import model.Produto;

public class Loja {
    public static void main (String[] args){
        Produto produto1 = new Produto("Tênis Nike", 299.99, 90, "42");
        Produto produto2 = new Produto("Camisa do Flamengo", 759.99, 14, "g");

        System.out.println("Estoque do produto 1: \n");
        produto1.mostrarEstoque();

        System.out.println("-".repeat(50));

        produto1.adicionarEstoque(5);

        System.out.println("Estoque do produto 1 atualizado!");
        produto1.mostrarEstoque();
    }
}
