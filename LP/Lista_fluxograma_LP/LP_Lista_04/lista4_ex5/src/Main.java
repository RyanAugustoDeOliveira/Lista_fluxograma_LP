import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        if (numero < 0) {
            System.out.println("Fatorial não está definido para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
