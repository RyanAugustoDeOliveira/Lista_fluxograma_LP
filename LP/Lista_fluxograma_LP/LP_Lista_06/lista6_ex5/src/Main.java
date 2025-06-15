import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Busca Binária sem recursividade:");
        busca();
    }

    public static void busca() {
        int[] vetor = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor a ser buscado: ");
        int valor = in.nextInt();

        int inicio = 0;
        int fim = vetor.length - 1;
        boolean encontrado = false;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valor) {
                System.out.println("Valor encontrado na posição: " + meio);
                encontrado = true;
                break;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }
    }
}
