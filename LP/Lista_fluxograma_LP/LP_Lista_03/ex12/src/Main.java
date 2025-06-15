import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois numeros separados por espaço");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println( "--------------------" +
                            "\n MENU" +
                            "--------------------" +
                            "\n1 Soma" +
                            "\n2 Subtração" +
                            "\n3 Multiolicação" +
                            "\n4 DIvisão" +
                            "\n--------------------");
        System.out.println( "escolha uma opção" +
                            "\n--------------------");

        option = in.nextInt();

        switch (option){
            case 1:
                result = n1 + n2;
                System.out.println(n1 + " + "+ n2 +" = "+ result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println(n1 + " - "+ n2 +" = "+ result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println(n1 + " & "+ n2 +" = "+ result);
                break;
            case 4:
                result = n1 / n2;
                System.out.println(n1 + " / "+ n2 +" = "+ result);
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}