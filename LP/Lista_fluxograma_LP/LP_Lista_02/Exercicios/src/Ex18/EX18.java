import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("coeficientes A: ");
        double coeficienteA = ler.nextDouble();

        System.out.print("coeficientes B: ");
        double coeficienteB = ler.nextDouble();



        double x = -coeficienteB / coeficienteA;

        System.out.println("x = " + x);
    }
}
//ax + b = 0