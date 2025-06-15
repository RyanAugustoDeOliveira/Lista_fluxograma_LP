import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a medida em milímetros: ");
        double ml = ler.nextDouble();

        double conversao = ml / 25.4 ;

        System.out.println("Medida em polegadas: " + conversao);
    }
}