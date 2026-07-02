import heranca.Aviao;
import heranca.Carro;
import heranca.Motocicleta;
import heranca.Transporte;

public class ManipulandoTransportes {
    public static void main(String[] args) {

        Transporte carro =  new Carro("Nono", "Volks", "Fusca", 1990, 80.00, true);

        Transporte aviao = new Aviao("GG", "Embraer", "Airbus 380", 2015, 2400000000.00, true);

        Transporte moto = new Motocicleta("Black", "Honda", "CB300", 2023, 26000.0, true);
        System.out.println(carro);
        System.out.println(aviao);
        System.out.println(moto);

        carro.acelerar();
        System.out.println();
        aviao.acelerar();
        System.out.println();
        moto.acelerar();
    }
}
