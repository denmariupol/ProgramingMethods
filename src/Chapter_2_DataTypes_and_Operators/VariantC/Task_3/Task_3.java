package Chapter_2_DataTypes_and_Operators.VariantC.Task_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 24.10.2016.
 */
public class Task_3
{
    public static void main(String[] args)
    {
        int rows = 8;
        int cols = 8;
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        int[] mas = new int[rows];
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++)
            {
                matrix[r][c] = rand.nextInt(100);
                System.out.printf("%4d", matrix[r][c]);
                if (c == rows - 1)
                    System.out.println();
            }
        }
        Resolving(matrix);
    }

    private static void Resolving(int[][] matrix)
    {
        ArrayList<Sequence> sequence = new ArrayList<Sequence>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        int count = 1;
        for (int r = 0; r < matrix.length - 1; r++)
        {
            for (int c = 0; c < matrix[r].length; c++)
            {
                if ((c < matrix.length - 1) && (matrix[r][c] > matrix[r][c + 1]))
                {
                    if (!array.contains(matrix[r][c]))
                        array.add(matrix[r][c]);
                    if (!array.contains(matrix[r][c + 1]))
                        array.add(matrix[r][c + 1]);
                    count++;
                }
                if ((c == matrix.length - 1) && (matrix[r][c] > matrix[r + 1][0])){
                    if (!array.contains(matrix[r][c]))
                        array.add(matrix[r][c]);
                    if (!array.contains(matrix[r + 1][0]))
                        array.add(matrix[r + 1][0]);
                    count++;
                }
                if ((c < matrix.length - 1) && (matrix[r][c] < matrix[r][c + 1])){
                    if (array.size() > 0){
                        sequence.add(new Sequence(array, count));
                        array.clear();
                    }
                    count = 1;
                }
                if((c == matrix.length - 1) && matrix[r+1][0] > matrix[r][c]){
                    if (array.size() > 0){
                        sequence.add(new Sequence(array, count));
                        array.clear();
                    }
                    count = 1;
                }
            }
        }
        ResultSequence(sequence);
    }

    private static void ResultSequence(ArrayList<Sequence> sequence)
    {

        for (int j = 0;j < sequence.size();j++)
        {
            Sequence max = sequence.get(0);
            for (int i = 0; i < sequence.get(i).getNumbers().size(); i++)
            {
                if(sequence.get(i).getCount() > max.getCount())
                    max = sequence.get(i);
            }
            if(j == sequence.size() - 1) {
                for (int num : max.getNumbers()) {
                    System.out.printf("%d ", num);
                }
                System.out.println("Count : " + max.getCount() + " ");
            }
        }
    }

}
