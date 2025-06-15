import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("DIgite a primeira nota");
        double n1 = ler.nextDouble();

        System.out.println("DIgite a segunda nota");
        double n2 = ler.nextDouble();

        double media = (n1 + n2 * 2) / 2;

        System.out.println("Media: " + media);
    }
}