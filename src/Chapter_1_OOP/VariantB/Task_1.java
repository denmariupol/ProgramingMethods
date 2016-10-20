package Chapter_1_OOP.VariantB;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200)-100);

        NegPos(list);

    }
    private static void NegPos(ArrayList<Integer> list) {
        System.out.print("Negative numbers : ");
        for (Integer num : list) {
            if (num < 0)
                System.out.print(num + " ");
        }
        System.out.print(" Positive numbers : ");
        for (Integer num : list) {
            if (num > 0)
                System.out.print(num + " ");
        }
        System.out.println();
    }
}
