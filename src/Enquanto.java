import java.util.Scanner;
public class Enquanto {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String proceed;
       do{
            System.out.println("Hello, World!");
            System.out.println("Quer continuar? s/n: ");
            proceed = read.nextLine();
        } while (proceed.equalsIgnoreCase("s"));
    }
}
