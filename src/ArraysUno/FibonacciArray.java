package ArraysUno;

public class FibonacciArray {
    public static void main(String[] args) {
        int[] fibonacci = new int[40];

        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 0; i < 40; i++) {
            if (i >= 2){
                fibonacci[i]= fibonacci[i-2] + fibonacci [i -1];
            }

            System.out.println(fibonacci[i]+" ");
            //fibonacci[i] = fibonacci[0] + fibonacci[1];
            //System.out.println(fibonacci[i]);
            //fibonacci[0] = fibonacci[1];
            //fibonacci[1] = fibonacci[i];
        }
    }
}