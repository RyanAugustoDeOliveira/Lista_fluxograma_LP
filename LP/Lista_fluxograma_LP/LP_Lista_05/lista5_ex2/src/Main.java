public class Main {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,80,90,100};

        for (int i=0;i <numbers.length;i++){
            if (i%2==0)
                numbers[i]=numbers[i]+2;
            else
                numbers[i]=numbers[i]*2;
        }
        for (int n:numbers)
            System.out.print(n + " ");
    }
}