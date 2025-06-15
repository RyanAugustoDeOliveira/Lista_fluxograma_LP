import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 3 - Potência (sem recursão):");
        potenciaSemRecursao();
    }

    public static void potenciaSemRecursao() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int x = in.nextInt();
        System.out.print("Digite o expoente: ");
        int y = in.nextInt();
        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        System.out.println("Resultado: " + resultado);
    }
}
