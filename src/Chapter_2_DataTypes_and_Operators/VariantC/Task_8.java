package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.Random;

/**
 * Created by Ingener_mobil on 25.10.2016.
 */
public class Task_8 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = rand.nextInt(100)-50;
                System.out.printf("%4d", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Determinator(matrix);
    }

    private static void Determinator(int[][] matrix) {
        System.out.println();
        int det;
        int [] d = new int[matrix.length];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if
                System.out.printf("%4d", matrix[i][j]);
                if (j == matrix.length - 1)
                    System.out.println();
//                d[i] = matrix[i][j]*(Result(matrix[i][j]));
            }
        }
    }

//    private static int Result(int m){
//
//    }
}
