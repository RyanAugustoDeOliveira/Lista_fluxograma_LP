import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1 - Soma até N (com recursão):");
        somaComRecursao();
    }

    public static void somaComRecursao() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = in.nextInt();
        System.out.println("Resultado: " + soma(n));
    }

    public static int soma(int n) {
        if (n <= 0) return 0;
        return n + soma(n - 1);
    }
}
