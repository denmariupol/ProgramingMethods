package Chapter_2_DataTypes_and_Operators.VariantA;
import java.util.ArrayList;
import java.util.Random;


/**
 * Created by Ingener_mobil on 21.10.2016.
 */
public class Task_5 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200000));
        Check(list);
    }

    private static void Check(ArrayList<Integer>list){
        ArrayList<Integer> newList = new ArrayList<Integer>();


        for (Integer num : list) {
            int count = 0;
            char[] ch = String.valueOf(num).toCharArray();
            for (int i = 0; i < ch.length; i++) {
                StringBuilder sb = new StringBuilder();
                String s = sb.append(ch[i]).toString();
                if(Integer.parseInt(s) %2.0 == 0)
                    count++;
                if (count == ch.length)
                    newList.add(num);
            }

        }
        for (Integer integer : newList) {
            System.out.print(integer);
        }
    }
}
