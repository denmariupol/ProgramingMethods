package Chapter_10_Collections.Variant_A.Task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 23.11.2016.
 * Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке
 */
public class Task_1 {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_9_IO\\Source.txt");
        LinkedList<String> list = new LinkedList<String>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        Collections.reverse(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
