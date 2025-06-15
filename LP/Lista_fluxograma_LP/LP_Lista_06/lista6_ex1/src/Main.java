import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1 - Soma até N (sem recursão):");
        somaSemRecursao();
    }

    public static void somaSemRecursao() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = in.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("Resultado: " + soma);
    }
}
