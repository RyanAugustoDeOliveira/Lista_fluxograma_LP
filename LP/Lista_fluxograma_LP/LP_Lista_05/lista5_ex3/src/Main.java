import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] vetor = {6,3,8,2,9,7,1,5,4,10};
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        n = in.nextInt();

        for (int i=0;i<vetor.length;i++){
            if (vetor[i]==n){
                System.out.println(n + " encontrado na posição " + i);
                return;
            }
        }

        System.out.println("Valor não encontrado");
    }
}