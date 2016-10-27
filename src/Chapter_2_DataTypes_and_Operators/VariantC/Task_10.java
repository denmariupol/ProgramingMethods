package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.Random;

/**
 * Created by Ingener_mobil on 27.10.2016.
 */
public class Task_10 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = rand.nextInt(100) - 50;
                System.out.printf("%4d", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        MaxElement(matrix);
    }

    private static void MaxElement(int[][] matrix) {
        int max = matrix[0][0];
        int maxI = 0,maxJ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("Максимальный элемент "+max);

        for (int i = 0; i < matrix.length; i++) {
            if (i == maxI)
                continue;
            for (int j = 0; j < matrix[i].length; j++) {
                if(j == maxJ)
                    continue;
                System.out.printf("%4d", matrix[i][j]);
                if (j == matrix.length - 1)
                    System.out.println();
            }
        }
    }
}
