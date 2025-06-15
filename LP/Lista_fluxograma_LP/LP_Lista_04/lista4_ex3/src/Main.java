public class Main {
    public static void main(String[] args) {
        double conta;

        for (int i = 1; i <= 200; i++) {
            conta = i % 4;
            if (conta == 0){
                System.out.println("Resultado: " + i);
            }
        }
    }
}