import java.util.Scanner;

public class EX19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Coeficiente A: ");
        double coeficienteA = ler.nextDouble();

        System.out.print("Coeficiente B: ");
        double coeficienteB = ler.nextDouble();

        System.out.print("Coeficiente C: ");
        double coeficienteC = ler.nextDouble();

        if (coeficienteA == 0) {
            System.out.println("ERRO!: Coeficiente A não pode ser igual a 0");
        } else {

            double delta = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);

            if (delta > 0) {

                double x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
                double x2 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);
                System.out.println("As raízes da equação são reais e distintas:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            } else if (delta == 0) {

                double x = -coeficienteB / (2 * coeficienteA);
                System.out.println("A equação tem uma única raiz real:");
                System.out.println("x = " + x);

            } else {

                double parteReal = -coeficienteB / (2 * coeficienteA);
                double parteImaginaria = Math.sqrt(-delta) / (2 * coeficienteA);
                System.out.println("As raízes são complexas:");
                System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
                System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
            }
        }
    }
}
