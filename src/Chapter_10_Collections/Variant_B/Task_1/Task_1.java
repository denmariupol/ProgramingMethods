package Chapter_10_Collections.Variant_B.Task_1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Ingener_mobil on 24.11.2016.
 * В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета
 * по кругу вычеркивается каждый второй человек, пока не останется один.
 * Составить две программы, моделирующие процесс. Одна из программ
 * должна использовать класс ArrayList, а вторая — LinkedList. Какая из двух
 * программ работает быстрее? Почему?
 */
public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            arrayList.add(i);

        long endTime = System.currentTimeMillis();
        System.out.println("Array List Creation: "+(float)(endTime - startTime)/1000);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            linkedList.add(i);

        endTime = System.currentTimeMillis();
        System.out.println("Linked List Creation: "+(float)(endTime - startTime)/1000);

        startTime = System.currentTimeMillis();
        Linked(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("Linked List: "+(float)(endTime - startTime)/1000);

        startTime = System.currentTimeMillis();
        Arr(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println("Array List: "+(float)(endTime - startTime)/1000);
    }

    static void Linked(LinkedList<Integer> l) {
        int i = 0;
        do {
            if ((i % 2 == 0) && (i != 0) && i < l.size()) {
              l.remove(i);
            }
            if(l.size() == 2) {
                l.remove(1);
                return;
            }
            i++;
        } while (i <= l.size());
        Linked(l);
    }

    static void Arr(ArrayList<Integer> l) {
        int i = 0;
        do {
            if ((i % 2 == 0) && (i != 0) && i < l.size()) {
                l.remove(i);
            }
            if(l.size() == 2) {
                l.remove(1);
                return;
            }
            i++;
        } while (i <= l.size());
        Arr(l);
    }
}
