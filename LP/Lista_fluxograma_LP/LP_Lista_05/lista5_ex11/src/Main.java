import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int c1 = sc.nextInt();
        int l2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != l2) {
            System.out.println("Multiplicação impossível");
            return;
        }

        int[][] A = new int[l1][c1];
        int[][] B = new int[l2][c2];
        int[][] produto = new int[l1][c2];

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    produto[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
