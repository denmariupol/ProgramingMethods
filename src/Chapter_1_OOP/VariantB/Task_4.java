package Chapter_1_OOP.VariantB;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200)-100);
        FiveAndSeven(list);

    }
    private static void FiveAndSeven(ArrayList<Integer> list) {
        System.out.println();
        System.out.print("Number divided by 5 and 7 : ");
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 5 == 0) && (list.get(i) % 7 == 0))
                System.out.print(list.get(i) + " ");
        }

    }
}
