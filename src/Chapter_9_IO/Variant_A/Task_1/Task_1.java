package Chapter_9_IO.Variant_A.Task_1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 17.11.2016.
 * В следующих заданиях требуется ввести последовательность строк из текстового
 * потока и выполнить указанные действия. При этом могут рассматриваться два варианта:
 * • каждая строка состоит из одного слова;
 * • каждая строка состоит из нескольких слов.
 * Имена входного и выходного файлов, а также абсолютный путь к ним могут
 * быть введены как параметры командной строки или храниться в файле.
 * 1. В каждой строке найти и удалить заданную подстроку.
 */
public class Task_1 {
    public static void main(String[] args) {
        String sourcePath = "E:\\Lessons\\ProgramingMethods\\src\\Chapter_9_IO\\Source.txt";
        File sourceFile = new File(sourcePath);
        String destPath = "E:\\Lessons\\ProgramingMethods\\src\\Chapter_9_IO\\Variant_A\\Task_1\\result.txt";
        File destFile = new File(destPath);
        Scanner scanner = null;
        FileWriter fw = null;
        System.out.print("Input substring: ");
        scanner = new Scanner(System.in);
        String subStr = scanner.nextLine();
        StringBuilder sb = new StringBuilder("");
        try {
            scanner = new Scanner(sourceFile);
            fw = new FileWriter(destFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            int i = 0;
            String str = scanner.nextLine();
            if (str.length() == 0)
                continue;
            Scanner scanStr = new Scanner(str);
            if ((i = str.indexOf(subStr)) > 0)
                sb.append(str.substring(0, i - 1) + " " + str.substring(i + subStr.length(), str.length())+"\n");
            else
                sb.append(str+"\n");
        }

        try {
            fw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
