import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, conta;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numeros: ");
        n1 = in.nextInt();

         conta = n1 % 2;

         if (conta == 0){
             System.out.println("Seu numero é par");
         }else{
             System.out.println("Seu numero é impar");
         }
    }
}