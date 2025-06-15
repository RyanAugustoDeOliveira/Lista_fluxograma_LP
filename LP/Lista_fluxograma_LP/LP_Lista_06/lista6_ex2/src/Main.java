import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 2 - Fatorial (sem recursão):");
        fatorialSemRecursao();
    }

    public static void fatorialSemRecursao() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = in.nextInt();
        int fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        System.out.println("Resultado: " + fat);
    }
}
