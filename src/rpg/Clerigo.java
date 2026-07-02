package rpg;

public class Clerigo extends Personagem{

    private int sacroPoder;

    public Clerigo(String nome, int vida, int sacroPoder) {
        super(nome, vida);
        this.sacroPoder = sacroPoder;
    }

    @Override
    public int atacar() {
        System.out.println("O clerigo " +getNome()+ " mostra o poder de Deus!");
        return this.sacroPoder;
    }
}
