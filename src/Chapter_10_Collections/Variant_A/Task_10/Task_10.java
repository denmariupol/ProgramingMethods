package Chapter_10_Collections.Variant_A.Task_10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 24.11.2016.
 * С использованием множества выполнить попарное суммирование
 * произвольного конечного ряда чисел по следующим правилам: на первом этапе
 * суммируются попарно рядом стоящие числа, на втором этапе суммируются
 * результаты первого этапа и т. д. до тех пор, пока не останется одно число.
 */
public class Task_10 {
    static HashSet<Integer> set = new HashSet<>();
    static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 50; i++)
            set.add(random.nextInt(50));

        System.out.println("Initial Set: ");
        for (Integer integer : set)
            System.out.print(integer + " ");
        System.out.println();

        Iterator<Integer> sIter = set.iterator();

        while (sIter.hasNext()) {
            list.add(sIter.next());
        }
        PairSum(list);
    }

    static void PairSum(LinkedList<Integer> l) {
        System.out.println();
        int sum = 0;
        LinkedList<Integer> temp = new LinkedList<>();
        if ((l.size() % 2 != 0) && (l.size() != 1))
            l.pollLast();
        else if (l.size() == 1) {
            System.out.println(l.get(0));
            return;
        }
        int i = 0;
        do {
            if ((i % 2 == 0) && (i != 0)) {
                System.out.print(sum + " ");
                temp.add(sum);
                sum = 0;
            }
            if (i <l.size())
                sum += l.get(i);
            i++;
        } while (i <= l.size());
        PairSum(temp);
    }
}

