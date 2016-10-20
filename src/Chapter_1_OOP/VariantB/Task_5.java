package Chapter_1_OOP.VariantB;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_5 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200)-100);
        BubbleSort(list);
    }
    private static void BubbleSort(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) > list.get(i)) {
                int temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                count++;
            }
        }
        if (count != 0)
            BubbleSort(list);
        else {
            System.out.println();
            System.out.println("Bubble sort...");
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
        }

    }
}
