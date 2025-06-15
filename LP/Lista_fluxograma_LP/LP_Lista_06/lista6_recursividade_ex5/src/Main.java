import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Busca Binária com recursividade:");
        busca();
    }

    public static void busca() {
        int[] vetor = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor a ser buscado: ");
        int valor = in.nextInt();

        int posicao = buscar(vetor, valor, 0, vetor.length - 1);

        if (posicao == -1) {
            System.out.println("Valor não encontrado.");
        } else {
            System.out.println("Valor encontrado na posição: " + posicao);
        }
    }

    public static int buscar(int[] vetor, int valor, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (vetor[meio] == valor) {
            return meio;
        } else if (vetor[meio] < valor) {
            return buscar(vetor, valor, meio + 1, fim);
        } else {
            return buscar(vetor, valor, inicio, meio - 1);
        }
    }
}
