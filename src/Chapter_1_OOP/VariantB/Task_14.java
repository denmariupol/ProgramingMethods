package Chapter_1_OOP.VariantB;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_14 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(20));
        HalfSum(list);
    }

    private static void HalfSum(ArrayList<Integer>list){
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) == (list.get(i-1)+list.get(i+1))/2.0)
                System.out.printf(" %d = (%d+%d)/2",list.get(i),list.get(i - 1),list.get(i + 1));
        }
    }
}
