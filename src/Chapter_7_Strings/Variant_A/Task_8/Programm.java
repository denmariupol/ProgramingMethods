package Chapter_7_Strings.Variant_A.Task_8;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by den on 2016-11-09.
 * Удалить из текста его часть,заключенную между двумя символами
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\TestDir\\MetodiProgrammirovaniya\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        ArrayList<Integer> range = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        String text = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                sb.append(line + "\n");
            }
            text = sb.toString();
            char[]chars = sb.toString().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '<' || chars[i] == '>')
                    range.add(i);
            }
            String textCut = text.substring(0, range.get(0));
            sb = new StringBuilder();
            sb.append(textCut);
            textCut = text.substring(range.get(1)+1, text.length());
            sb.append(textCut);
            System.out.println(sb.toString());
        }catch(FileNotFoundException e ){
        System.out.println(e.getMessage());
    }
}
}
