import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor, result;
        int typePay, installment;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        valor = in.nextInt();

        System.out.println( "Escolha uma opção: " +
                            "\n--------------------------" +
                            "\n1-Débito" +
                            "\n2-Pix" +
                            "\n3-Crébito");

        System.out.println("Escolha uma opção: ");
        typePay = in.nextInt();

        if (typePay == 1){
            System.out.println("Débito selecionado");
        } else if (typePay == 2) {
            System.out.println("Crébito selecionado");
        }else{
            System.out.println("Pix selecionado");
        }

        switch (typePay){
            case 1:
                result = valor * 0.95;
                System.out.println("Valor final da compra: "+ result);
                break;
            case 2:
                result = valor * 0.90;
                System.out.println("Valor final da compra: "+ result);
                break;
            case 3:
                System.out.println("Informe a quantidade de parcalas: (MAX:10");
                installment = in.nextInt();

                if (installment>10 || installment<=0){
                    System.out.println("quantida de parcelas invalidas");
                    break;
                }

                if (installment<=4){
                    result = valor*1.02;
                    System.out.println("Quantidade de parcelas + "+ installment);
                    System.out.println("Taxa= "+ valor*0.02);
                    System.out.println("Valor total da compra = "+ result);
                }

                result = valor * 1.05;
                System.out.println("Quantidade de parcelas= "+ installment);
                System.out.println("Taxa= "+ valor * 0.05);
                System.out.println("Valor total da compra= "+ result);
                break;
        }
    }
}