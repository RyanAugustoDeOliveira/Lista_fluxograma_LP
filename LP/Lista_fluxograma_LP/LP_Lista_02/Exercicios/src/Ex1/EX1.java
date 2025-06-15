import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = ler.nextInt();
        int dobro = 0;

        dobro = num * 2;

        System.out.println("Dobro: " + dobro);
    }
}
