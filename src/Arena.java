import rpg.Clerigo;
import rpg.Guerreiro;

public class Arena {
    public static void main(String[] args) {
        System.out.println("A Batalha se aproxima....");

        Guerreiro heMan  = new Guerreiro("He-Man", 80, 33);

        Clerigo christoph = new Clerigo("Christoph", 40, 67);

        int danoClerigo = christoph.atacar();
        heMan.receberDano(danoClerigo);

        int danoGuerreiro = heMan.atacar();
        christoph.receberDano(danoGuerreiro);




    }
}
