public class Main {
    public static void main(String[] args) {
        //Declaração sem inicializar
        int [] vetor = new int[5];

        // Declaração com inicialização
        int [] numbers = {2,5,6,4,8};

        // for convencional para percorrer o valor
       /* for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("---------------");

        //foreach (ou for enchenced)
        for (int n:numbers)
            System.out.println(n);


        */
        // Declaração com inicialização
        int [][] matriz =   {{1,3},
                            {4,6},
                            {7,9}};
        System.out.println(matriz[0].length);

        //printar todos os valores da matriz
        for (int i=0; i<matriz.length;i++){
            for (int j=0; j<matriz[0].length;i++){
                System.out.println(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int []linha:matriz){
            for (int valor:linha){
                System.out.println(valor + "\t");
            }
            System.out.println();
        }
    }
}