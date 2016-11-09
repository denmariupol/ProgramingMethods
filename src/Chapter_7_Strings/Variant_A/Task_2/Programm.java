package Chapter_7_Strings.Variant_A.Task_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 08.11.2016.
 * В тексте каждую букву заменить ее порядковым номером в алфавите. При
 выводе в одной строке печатать текст с двумя пробелами между буквами,
 в следующей строке внизу под каждой буквой печатать ее номер
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        StringBuilder sb = new StringBuilder();
        char[]charArray;
        int line = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                sb.append(scanner.nextLine()+" \n");
            }
            charArray = sb.toString().toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if(line % 3 == 0 && charArray[i]== ' ')
                    System.out.print("  ");
                else
                    System.out.print(charArray[i]);

                if(line % 2 == 0 && line != 0)
                    System.out.print((int)charArray[i]);
                if (charArray[i]=='\n')
                    line++;
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}

