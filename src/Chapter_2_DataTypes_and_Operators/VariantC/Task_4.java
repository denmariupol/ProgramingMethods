package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 25.10.2016.
 *Найти сумму элементов матрицы, расположенных между первым и вторым
 положительными элементами каждой строки
 */
public class Task_4 {
    public static void main(String[] args) {
        int rows = 8;
        int cols = 8;
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++)
            {
                matrix[r][c] = rand.nextInt(100)-50;
                System.out.printf("%4d", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Sum(matrix);
    }

    private static void Sum(int[][] matrix) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int summ = 0,count = 0;
        int []pos = new int[]{50,50};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0 && count < 2){
                    if(pos[0] == 50) pos[0] = j;
                    else  pos[1] = j;
                    count++;
                }
                if (j == matrix[i].length - 1 && count == 0)
                    pos[1] = pos[0] = 0;
                else if (j == matrix[i].length - 1 && count < 2)
                    pos[1] = pos[0];
            }
            for (int j = pos[0]+1; j < pos[1]; j++) {
                summ += matrix[i][j];
            }
            pos[0] = 50;
            pos[1] = 50;
            sum.add(summ);
            summ = 0;
            count = 0;
        }
        for (Integer integer : sum) {
            System.out.printf("%d",integer);
            System.out.println();
        }
    }
}
