package Chapter_7_Strings.Variant_A.Task_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * В тексте найти и напечатать все слова максимальной и все слова минимальной длины
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
        int max = 0;
        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("\\p{Punct}", "").trim();
            words.add(word);
            if(word.length()>max) max = word.length();
        }
        for (String word : words) {
            if(word.length() == 1)
                System.out.println(word);
            if(word.length() == max)
                System.out.println(word);
        }
    }
}
