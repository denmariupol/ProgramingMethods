package Chapter_2_DataTypes_and_Operators.VariantC;

import java.util.Random;

/**
 * Created by User on 23.10.16.
 */
public class Task_1 {
    public static void main(String[] args) {
        int i = 8;
        int j = 8;
        int [][] matrix = new int[i][j];
        int [] temp = new int[i];
        Task_1_Row [] row = new Task_1_Row[i];
        Random rand = new Random();
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                temp[l] = rand.nextInt(100);
            }
            row[k] = new Task_1_Row(temp);
        }
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.printf("%4d",row[l].getNumbers()[k]);
                if (l == j-1)
                    System.out.println();
            }
            if (k == i-1) {
                for (int l = 0; l < row.length; l++) {
                    System.out.printf("%4d", row[l].getSum());
                }

            }
        }
    }

//    private static void ElementsSum(int [][] matrix){
//        int i = matrix.length;
//        int j = matrix[0].length;
//        int [] elementsSum = new int[i];
//        for (int k = 0; k < i; k++) {
//            for (int l = 0; l < j; l++) {
//                elementsSum[k]+= matrix[l][k];
//            }
//        }
//        ElementsSort(elementsSum,elementsSum,matrix);
//    }
//    private static void ElementsSort(int [] oldElementsSum,int [] initialElements,int [][] matrix){
//        int temp,count = 0;
//        int [] newElementsSum = oldElementsSum.clone();
//        for (int k = 0; k < newElementsSum.length - 1; k++) {
//            if (newElementsSum[k]> newElementsSum[k+1]){
//                temp = newElementsSum[k];
//                newElementsSum[k] = newElementsSum[k+1];
//                newElementsSum[k+1] = temp;
//                count++;
//            }
//        }
//        if (count!=0)
//            ElementsSort(newElementsSum,initialElements,matrix);
//        else{
//            ArraySort(newElementsSum,initialElements,matrix);
//        }
//    }
//    private static void ArraySort(int [] sortedArray,int [] initialArray,int [][] matrix){
//        int temp;
//        System.out.println();
//        for (int k = 0; k < initialArray.length; k++) {
//            System.out.printf("%4d", initialArray[k]);
//        }
//        System.out.println();
//        for (int k = 0; k < sortedArray.length; k++) {
//            System.out.printf("%4d",sortedArray[k]);
//        }
//        System.out.println();
//        System.out.println();
//        for (int i = 0; i < initialArray.length; i++) {
//            for (int j = i+1; j <sortedArray.length ; j++) {
//                if (initialArray[i] == sortedArray[j]) {
//                    for (int k = 0; k < matrix.length; k++) {
//                        temp = matrix[k][i];
//                        matrix[k][i] = matrix[k][j];
//                        matrix[k][j] = temp;
//                        System.out.println(matrix[k][j]);
//                    }
//                }
//            }
//            break;
//        }
//
//        for (int k = 0; k < matrix.length; k++) {
//            for (int l = 0; l < matrix[0].length; l++) {
//                System.out.printf("%4d",matrix[k][l]);
//                if (l == matrix[0].length-1)
//                    System.out.println();
//            }
//        }
//    }
}
