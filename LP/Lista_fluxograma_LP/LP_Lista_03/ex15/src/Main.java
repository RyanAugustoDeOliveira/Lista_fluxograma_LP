import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor, resultado;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = in.nextInt();

        System.out.println("------------------------------\n" +
                "                Menu:\n" +
                "        1. Café Expresso R$ 0,50\n" +
                "        2. Café Longo R$ 1,00\n" +
                "        3. Capuccino R$ 2,50\n" +
                "        4. Chocolate R$ 2,00");

        System.out.println("Escolha uma opção: ");
        option = in.nextInt();


        switch (option){
            case 1:
                resultado = valor - 0.50;

                if (resultado <0) {
                    System.out.println("Valor insuficiente");
                }else {
                    System.out.println("Café Expresso");
                    System.out.println("Troco: " + resultado);
                }
                break;
            case 2:
                resultado = valor - 1.00;

                if (resultado <0) {
                    System.out.println("Valor insuficiente");
                }else {
                    System.out.println("Café Longo");
                    System.out.println("Troco: " + resultado);
                }
                break;
            case 3:
                resultado = valor - 2.50;

                if (resultado <0) {
                    System.out.println("Valor insuficiente");
                }else {
                    System.out.println("Capuccino");
                    System.out.println("Troco: " + resultado);
                }
                break;
            case 4:
                resultado = valor - 2.00;

                if (resultado <0) {
                    System.out.println("Valor insuficiente");
                }else {
                    System.out.println("Chocolate");
                    System.out.println("Troco: " + resultado);
                }
                break;
        }
    }
}