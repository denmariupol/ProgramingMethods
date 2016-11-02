package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.Random;

/**
 * Created by Ingener_mobil on 28.10.2016.
 * Найти количество всех седловых точек матрицы. (Матрица А имеет седловую точку Аi, j, если Аi, j является минимальным элементом в i-й строке
 и максимальным в j-м столбце)
 */
public class Task_15 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = rand.nextInt(1000);
                System.out.printf("%4d", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Saddle(matrix);
    }

    private static void Saddle(int[][] matrix) {
        int [] min = new int[matrix.length];
        int tempI = 0,tempJ = 0;
        for (int i = 0; i < matrix.length; i++) {
            min[i] = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][j] < min[i]){
                    min[i] = matrix[i][j];
                    tempI = i;
                    tempJ = j;
                }
            }
            int count = 0;
            int max = min[i];
            for (int k = 0; k < matrix.length; k++) {
                if(max < matrix[k][tempJ])
                    count++;
            }
            if (count == 0)
                System.out.printf("Saddle point : %4d", max);

        }
        System.out.println();
    }
}
