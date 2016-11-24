package Chapter_10_Collections.Task_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 24.11.2016.
 * Ввести строки из файла, записать в список ArrayList.
 * Выполнить сортировку строк, используя метод sort() из класса Collections
 */
public class Task_14 {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_9_IO\\Source.txt");
        Scanner scanner = null;
        LinkedList<String> list = new LinkedList<>();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()){
            String w = scanner.next();
            String word = w.replaceAll("\\p{Punct}","");
            if(word.length()>0)
                list.add(word);
        }
        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
