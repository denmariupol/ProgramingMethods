package Chapter_7_Strings.Variant_A.Task_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Ingener_mobil on 09.11.2016.
 * В тексте после k-го символа вставить заданную подстроку
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        StringBuilder sb = new StringBuilder();
        try{
            Scanner scanner = new Scanner(file);
            System.out.println("Введите порядковый номер символа: ");
            Scanner inp = new Scanner(System.in);
            int input = 0,first = 0,second = 0;
            if(inp.hasNextInt())
                input = inp.nextInt();

            System.out.println("Введите начальный номер подстроки: ");
            inp = new Scanner(System.in);
            if(inp.hasNextInt())
                first = inp.nextInt();

            System.out.println("Введите конечный номер подстроки: ");
            inp = new Scanner(System.in);
            if(inp.hasNextInt())
                second = inp.nextInt();

            while (scanner.hasNextLine()){
                sb.append(scanner.nextLine());
            }

            String text = sb.toString();
            String subStr = text.substring(first,second);
            StringBuilder sb1 = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if(i != input)
                    sb1.append(text.charAt(i));
                else
                    sb1.append(subStr);
            }
            System.out.println(sb1);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
