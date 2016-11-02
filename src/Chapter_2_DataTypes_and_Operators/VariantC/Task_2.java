package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.Random;

/**
 * Created by Ingener_mobil on 24.10.2016.
 * Выполнить циклический сдвиг заданной матрицы на k позиций вправо
 (влево, вверх, вниз)
 */
public class Task_2 {
    public static void main(String[] args) {
        int rows = 8;
        int cols = 8;
        int moveLeft = 2;
        Random rand = new Random();
        int [][]matrix = new int[rows][cols];
        int [] mas = new int[rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = rand.nextInt(100);
                System.out.printf("%4d",matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Move(matrix,moveLeft);

    }

    private static void Move(int[][] matrix,int move) {
        System.out.println();
        System.out.println();
        int tempMatrix;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0+move; c < matrix[r].length + move; c++) {
                if (c + move == matrix.length + 2)
                    c = 0;
                if (c + move == matrix.length + 3)
                    c = 1;
                System.out.printf("%4d",matrix[r][c]);
                if (c == move - 1) {
                    System.out.println();
                    c = matrix.length+move;
                }
            }
        }
    }
}

