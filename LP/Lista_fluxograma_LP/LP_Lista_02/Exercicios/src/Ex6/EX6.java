import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o M/s: ");
        double m = ler.nextDouble();

        double conversao = m * 3.6 ;

        System.out.println("Velocidade em KM/H: " + conversao);
    }
}