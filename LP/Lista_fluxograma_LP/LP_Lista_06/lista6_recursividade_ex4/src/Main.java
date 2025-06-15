import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 4 - Palíndromo (com recursão):");
        palindromoComRecursao();
    }

    public static void palindromoComRecursao() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String s = in.nextLine();
        System.out.println("É palíndromo? " + ehPalindromo(s));
    }

    public static boolean ehPalindromo(String s) {
        return verifica(s, 0, s.length() - 1);
    }

    public static boolean verifica(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return verifica(s, i + 1, j - 1);
    }
}
