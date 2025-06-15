import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, n3;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite três valores com espaço entre elas: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if (n1 + n2 > n3 && n2 + n3 > n1 && n3 + n1 > n2){
            System.out.println("A soma de dois lados é maior que que o terceiro lado!");
        }else if (n1 == n2 && n2 == n3){
            System.out.println("É um triangulo equilatero");
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("É um triângulo isósceles");
        }else{
            System.out.println("É um triangulo escaleno");
        }
    }
}
