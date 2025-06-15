import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media, rec, mediaRec;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite as notas com espaço entre elas: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        media = (n1 + n2) / 2;

        if (media >= 50){
            System.out.println("Aprovado");
        }else if (media < 50){
            System.out.println("Infoem a nota da recuperação: ");
            rec = in.nextInt();

            mediaRec = (media + rec) / 2;

            if (mediaRec >= 50){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }
    }
}