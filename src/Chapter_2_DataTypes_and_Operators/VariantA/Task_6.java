package Chapter_2_DataTypes_and_Operators.VariantA;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 22.10.16.
 */
public class Task_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(1000));
        Result(list);
    }

    private static void Result(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer integer : list) {
            char[]ch = String.valueOf(integer).toCharArray();
            StringBuilder sb = new StringBuilder();
            String s = sb.append(ch[0]).toString();
            int min = Integer.valueOf(s);
            int count = 0;
            for (int i = 1; i < ch.length; i++) {
                sb = new StringBuilder();
                s = sb.append(ch[i]).toString();
                if(Integer.parseInt(s) > min) {
                    count++;
                    min = Integer.parseInt(s);
                }
            }
            if(count == ch.length - 1)
                result.add(integer);
        }
        System.out.println();
        System.out.print("Result : ");
        for (Integer integer : result) {
            System.out.print(integer+" ");
        }
    }

}
