package Chapter_7_Strings.Variant_A.Task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 07.11.2016.
 * В каждом слове текста k-ю букву заменить заданным символом. Если k
 больше длины слова, корректировку не выполнять.
 */

public class Task_1 {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите символ :");
        String newChar = input.next();
        int simbol = 0;
        System.out.print("Введите номер символа в слове :");
        if(input.hasNextInt())
            simbol = input.nextInt();
        else
            System.out.println("Введите число");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word1 = "",word2 = "";
                String word = scanner.next().replaceAll("\\p{Punct}", "");
                StringBuilder sb = new StringBuilder();
                if (word.length() > simbol) {
                    word1 = word.substring(0, simbol - 1);
                    sb.append(word1);
                    sb.append(newChar);
                    word2 = word.substring(simbol, word.length());
                    sb.append(word2);
                    System.out.println(word + " -> " + sb.toString());
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("!!"+e.getMessage());
        }
    }
}
