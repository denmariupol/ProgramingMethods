package Chapter_7_Strings.Variant_A.Task_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * Из кода Java удалить все комментарии (//, /*, /**).
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            Scanner scanner1 = new Scanner(str);
            while (scanner1.hasNext()) {
                String word = scanner1.next();
                word = word.replaceAll("[/*]","");
                    sb.append(word+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
