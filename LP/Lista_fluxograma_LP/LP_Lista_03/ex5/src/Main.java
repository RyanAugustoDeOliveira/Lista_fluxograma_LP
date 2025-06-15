import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite as notas com espaço entre elas: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        media = (n1 + n2) / 2;

        if (media >= 8.5){
            System.out.println("A");
        } else if (media >= 7 && media < 8.5) {
            System.out.println("B");
        }else if (media >= 5 && media < 7) {
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}