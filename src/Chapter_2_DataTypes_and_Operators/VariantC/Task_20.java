package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.Random;

/**
 * Created by Ingener_mobil on 28.10.2016.
 */
public class Task_20 {
    public static void main(String[] args) {
        int rows = 8;
        int cols = 8;
        Random rand = new Random();
        int[][] matrixOld = new int[rows][cols];
        int[][] matrixNew = new int[rows][cols];

        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrixOld[r][c] = rand.nextInt(1000);
                matrixNew[r][c] = matrixOld[r][c];
                System.out.printf("%4d", matrixOld[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Sort(matrixNew,matrixOld);
    }

    private static void Sort(int[][] matrixNew,int [][]matrixOld) {

        int temp,count = 0;
        int [] maxElem = new int[matrixNew.length];

        for (int i = 0; i < matrixNew.length; i++) {
            for (int j = 0; j < matrixNew[i].length; j++) {
                if (j < matrixNew[i].length - 1) {
                    if (matrixNew[i][j] < matrixNew[i][j + 1]) {
                        temp = matrixNew[i][j];
                        matrixNew[i][j] = matrixNew[i][j + 1];
                        matrixNew[i][j + 1] = temp;
                        count++;
                    }
                }else if(j == matrixNew[i].length - 1 && i < matrixNew.length - 1){
                    if(matrixNew[i][j] < matrixNew[i+1][0]) {
                        temp = matrixNew[i][j];
                        matrixNew[i][j] = matrixNew[i+1][0];
                        matrixNew[i+1][0] = temp;
                        count++;
                    }
                }
            }
        }

        if (count != 0)
            Sort(matrixNew,matrixOld);
        else{
            for (int i = 0; i < matrixNew.length; i++) {
                for (int j = 0; j < matrixNew[i].length; j++) {
                    if(i == 0)
                        maxElem[j] = matrixNew[i][j];
                }
            }
            System.out.println();
            for (int i = 0; i < maxElem.length; i++) {
                System.out.printf("%4d",maxElem[i]);
            }
            System.out.println();
            System.out.println();
            Result(matrixOld,maxElem);
        }
    }

    private static void Result(int[][] matrixOld, int[] maxElem) {
        for (int i = 0; i < matrixOld.length; i++) {
            for (int j = 0; j < matrixOld[i].length; j++) {
                if (i == j){
                    matrixOld[i][j] = maxElem[i];
                }
                System.out.printf("%4d", matrixOld[i][j]);
                if (j == matrixOld.length - 1)
                    System.out.println();
            }
        }
    }
}
