package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 28.10.2016.
 * Найти наименьший среди локальных максимумов. (Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)
 */
public class Task_18 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
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
        LocalMinimum(matrix);
    }

    private static void LocalMinimum(int[][] matrix) {
        int minCount = 0;
        ArrayList<Integer> localMinimum = new ArrayList<Integer>();
        System.out.println("Local Minimums");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (CheckNeighbors(matrix, i, j) > 0)
                localMinimum.add(CheckNeighbors(matrix, i, j));
            }
        }
        if(localMinimum.size()> 0) {
            int min = localMinimum.get(0);
            for (int i = 0; i < localMinimum.size(); i++) {
                System.out.printf("%4d", localMinimum.get(i));
            }
            for (int i = 0; i < localMinimum.size(); i++) {
                if(localMinimum.get(i) < min)
                    min = localMinimum.get(i);
            }
            System.out.println();
            System.out.print("Minimum");
            System.out.printf("%4d", min);
        }
    }

    private static int CheckNeighbors(int[][] matrix, int mI, int mJ) {
        int count = 0, min = 0;
        for (int i = mI - 1; i <= mI + 1; i++) {
            for (int j = mJ - 1; j <= mJ + 1; j++) {
                try {
                    if (matrix[mI][mJ] > matrix[i][j])
                        count++;
                } catch (IndexOutOfBoundsException e) {
                }
            }
        }
        if (count == 0) {
            return matrix[mI][mJ];
        }
        return 0;
    }
}
//        for (Integer minimum : minimums) {
//            System.out.printf("%4d",minimum);
//        }
//        if (minimums.size()>0) {
//            min = minimums.get(0);
//            for (int i = 0; i < minimums.size(); i++) {
//                if (minimums.get(i) < min)
//                    min = minimums.get(i);
//            }
//        }



