package Chapter_9_IO.Variant_C;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Ingener_mobil on 20.11.2016.
 * При выполнении следующих заданий для вывода результатов создавать новую директорию и файл
 * средствами класса File.
 * 1. Создать и заполнить файл случайными целыми числами. Отсортировать
 * содержимое файла по возрастанию.
 */
public class Task_1 {
    public static void main(String[] args) {
        File dir = new File("E:\\Lessons\\ProgramingMethods\\TestDir\\Task_1\\");
        dir.mkdir();
        File file = null;

        if (dir.isDirectory() && dir.exists()) {
            file = new File("E:\\Lessons\\ProgramingMethods\\TestDir\\Task_1\\Task_1_Input.txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (file.isFile() && file.exists())
            FileInput(dir, file);
        FileOutput(file);
    }

    private static void FileInput(File dir, File file) {
        FileWriter fw = null;
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 20; i++)
            sb.append(rand.nextInt(1000) + "\n");


        try {
            fw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    private static void FileOutput(File file) {
        Scanner scanner = null;
        TreeSet<Integer> sorted = new TreeSet<Integer>();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            if(scanner.hasNextInt())
                sorted.add(scanner.nextInt());
            else
                break;
        }
        for (Integer integer : sorted) {
            System.out.println(integer);
        }
    }
}
