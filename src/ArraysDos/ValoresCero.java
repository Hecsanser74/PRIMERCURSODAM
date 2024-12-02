package ArraysDos;

public class ValoresCero {
    public static void main (String[] args){
        //int[][] matriz = new int[10][10];

        int[][] matriz = {{1,0,0,1,0,0,1,0,1,0},
                          {1,1,0,0,1,1,0,1,1,0},
                          {1,0,0,1,0,0,1,0,1,0},
                          {0,0,0,0,0,0,0,0,0,0},
                          {1,0,0,1,0,0,1,0,1,0},
                          {0,0,0,0,0,0,0,0,0,0},
                          {1,0,0,1,0,0,1,0,1,0},
                          {1,0,0,1,0,0,1,0,1,0},
                          {1,0,0,1,0,0,1,0,1,0},
                          {1,0,0,1,0,0,1,0,1,0}};

        int recoridoFilas = 0;
        int recoridoColumnas = 0;
        int filas = 0;
        int columnas = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");

                if (matriz[i][j] == 0) recoridoFilas++;
                if (matriz[j][i] == 0) recoridoColumnas++;
            }

            System.out.println();

            if (recoridoColumnas == 10) columnas++;
            else recoridoColumnas = 0;

            if (recoridoFilas == 10) filas++;
            else recoridoFilas = 0;
    }

        System.out.println("Hay " +filas+ " filas con todos los valores a 0");
        System.out.println("Hay " +columnas+ " filas con todos los valores a 0");
}
}