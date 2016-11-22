package Chapter_10_Collections.Examples.Collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Ingener_mobil on 22.11.2016.
 */
public class Demo {
    public static void main(String[ ] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer n, Integer m) {
                return m.intValue() - n.intValue();
            }
        };
        ArrayList<Integer> list = new ArrayList();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.shuffle(list);
        System.out.println("Shuffle: "+list);
        Collections.sort(list, comp);
        System.out.println("Sort: "+list);
        Collections.reverse(list);
        System.out.println("Reverse: "+list);
        Collections.rotate(list, 3);
        System.out.println("Rotate: "+list);
        Collections.swap(list,1,3);
        System.out.println("Swap: "+list);
        System.out.println("Frequency: "+Collections.frequency(list,5));
        Collections.replaceAll(list,5,9);
        System.out.println("Replace: "+list);
        System.out.println("min: " + Collections.min(list, comp));
        System.out.println("max: " + Collections.max(list, comp));
        Collections.fill(list,9);
        System.out.println("Fill: "+list);
        List<Integer> singl = Collections.singletonList(71);
        System.out.print(singl);
// singl.add(21); // ошибка времени выполнения
    }
    private static void print(List<Integer> c) {
        for (int i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
