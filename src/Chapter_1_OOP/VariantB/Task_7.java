package Chapter_1_OOP.VariantB;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_7 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200) - 100);

        NodNok(list);
    }
    private static void NodNok(ArrayList<Integer> list) {
        int nok = list.get(0);
        int nod = nok;

        for (int i = 1; i < list.size(); i++) {
            nod = GetNod(nod, list.get(i));
//            nok = getNOK(nok, arr[i]); // функции getNOK и getNOD для двух чисел
        }
        System.out.println("Nod : " + nod);
    }

    private static int GetNod(int a, int b) {
        for (; ; ) {
            if (a > b)
                a = a % b;
            else
                b = b % a;

            if (a == 0 || b == 0)
                return a + b;
        }
    }

    private static int GetnNok(int a, int b) {
        return 0;
    }

}
