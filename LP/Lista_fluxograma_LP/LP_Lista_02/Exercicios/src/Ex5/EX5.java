import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o KM/H: ");
        double km = ler.nextDouble();

        double conversao = km / 3.6 ;

        System.out.println("Velocidade em M/s: " + conversao);
    }
}