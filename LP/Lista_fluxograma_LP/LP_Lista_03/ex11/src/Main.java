import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dia, dom, seg, ter, qua, qui, sex, sab;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        dia = in.nextInt();

        dom = 1;
        seg = 2;
        ter = 3;
        qua = 4;
        qui = 5;
        sex = 6;
        sab = 7;

        if (dia == 1){
            System.out.println("1 - Domingo");
        } else if (dia == 2) {
            System.out.println("2 - Segunda");
        }else if (dia == 3) {
            System.out.println("3 - Terça");
        }else if (dia == 4) {
            System.out.println("4 - Quarta");
        }else if (dia == 5) {
            System.out.println("5 - Quinta");
        }else if (dia == 6) {
            System.out.println("6 - Sexta");
        }else if (dia == 7) {
            System.out.println("7 - Sabado");
        }
    }
}