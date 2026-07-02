package rpg;

public abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome(){
        return this.nome;
    };

    public int getVida(){
        return this.vida;
    };

    public void receberDano(int dano){
        if (this.vida <= 0){
            System.out.println("Faleceu");
        }else{
            this.vida -= dano;
            System.out.printf("Você tomou %d de dano!\nVida restante de d% : %d\n", dano, this.nome,this.vida);
        };
    };
    public abstract int atacar();



}
