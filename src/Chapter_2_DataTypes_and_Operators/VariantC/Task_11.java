package Chapter_2_DataTypes_and_Operators.VariantC;

/**
 * Created by Ingener_mobil on 27.10.2016.
 */

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by Ingener_mobil on 27.10.2016.
 * Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями
 */
public class Task_11 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = rand.nextInt(20)-10;
                System.out.printf("%4d", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        MaxElement(matrix);
    }

    private static void MaxElement(int[][] matrix) {

        ArrayList<Integer> maxI = new ArrayList<Integer>();
        ArrayList<Integer> maxJ = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    maxI.add(i);
                    maxJ.add(j);
                }
            }
        }
        ArrayList<ArrayList <Integer>> dMatrixOut = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < matrix.length; i++) {
            if (maxI.contains(i))
                continue;
            ArrayList<Integer> dMatrixIn = new ArrayList<Integer>();
            for (int j = 0; j < matrix[i].length; j++) {
                if(maxJ.contains(j))
                    continue;
                dMatrixIn.add(matrix[i][j]);
            }
            dMatrixOut.add(dMatrixIn);
        }
        for (ArrayList<Integer> integers : dMatrixOut) {
            System.out.println(integers);
        }
    }
}

