import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, previews=0, next=1, aux;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro e positivo");
        n = in.nextInt();

        if(n>0){
            while(next < n){
                System.out.println(next + " ");
                aux = next;
                next+= previews;
                previews = aux;
            }
        }else{
            System.out.println("Valor inválido");
        }

    }
}