package Chapter_2_DataTypes_and_Operators.VariantA;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(2000));
        MinMaxLength(list);
    }
    private static void MinMaxLength(ArrayList<Integer> list){
        int max  = list.get(0);
        int min  = list.get(0);
        for (int j = 1;j < list.size();j++){

            char [] chars = Integer.toString(list.get(j)).toCharArray();
            System.out.print(list.get(j)+"->"+chars.length+" ");
            if (list.get(j) > max) max = list.get(j);
            if (list.get(j) < min) min = list.get(j);
        }
        System.out.println();
        System.out.printf("Max = %d,Min = %d,Max Length = %d,Min Length = %d",max,min,
                String.valueOf(max).toCharArray().length,String.valueOf(min).toCharArray().length);
    }
}
