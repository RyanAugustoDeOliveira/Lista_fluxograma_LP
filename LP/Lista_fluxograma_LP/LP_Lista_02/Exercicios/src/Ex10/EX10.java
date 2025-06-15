import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a medida em milhas: ");
        double milhas = ler.nextDouble();

        double conversao = milhas * 0.621371 ;

        System.out.println("Medida em quilômetros: " + conversao);
    }
}