import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            boolean perdeu = false;

            // Loop da tabuada do 1 ao 10
            for (int i = 1; i <= 10 && !perdeu; i++) {
                for (int j = 1; j <= 10 && !perdeu; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scanner.nextInt();

                    if (resposta != i * j) {
                        System.out.println("Errado! A resposta correta era: " + (i * j));
                        System.out.println("Você perdeu!");
                        perdeu = true;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("Parabéns! Você completou toda a tabuada!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("s")) {
                jogarNovamente = false;
                System.out.println("Obrigado por jogar!");
            }
        }
    }
}
