public class Main {
    public static void main(String[] args) {

        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int[10];

        for (int i=0;i<array1.length;i++)
            array2[9-i]=array1[i];

        for (int n:array1)
            System.out.println(n + " ");

        System.out.println();

        for (int n:array2)
            System.out.println(n + " ");
    }
}