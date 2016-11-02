package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.Random;

/**
 * Created by Ingener_mobil on 27.10.2016.
 * Преобразовать строки матрицы таким образом, чтобы элементы, равные
 нулю, располагались после всех остальных
 */
public class Task_13 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = rand.nextInt(10);
                System.out.printf("%4d", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Sort(matrix);
    }

    private static void Sort(int[][] matrix) {
        int temp,count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((j < matrix[i].length - 1) && (matrix[i][j] == 0)) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][j+1];
                    matrix[i][j+1] = temp;
                    if(matrix[i][j+1] != 0)
                        count++;
                }else if ((j == matrix[i].length - 1) && (matrix[i][j] == 0) && i < matrix.length - 1){
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i+1][0];
                    matrix[i+1][0] = temp;
                    count++;
                }
                if (j == matrix.length - 1)
                    System.out.println();
            }
        }
        if(count != 0)
            Sort(matrix);
        else
            Result(matrix);
    }

    private static void Result(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
                if (j == matrix.length - 1)
                    System.out.println();
            }
        }
    }

}
