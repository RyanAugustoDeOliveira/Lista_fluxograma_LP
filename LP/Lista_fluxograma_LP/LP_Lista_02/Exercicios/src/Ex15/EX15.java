import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro: ");
        double raio = ler.nextDouble();

        System.out.println("Digite o altura do cilindro: ");
        double altura = ler.nextDouble();

        double conta = altura * Math.PI * Math.pow(raio, 2);

        System.out.println("Cilindro: " + conta);
    }
}