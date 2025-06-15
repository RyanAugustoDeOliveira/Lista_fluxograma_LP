import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a graus em Celsius: ");
        double celsius = ler.nextDouble();

        double conversao = celsius * 1.8 + 32 ;

        System.out.println("graus em Fahrenheit: " + conversao);
    }
}

//(°C x 1.8) + 32