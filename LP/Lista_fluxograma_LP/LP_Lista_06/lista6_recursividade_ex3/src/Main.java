import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 3 - Potência (com recursão):");
        potenciaComRecursao();
    }

    public static void potenciaComRecursao() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int x = in.nextInt();
        System.out.print("Digite o expoente: ");
        int y = in.nextInt();
        System.out.println("Resultado: " + potencia(x, y));
    }

    public static int potencia(int x, int y) {
        if (y == 0) return 1;
        return x * potencia(x, y - 1);
    }
}
