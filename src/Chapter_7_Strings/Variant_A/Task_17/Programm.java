package Chapter_7_Strings.Variant_A.Task_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * В тексте найти первую подстроку максимальной длины, не содержащую букв.
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        TreeSet<String> digits = new TreeSet<String>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("\\p{Punct}", "").trim();
                Pattern pat=Pattern.compile("\\b\\d+\\b");
                Matcher matcher=pat.matcher(word);
                while (matcher.find()) {
                    digits.add(matcher.group());
                }
            }
            System.out.println("Подстрока макс длины без букв: "+digits.last());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
