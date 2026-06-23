import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for ( int i = 1; i <= 10; i++){
            System.out.printf("\nTabuada do %d", i,"\n");
            System.out.println("\n");
            for ( int j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %d \n", j, i, j*i);
            }
        }
    }
}