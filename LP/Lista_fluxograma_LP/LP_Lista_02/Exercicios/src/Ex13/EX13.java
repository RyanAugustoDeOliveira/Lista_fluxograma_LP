import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = ler.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("circunferência: " + area);
    }
}