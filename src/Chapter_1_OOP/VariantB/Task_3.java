package Chapter_1_OOP.VariantB;

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
            list.add(rand.nextInt(200) - 100);
        ThreeOrNine(list);
    }

    private static void ThreeOrNine(ArrayList<Integer> list) {
        System.out.println();
        System.out.print("Number divided by 3 : ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0)
                System.out.print(list.get(i) + " ");
        }
        System.out.print(" Number divided by 9 : ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 9 == 0)
                System.out.print(list.get(i) + " ");
        }
    }
}
