package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.Random;

/**
 * Created by Ingener_mobil on 26.10.2016.
 * Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое
 */
public class Task_9 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        Random rand = new Random();
        float[][] matrix = new float[rows][cols];
        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = rand.nextInt(100) - 50;
                System.out.printf("%7.0f", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Result(matrix);
    }

    private static void Result(float[][] matrix) {
        System.out.println();
        float sum = 0;
        float mid;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
        }
        mid = sum/(matrix.length * matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] - mid;
                System.out.printf("%7.2f", matrix[i][j]);
                if (j == matrix.length - 1)
                    System.out.println();
            }
        }
    }
}
