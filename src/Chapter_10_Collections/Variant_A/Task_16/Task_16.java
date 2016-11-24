package Chapter_10_Collections.Variant_A.Task_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 24.11.2016.
 * Задан файл с текстом на английском языке. Выделить все различные слова.
 Слова, отличающиеся только регистром букв, считать одинаковыми.
 Использовать класс HashSet.
 */
public class Task_16 {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_9_IO\\Source.txt");
        Scanner scanner = null;
        HashSet<String> set = new HashSet<>();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()){
            String w = scanner.next();
            String word = w.replaceAll("\\p{Punct}","");
            if (set.contains(word.toLowerCase()) || set.contains(word.toUpperCase()))
                continue;
            if(word.length()>0)
                set.add(word);
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
