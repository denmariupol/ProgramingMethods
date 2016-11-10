package Chapter_7_Strings.Variant_A.Task_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.
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
            
            if(Character.toString(chars[0]).matches("[БВГДЖЗКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ]") &&
                    Character.toString(chars[chars.length-1]).matches("[БВГДЖЗКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ]")) {
//                words.add(word);
                System.out.println(word);
            }
        }
    }
}
