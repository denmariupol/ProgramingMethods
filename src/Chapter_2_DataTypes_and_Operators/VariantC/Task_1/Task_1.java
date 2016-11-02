package Chapter_2_DataTypes_and_Operators.VariantC.Task_1;

import java.util.Random;

/**
 * Created by User on 23.10.16.
 * Упорядочить строки (столбцы) матрицы в порядке возрастания значений
 элементов k-го столбца (строки)
 */
public class Task_1 {
    public static void main(String[] args) {
        int i = 8;
        int j = 8;
        int [][] matrix = new int[i][j];
        int [] temp = new int[i];
        Row [] row = new Row[i];
        Random rand = new Random();
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                temp[l] = rand.nextInt(100);
            }
            row[k] = new Row(temp);
        }
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.printf("%4d",row[l].getNumbers()[k]);
                if (l == j-1)
                    System.out.println();
            }
            if (k == i-1) {
                System.out.println();
                for (int l = 0; l < row.length; l++) {
                    System.out.printf("%4d", row[l].getSum());
                }
            }
        }
        System.out.println();
        Sort(row);
    }

    private static void Sort(Row [] row){
        Row temp;
        int count = 0;
        for (int i = 0; i < row.length - 1; i++) {
            if(row[i].getSum() > row[i + 1].getSum()){
                temp = row[i];
                row[i] = row[i + 1];
                row[i + 1] = temp;
                count++;
            }
        }
        if(count !=0)
            Sort(row);
        else{
            System.out.println();
            for (int k = 0; k < row.length; k++) {
                for (int l = 0; l < row.length; l++) {
                    System.out.printf("%4d",row[l].getNumbers()[k]);
                    if (l == row.length-1)
                        System.out.println();
                }
                if (k == row.length-1) {
                    System.out.println();
                    for (int l = 0; l < row.length; l++) {
                        System.out.printf("%4d", row[l].getSum());
                    }
                }
            }
        }
    }
}
