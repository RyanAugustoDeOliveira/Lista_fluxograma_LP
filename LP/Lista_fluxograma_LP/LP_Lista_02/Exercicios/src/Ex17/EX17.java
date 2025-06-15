import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial: ");
        double velocidade = ler.nextDouble();

        System.out.println("Digite a aceleração: ");
        double aceleracao = ler.nextDouble();

        System.out.println("Digite o tempo do percurso: ");
        double tempo = ler.nextDouble();

        double velocidadeFinal = velocidade + aceleracao * tempo;

        System.out.println("Velocidade final: " + velocidadeFinal);
    }
}

//v = d / t