import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
        double num2 = ler.nextInt();

        double media = (num1 + num2) / 2;

        System.out.println("Sua media é: " + media);

    }
}