import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println( "--------------------" +
                            "\n MENU" +
                            "\n 5" +
                            "\n 6" +
                            "\n 7" +
                            "\n 8" +
                            "\n 9" +
                            "--------------------");

        System.out.println("Digite uma opção");
        option = in.nextInt();

        switch (option){
            case 5:
                System.out.println("Opção escolhida 5");
                break;
            case 6:
                System.out.println("Opção escolhida 6");
                break;
            case 7:
                System.out.println("Opção escolhida 7");
                break;
            case 8:
                System.out.println("Opção escolhida 8");
                break;
            case 9:
                System.out.println("Opção escolhida 9");
                break;
            default:
                System.out.println("Opção indisponivel");
                break;
        }
    }
}
