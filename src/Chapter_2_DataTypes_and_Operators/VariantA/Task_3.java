package Chapter_2_DataTypes_and_Operators.VariantA;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200000));
        AverageLength(list);

    }

    private static void AverageLength(ArrayList<Integer> list) {
        int all = 0;
        for (int i = 0; i < list.size(); i++) {
            char[] ch = String.valueOf(list.get(i)).toCharArray();
            all+=ch.length;
        }
        int average = all/list.size();
        System.out.printf("Average %d",average);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            char[] ch = String.valueOf(list.get(i)).toCharArray();
            if (ch.length > average)
                System.out.print(list.get(i)+" ");
        }
    }
}
