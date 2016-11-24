package Chapter_10_Collections.Variant_A.Task_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by Ingener_mobil on 24.11.2016.
 * Определить множество на основе множества целых чисел. Создать методы
 для определения пересечения и объединения множеств.
 */
public class Task_8 {
    static HashSet<Integer> set1 = new HashSet<>();
    static HashSet<Integer> set2 = new HashSet<>();

    public static void main(String[] args) {
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            set1.add(random.nextInt(20));
            set2.add(random.nextInt(20));
        }
        Iterator<Integer> set1Iter = set1.iterator();
        Iterator<Integer> set2Iter = set2.iterator();

        System.out.println("Set1:");
        while (set1Iter.hasNext())
            System.out.print(set1Iter.next()+" ");
        System.out.println();
        System.out.println("Set2:");
        while (set2Iter.hasNext())
            System.out.print(set2Iter.next()+" ");
        System.out.println();
        Intersect(set1,set2);
        AddSet(set1,set2);
    }
    static void Intersect(HashSet<Integer> set1,HashSet<Integer> set2){
        set1.retainAll(set2);
        Iterator<Integer> set11Iter = set1.iterator();
        System.out.println("Intersect: ");
        while (set11Iter.hasNext())
            System.out.print(set11Iter.next()+" ");
        System.out.println();
    }

    static void AddSet(HashSet<Integer> set1,HashSet<Integer> set2){
        set1.addAll(set2);
        Iterator<Integer> set11Iter = set1.iterator();

        System.out.println("Added Set: ");
        while (set11Iter.hasNext())
            System.out.print(set11Iter.next()+" ");

    }
}
