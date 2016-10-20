package Chapter_1_OOP.VariantB;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_8 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200) - 100);

        SimpleNumbers(list);
    }
    public static void SimpleNumbers(ArrayList<Integer> list) {
        System.out.println("Simple numbers in array : ");
        for (Integer number : list) {
            for (int j = 2; j <= number; j++) {
                if ((number % j == 0) && (j < number))
                    break;
                else if ((number % j == 0) && (j == number))
                    System.out.print(number + " ");
            }

        }
    }
}
