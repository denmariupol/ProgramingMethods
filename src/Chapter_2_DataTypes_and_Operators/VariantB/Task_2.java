package Chapter_2_DataTypes_and_Operators.VariantB;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by User on 22.10.16.
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0,j=0;

        System.out.print("Введите кол-во столбцов : ");
        if (scan.hasNextInt())
            i = scan.nextInt();
        else
            System.out.print("Неверный формат ввода");

        System.out.print("Введите кол-во строк : ");
        if (scan.hasNextInt())
            j = scan.nextInt();
        else
            System.out.print("Неверный формат ввода");

        Matrix(i,j);
    }
    private static void Matrix(int i,int j){
        int [][] matrix = new int[i][j];
        int number =0;
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                matrix[k][l] = number;
                number++;
            }
        }
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.printf("%4d",matrix[k][l]);
                if (l == j-1)
                    System.out.println();
            }
        }
    }
}
