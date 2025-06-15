import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 2 - Fatorial (com recursão):");
        fatorialComRecursao();
    }

    public static void fatorialComRecursao() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = in.nextInt();
        System.out.println("Resultado: " + fatorial(n));
    }

    public static int fatorial(int n) {
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }
}