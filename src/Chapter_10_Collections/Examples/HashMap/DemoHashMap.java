package Chapter_10_Collections.Examples.HashMap;

import java.util.*;

/**
 * Created by Ingener_mobil on 22.11.2016.
 */
public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<String, Integer>();
        hm.put("Сырок", 3);
        hm.put("Пряник", 5);
        hm.put("Молоко", 1);
        hm.put("Хлеб", 1);
        System.out.println(hm);
        if( !hm.containsKey("Пряник") )
            hm.put("Пряник",4);// замена или добавление при отсутствии ключа
        System.out.println(hm + "после замены элемента");
        Integer a = hm.get("Хлеб");
        System.out.println(a + " - найден по ключу 'Хлеб'");
        // вывод хэш-таблицы с помощью методов интерфейса Map.Entry<K,V>
        Set<Map.Entry<String, Integer>> setv = hm.entrySet();
        System.out.println(setv);
        Iterator<Map.Entry<String, Integer>> i = setv.iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> me = i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }
        Set<Integer> val = new HashSet<Integer>(hm.values());
        System.out.println(val);
    }
}
