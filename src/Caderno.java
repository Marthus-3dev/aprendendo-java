import model.Caneta;

public class Caderno {
    public static void main(String[] args){

        Caneta canetaAzul = new Caneta("Azul", 0.5, true, true, "transparente");

        canetaAzul.ponta2 = 80;

        canetaAzul.setPonta(80);

        System.out.println(canetaAzul.ponta2);
        System.out.println(canetaAzul.getPonta());
    }
}
