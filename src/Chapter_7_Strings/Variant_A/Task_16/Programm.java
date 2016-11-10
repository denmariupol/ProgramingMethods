package Chapter_7_Strings.Variant_A.Task_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * В стихотворении найти одинаковые буквы, которые встречаются во всех словах.
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        TreeSet<Character> characters = new TreeSet<Character>();
        TreeSet<String> words = new TreeSet<String>();
        int length = 0;
        int maxLength = 11;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("\\p{Punct}", "").trim();
                char[] ch = word.toCharArray();
                if (ch.length > maxLength) {
                    length++;
                    words.add(word);
                    for (char c : ch)
                        characters.add(c);
                }
            }

            for (char ch : characters) {
                int counter = 0;
                for (String word : words) {
                    if (word.indexOf(ch) > 0)
                        counter++;
                }
                if (counter == length)
                    System.out.println(ch + " встречается во словах с кол-вом букв >" + maxLength);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
