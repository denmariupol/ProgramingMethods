package Chapter_10_Collections.Examples.Comparator;

import Chapter_10_Collections.Examples.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Ingener_mobil on 22.11.2016.
 */
public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Item> p = new ArrayList<Item>();
        p.add(new Item(52201, 9.75f, "T-Shirt"));
        p.add(new Item(52127, 13.99f, "Dress"));
        p.add(new Item(47063, 45.95f, "Jeans"));
        p.add(new Item(90428, 60.9f, "Gloves"));
        p.add(new Item(53295, 31f, "Shirt"));
        p.add(new Item(63220, 14.9f, "Tie"));

        ItemComparator comp = new ItemComparator(ItemEnum.NAME);
//        {
            // сравнение для сортировки по убыванию цены товара
//            public int compare(Item one, Item two) {
//                return compare(two, one);
//            }
            // public boolean equals(Object ob) { /* реализация */ }
//        };
        // сортировка списка объектов
        Collections.sort(p, comp);
        System.out.println(p);

    }
}
