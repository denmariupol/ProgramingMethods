package Chapter_7_Strings.Variant_A.Task_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * Напечатать без повторения слова текста, у которых первая и последняя буквы совпадают.
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        TreeSet<String> words = new TreeSet<String>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("\\p{Punct}", "").trim();
            char []chars = word.toCharArray();

            if(chars[0] == chars[chars.length - 1] && chars.length > 1) {
//                words.add(word);
                System.out.println(word);
            }
        }
    }
}
