import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o base do triangulo: ");
        double base = ler.nextDouble();

        System.out.println("Digite o altura do triangulo: ");
        double altura = ler.nextDouble();

        double conta = (altura * base) / 2;

        System.out.println("Área: " + conta);
    }
}