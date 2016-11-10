package Chapter_7_Strings.Variant_A.Task_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        TreeSet<String> words = new TreeSet<String>();
        ArrayList<WordFrequency> wordFrequencies = new ArrayList<WordFrequency>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("\\p{Punct}", "").trim();
                words.add(word);
            }

            for (String word : words)
                wordFrequencies.add(new WordFrequency(word));

            for (WordFrequency w : wordFrequencies) {
                scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String word = scanner.next().replaceAll("\\p{Punct}", "").trim();
                    if (w.getWord().equals(word))
                        w.addFrequency();
                }
            }
            for (WordFrequency word : wordFrequencies)
                System.out.println(word.toString());

        }catch(
    FileNotFoundException e){
        System.out.println(e.getMessage());
    }
}
}
