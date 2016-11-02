package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 25.10.2016.
 * Вычислить определитель матрицы.
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
                matrix[r][c] = rand.nextInt(100) - 50;
                System.out.printf("%4d", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Determinator(matrix);
    }

    private static void Determinator(int[][] matrix) {
        System.out.println();
        int[] d = new int[matrix.length];
        int determinator = 0;
        for (int k = 0; k < matrix.length; k++) {
            ArrayList<ArrayList <Integer>> dMatrixOut = new ArrayList<ArrayList<Integer>>();


            for (int i = 0; i < matrix.length; i++) {
                if (k == i)
                    continue;
                ArrayList<Integer> dMatrixIn = new ArrayList<Integer>();
                for (int j = 0; j < matrix[i].length; j++) {
                    if (k == j)
                        continue;
                    dMatrixIn.add(matrix[i][j]);
                }
                dMatrixOut.add(dMatrixIn);
            }

            d[k] = Result(dMatrixOut);
        }
        for (int i = 0; i < d.length; i++) {
            determinator+=d[i];
        }
        System.out.println(determinator);
    }

    private static int Result(ArrayList<ArrayList <Integer>> m) {
         return m.get(0).get(0) * m.get(1).get(1) * m.get(2).get(2)+
                m.get(0).get(1) * m.get(1).get(2) * m.get(2).get(0) +
                m.get(0).get(2) * m.get(1).get(0) * m.get(2).get(1) -

                m.get(0).get(2) * m.get(1).get(1) * m.get(0).get(2) -
                m.get(0).get(0) * m.get(1).get(2) * m.get(2).get(1) -
                m.get(0).get(1) * m.get(1).get(0) * m.get(2).get(2);

    }
}
