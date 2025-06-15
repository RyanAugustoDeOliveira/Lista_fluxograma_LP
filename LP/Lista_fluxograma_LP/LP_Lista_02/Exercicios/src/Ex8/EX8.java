import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a medida em milímetros: ");
        double polegadas = ler.nextDouble();

        double conversao = polegadas * 25.4 ;

        System.out.println("Medida em polegadas: " + conversao);
    }
}