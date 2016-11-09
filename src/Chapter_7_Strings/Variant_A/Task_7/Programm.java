package Chapter_7_Strings.Variant_A.Task_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by den on 2016-11-09.
 * Из текста удалить все символы,кроме пробелов,не являющиеся буквами.Между последовательностями
 * подряд идущих букв оставить хотя бы один символ
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\TestDir\\MetodiProgrammirovaniya\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                Scanner s = new Scanner(str);
                while (s.hasNext()){
                    String st = s.next();
                    String word = st.replaceAll("\\p{Punct}", "");
                    sb.append(word+" ");
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }catch (FileNotFoundException e ){
            System.out.println(e.getMessage());
        }
    }
}
