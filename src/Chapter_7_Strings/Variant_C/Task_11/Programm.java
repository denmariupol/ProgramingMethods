package Chapter_7_Strings.Variant_C.Task_11;

import java.util.Date;
import java.util.Random;

/**
 * Created by Ingener_mobil on 15.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Random random = new Random();
        String alphabet = "abcdefghijklmopqrstuvwxyz";
        String str = "";
        double startTime,endTime;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str +=random.nextInt(alphabet.length());
        }
        System.out.println("str length :"+str.length());
        endTime = System.currentTimeMillis();
        double time = (endTime - startTime)/1000;
        System.out.println("Time: "+ time);

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(random.nextInt(alphabet.length()));
        }
        System.out.println("sb length :"+sb.length());
        endTime = System.currentTimeMillis();
        time = (endTime - startTime)/1000;
        System.out.println("Time sb: "+ time);
    }
}


