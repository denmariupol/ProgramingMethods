package Chapter_2_DataTypes_and_Operators.VariantC;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 24.10.2016.
 */
public class Task_3 {
    public static void main(String[] args) {
        int rows = 8;
        int cols = 8;
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
        Resolving(matrix);
    }

    private static void Resolving(int[][] matrix) {
        ArrayList<Sequence> sequence = new ArrayList<Sequence>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        int count = 0;
        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {
                if (matrix[r][c] > matrix[r][c+1]) {

                }
            }
        }
        sequence.add(new Sequence(array,count));
    }
    private static class Sequence{
        private ArrayList<Integer> numbers;
        private int count;

        public Sequence(ArrayList<Integer> numbers, int count) {
            this.numbers = numbers;
            this.count = count;
        }

        public ArrayList<Integer>  getNumbers() {
            return numbers;
        }

        public int getCount() {
            return count;
        }
    }
}
