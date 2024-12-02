package ArraysDos;

import Utilidades.Utilidades;

public class RellenaMatriz {
    public static void main (String[] args){
        int[][] matriz = new int[10][10];

        Utilidades.rellenaMatriz(matriz,0,1);

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
