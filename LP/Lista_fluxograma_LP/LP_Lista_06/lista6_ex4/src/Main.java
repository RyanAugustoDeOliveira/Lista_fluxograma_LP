import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 4 - Palíndromo (sem recursão):");
        palindromoSemRecursao();
    }

    public static void palindromoSemRecursao() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String s = in.nextLine();
        boolean eh = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                eh = false;
                break;
            }
        }
        System.out.println("É palíndromo? " + eh);
    }
}
