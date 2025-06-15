import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite três numeros com espaço entre eles: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println("1: " + n3 + " \n2: " + n2 + "\n3: " + n1);
            } else {
                System.out.println("1: " + n2 + "\n2: " + n3 + "\n3: " + n1);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println("1: " + n3 + "\n2: " + n1 + "\n3: " + n2);
            } else {
                System.out.println("1: " + n1 + "\n2: " + n3 + "\n3: " + n2);
            }
        } else {
            if (n3 > n1 && n3 > n2) {
                if (n1 > n2) {
                    System.out.println("1: " + n2 + "\n2: " + n1 + "\n3: " + n3);
                } else {
                    System.out.println("1: " + n1 + "\n12: " + n2 + "\n3: " + n3);
                }
            }
        }
    }
}