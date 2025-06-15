import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a medida em quilômetros: ");
        double QUilometros = ler.nextDouble();

        double conversao = QUilometros * 0.621371 ;

        System.out.println("Medida em milhas: " + conversao);
    }
}