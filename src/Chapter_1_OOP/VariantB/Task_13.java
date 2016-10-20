package Chapter_1_OOP.VariantB;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_13 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200));
        Palindrome(list);
    }

    private static void Palindrome(ArrayList<Integer> list) {
        System.out.println("Palindromes : ");
        for (Integer num : list) {
            char[] chars = Integer.toString(num).toCharArray();
            int count = 0;
            if (chars.length > 1) {
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] != chars[(chars.length - 1) - i]) {
                        count++;
                    }
                }
                if (count == 0)
                    System.out.print(num + " ");
                count = 0;
            }
        }
    }
}
