package Chapter_2_DataTypes_and_Operators.VariantA;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(2000));
        MinMaxLength(list);

    }
    private static void MinMaxLength(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                int temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                count++;
            }

        }
        if (count != 0)
            MinMaxLength(list);
        else {
            System.out.println();
            System.out.println("Bubble sort...");
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + "->"+String.valueOf( list.get(j)).toCharArray().length+" ");
            }
        }
    }

    private static void Sort(ArrayList<Number> num) {

        }
}
