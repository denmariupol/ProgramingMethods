package Chapter_7_Strings.Variant_A.Task_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 10.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        Scanner scanner = null;
        int count = 0;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            Scanner scanner1 = new Scanner(str);
            while (scanner1.hasNext()) {
                String word = scanner1.next();
                Pattern pat = Pattern.compile("\\p{Punct}");
                Matcher matcher = pat.matcher(word);
                while (matcher.find()) {
                    count++;
                }
            }
        }
        System.out.println("Колличество знаков: "+count);
    }
}
