import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        double height, base, area, perimeter, radius, circumference, cateto, hipo;

        Scanner in = new Scanner(System.in);

        System.out.println("Menu:\n" +
                "    1. Círculo\n" +
                "    2. Triangulo Retângulo\n" +
                "    3. Retângulo\n" +
                "--------------------------\n");

        System.out.println("Escolha uma opção: ");
        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("--------------------------\n");

                System.out.println("Informe o raio: ");
                radius = in.nextInt();

                System.out.println("--------------------------\n");

                area = Math.PI * Math.pow(radius, 2);
                circumference = 2 * Math.PI * radius;

                System.out.println("Area: "+ area);
                System.out.println("Circunferencia: "+ circumference);

            case 2:
                System.out.println("--------------------------\n");

                System.out.println("Informe a altura: ");
                height = in.nextInt();
                System.out.println("Informe a base: ");
                base = in.nextInt();

                area = (height + base) / 2;

                hipo = Math.sqrt((Math.pow(height, 2) + Math.pow(base, 2)));

                perimeter = hipo + height + base;

                System.out.println("Area: "+ area);
                System.out.println("Perimetro: "+ perimeter);

            case 3:
                System.out.println("--------------------------\n");

                System.out.println("Informe a altura: ");
                height = in.nextInt();
                System.out.println("Informe a base: ");
                base = in.nextInt();

                area = height * base;
                perimeter= Math.pow(height, 2) + Math.pow(base, 2);

                System.out.println("Area: "+ area);
                System.out.println("Perimetro: "+ perimeter);
        }
    }
}