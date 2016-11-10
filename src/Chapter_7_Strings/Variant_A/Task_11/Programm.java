package Chapter_7_Strings.Variant_A.Task_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 10.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        ArrayList<Sentence> sentences = new ArrayList<Sentence>();
        StringBuilder sentence = new StringBuilder();;
        try {
            Scanner scanner = new Scanner(file);
            FileReader reader = new FileReader(file);
            char[]buffer = new char[(int)file.length()];
            reader.read(buffer);
            int temp = 0;

            for (int i = 0; i < buffer.length; i++) {
                sentence.append(buffer[i]);
                if(buffer[i] == '.'){
                    sentences.add(new Sentence(sentence.toString()));
                    sentence = new StringBuilder();
                }
            }
            for (Sentence sentence1 : sentences) {
                Matcher vowel = Pattern.compile("([АЕЁИОУЫЭЮЯаеёиоуыэюя])", Pattern.CASE_INSENSITIVE).matcher(sentence1.getSentence());
                Matcher consonant = Pattern.compile("[БВГДЖЗКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ]", Pattern.CASE_INSENSITIVE).matcher(sentence1.getSentence());

                while (vowel.find()) {
                    sentence1.addVowel();
                }
                while (consonant.find()) {
                    sentence1.addConsonant();
                }
                System.out.println(sentence1.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
