package rpg;

public class Guerreiro extends Personagem {

    private  int forcaFisica;

    public Guerreiro(String nome, int vida,int forcaFisica) {
        super(nome, vida);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public int atacar() {
        System.out.println("O guerreiro " + getNome()+ " ataca com seu porrete!!");
        return this.forcaFisica;
    }
}
