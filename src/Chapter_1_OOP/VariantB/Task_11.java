package Chapter_1_OOP.VariantB;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_11 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200)-100);


        LuckyNumbers(list);
    }
    private static void LuckyNumbers(ArrayList<Integer> list) {
        System.out.println("Lucky Numbers");
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> lucky = new ArrayList<Integer>();
        for(int i = 1;i<=100;i++)
            num.add(i);

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0)
                num.remove(i);
        }
        for (int i = 1; i < num.size(); i++) {
            if (i % 2 == 0)
                num.remove(i);
        }
        for (int i = 1; i < num.size(); i++) {
            if (i % 6 == 0)
                num.remove(i);
        }
        for (int i = 0; i <num.size() ; i++) {
            lucky.add(num.get(i));
        }
        for (int i = 0; i <num.size() ; i++) {
            for (int j = 0; j <list.size() ; j++) {
                if(num.get(i) == list.get(j))
                    System.out.print(list.get(j)+" ");
            }
        }
    }
}
