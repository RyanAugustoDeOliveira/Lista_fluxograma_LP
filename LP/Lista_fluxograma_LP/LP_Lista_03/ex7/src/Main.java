import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();


        double delta = b * b - 4 * a * c;

        if (delta > 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {

            double x = -b / (2 * a);
            System.out.println("A equação possui uma única raiz real: x = " + x);
        } else {

            System.out.println("A equação não possui raízes reais.");
        }

        scanner.close();
    }
}
