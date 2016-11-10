package Chapter_7_Strings.Variant_A.Task_19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * Преобразовать текст так, чтобы каждое слово,
 * не содержащее неалфавитных символов, начиналось с заглавной буквы.
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
                Pattern pat = Pattern.compile("\\b\\D+\\p{Punct}*\\b");
                Matcher matcher = pat.matcher(word);
                while (matcher.find()) {
                    char []w = matcher.group().toCharArray();
                    w[0]=Character.toUpperCase(w[0]);
//                    System.out.println(w[0]);
                    sb.append(new String(w) + " ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
