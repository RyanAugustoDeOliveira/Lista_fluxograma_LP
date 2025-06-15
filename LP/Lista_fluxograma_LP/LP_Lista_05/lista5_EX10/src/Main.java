public class Main {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrixB = {{7, 8}, {9, 10}};
        int[][] result = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}