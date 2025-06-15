import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o raio da base do cone: ");
        double raio = ler.nextDouble();

        System.out.println("Digite o altura do cone: ");
        double altura = ler.nextDouble();

        double area = (1/3) * Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("Cilindro: " + area);
    }
}

//(1/3) × π × r² × h