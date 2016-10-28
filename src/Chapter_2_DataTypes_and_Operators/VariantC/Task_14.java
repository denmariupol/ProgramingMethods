package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.Random;

/**
 * Created by Ingener_mobil on 28.10.2016.
 */
public class Task_14 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        Random rand = new Random();
        float[][] matrix = new float[rows][cols];
        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = rand.nextFloat()*100;
                System.out.printf("%7.2f", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Round(matrix);
    }

    private static void Round(float[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%7d",Math.round(matrix[i][j]));
                if (j == matrix.length - 1)
                    System.out.println();
            }
        }
    }
}
