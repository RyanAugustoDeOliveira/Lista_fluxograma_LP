import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = ler.nextInt();

        int result = num * num;

        System.out.println("Resultado: " + result);
    }
}