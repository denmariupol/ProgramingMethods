package Chapter_7_Strings.Variant_B.Task_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 12.11.2016.
 */
public class Run {
    private ArrayList<Character> symbols = new ArrayList<Character>();
    private ArrayList<Word> words = new ArrayList<Word>();
    private ArrayList<Sentence> sentences = new ArrayList<Sentence>();

    public void Init() {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        Scanner scanner = null;
        char[] buffer = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            char[] chars = scanner.nextLine().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                SortChars(chars[i]);
            }
            SortChars(' ');
        }
        for (Sentence sentence : sentences) {
            Word temp = sentence.getWords().get(0);
            sentence.getWords().set(0,sentence.getWords().get(sentence.getWords().size()-1));
            sentence.getWords().set(sentence.getWords().size()-1,temp);
            System.out.println(sentence.toString());
        }
    }

    private void SortChars(char c) {
        if (Character.isLetter(c)) {
            symbols.add(c);
        } else if (c == '.') {
            words.add(new Word(symbols));
            sentences.add(new Sentence(words));
            symbols.clear();
            words.clear();
        } else if (Character.toString(c).matches("\\p{Space}")) {
            if (symbols.size() == 0)
                return;
            words.add(new Word(symbols));
            symbols.clear();

        }
    }
}
