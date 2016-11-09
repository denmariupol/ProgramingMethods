package Chapter_7_Strings.Variant_A.Task_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 09.11.2016.
 * В тексте после буквы Р, если она не последняя в слове,
 * ошибочно напечатана буква А вместо О. Внести исправления в текст.
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        File file1 = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source1.txt");
        StringBuilder sb = new StringBuilder();
        char[] charArray;
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter writer = new PrintWriter(file1);
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                Scanner strScan = new Scanner(string);
                while (strScan.hasNext()) {
                    char[] word = strScan.next().toCharArray();
                    for (int i = 0; i < word.length; i++) {
                        if (word[i] == 'р' && i < word.length) {
                            if (word[i + 1] == 'о')
                                word[i + 1] = '!';
                        }
                        sb.append(word[i]);
                    }
                    sb.append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
            writer.write(sb.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
