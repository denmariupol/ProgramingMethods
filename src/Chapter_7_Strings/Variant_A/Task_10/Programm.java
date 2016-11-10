package Chapter_7_Strings.Variant_A.Task_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * В тексте найти и напечатать n символов (и их количество), встречающихся
 наиболее часто.
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        TreeSet<Character> characters = new TreeSet<Character>();
        ArrayList<Letter> charFrequencies = new ArrayList<Letter>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                char[]ch = scanner.next().replaceAll("\\p{Punct}", "").trim().toCharArray();
                for (char c : ch) {
                    characters.add(c);
                }
            }
            for (Character character : characters)
                charFrequencies.add(new Letter(character));

            for (Letter charFrequency : charFrequencies) {
                scanner = new Scanner(file);
                while (scanner.hasNext()){
                    char[]ch = scanner.next().replaceAll("\\p{Punct}", "").trim().toCharArray();
                    for (int i = 0; i < ch.length; i++) {
                        if(ch[i] == charFrequency.getCh())
                            charFrequency.addFrequency();
                    }
                }
                System.out.println(charFrequency.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
