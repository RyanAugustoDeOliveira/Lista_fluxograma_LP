import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num = ler.nextInt();

        double quintaParte = num / 5;

        System.out.println(quintaParte);
    }
}