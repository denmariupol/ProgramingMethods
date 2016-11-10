package Chapter_7_Strings.Variant_A.Task_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * В тексте определить все согласные буквы, встречающиеся не более чем
 в двух словах
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        TreeSet<Character> characters = new TreeSet<Character>();
        TreeSet<String> words = new TreeSet<String>();
        int length = 0;
        int count = 3;
        int maxLength = 8;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("\\p{Punct}", "").trim();
                char[] ch = word.toCharArray();
                if (ch.length > maxLength) {
                    length++;
                    words.add(word);
                    for (char c : ch)
                        if(Character.toString(c).matches("[БВГДЖЗКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ]"))
                            characters.add(c);
                }
            }

            for (char ch : characters) {
                int counter = 0;
                for (String word : words) {
                    if (word.indexOf(ch) > 0)
                        counter++;
                }

                if (counter <= count)
                    System.out.println(ch + " встречается во словах с кол-вом букв >" + maxLength+" "+counter+" раз");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
