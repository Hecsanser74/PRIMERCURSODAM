package ArraysUno;

public class ImprimeArray {
    public static void main(String[] args) {
        int[] Array;

        Array = new int[10];

        Array[0] = 100;
        Array[1] = 200;
        Array[2] = 300;
        Array[3] = 400;
        Array[4] = 500;
        Array[5] = 600;
        Array[6] = 700;
        Array[7] = 800;
        Array[8] = 900;
        Array[9] = 1000;

        for (int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
    }
}
