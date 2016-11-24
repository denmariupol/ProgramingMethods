package Chapter_10_Collections.Variant_A.Task_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 24.11.2016.
 * Задан файл с текстом на английском языке. Выделить все различные слова.
 Для каждого слова подсчитать частоту его встречаемости.
 Слова, отличающиеся регистром букв, считать различными. Использовать класс HashMap.
 */
public class Task_17 {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_9_IO\\Source.txt");
        Scanner scanner = null;
        HashMap<String,Integer> map = new HashMap<>();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()){
            String w = scanner.next();
            String word = w.replaceAll("\\p{Punct}","");
            if (map.containsKey(word)) {
                int i = map.get(word);
                map.put(word, ++i);
            }
            else if (word.length()>0)
                map.put(word,1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
