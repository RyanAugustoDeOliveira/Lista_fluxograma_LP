import java.util.Scanner;

public class EX20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x1, x2, b, c;

        System.out.print("Digite a primeira raiz: ");
        x1 = ler.nextDouble();

        System.out.print("Digite a segunda raiz: ");
        x2 = ler.nextDouble();

        b = -x1 -x2;
        c = -x1 * -x2;
        System.out.println("x^2 + "+ b +"x + "+ c +" = 0");
    }
}