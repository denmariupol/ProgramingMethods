package Chapter_7_Strings.Variant_A.Task_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 09.11.2016.
 * После каждого слова текста, заканчивающегося заданной подстрокой,
 вставить указанное слово.
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите подстроку: ");
        Scanner scan = new Scanner(System.in);
        String subStr = scan.next();

        System.out.println("Введите повторяющееся слово: ");
        scan = new Scanner(System.in);
        String word = scan.next();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String w = scanner.nextLine();
                Scanner s = new Scanner(w);
                while (s.hasNext()){
                    System.out.println(s.next());
                    if(s.next().contains(subStr)) {
                        sb.append(s.next() + " ");
                        sb.append(word + " ");
                    }
                    else
                        sb.append(s.next()+" ");
                }

                sb.append("\n");
                break;
            }
            System.out.println(sb.toString());
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
