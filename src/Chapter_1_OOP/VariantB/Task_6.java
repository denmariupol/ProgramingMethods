package Chapter_1_OOP.VariantB;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextDouble() * (200 - 100) - 150);
        RepetingNumbers(list);
    }
    private static void RepetingNumbers(ArrayList<Double> list) {
        System.out.println();
        System.out.println("Nonrepeting numbers ");
        String pattern = "##0.0000";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        for (int i = 0; i < list.size(); i++) {
            String[] s = decimalFormat.format(list.get(i)).split(",");
            char[] ch = s[1].toCharArray();

            int c = 0;
            for (int j = 0; j < ch.length - 1; j++) {
                for (int k = j + 1; k < ch.length; k++) {
                    if (ch[j] == ch[k])
                        c++;
                }
            }
            if (c == 0)
                System.out.print(decimalFormat.format(list.get(i)) + " ");

        }
    }
}
