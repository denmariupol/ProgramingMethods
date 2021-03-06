package Chapter_7_Strings.Variant_A.Task_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 10.11.2016.
 * Определить сумму всех целых чисел, встречающихся в заданном тексте
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        Scanner scanner = null;
        int sum = 0;
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
                Pattern pat = Pattern.compile("\\d+[,]*\\d+");
                Matcher matcher = pat.matcher(word);
                while (matcher.find()) {
                    String s = matcher.group();
                    Pattern pat1 = Pattern.compile("\\p{Punct}");
                    Matcher matcher1 = pat1.matcher(s);

                    if(!matcher1.find()) {
                        System.out.println(matcher.group());
                        char[] num = matcher.group().toCharArray();
                        for (int i = 0; i < num.length; i++) {
                            sum += Character.getNumericValue(num[i]);
                        }
                    }
                }
            }
        }
        System.out.println("Сумма цифр в тексте: "+sum);
    }
}
