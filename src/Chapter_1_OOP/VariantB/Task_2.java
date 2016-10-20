package Chapter_1_OOP.VariantB;

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
                list.add(rand.nextInt(200) - 100);

            MinMax(list);

    }
    private static void MinMax(ArrayList<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        System.out.print("Minimal number : ");
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min)
                min = list.get(i);
        }

        System.out.print(min);
        System.out.print(" Maximal number : ");
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        System.out.print(max);
    }

}
