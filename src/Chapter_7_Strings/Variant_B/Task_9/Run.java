package Chapter_7_Strings.Variant_B.Task_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Ingener_mobil on 12.11.2016.
 */
public class Run {
    private ArrayList<Character> symbols = new ArrayList<Character>();
    private ArrayList<Word> words = new ArrayList<Word>();
    private ArrayList<Sentence> sentences = new ArrayList<Sentence>();

    public void Init() {
        File file = new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер буквы: ");
        String letter = scanner.next();
        char charLetter = letter.charAt(0);
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

            for (Word word : sentence.getWords()) {
                char [] ch = word.getWord().toCharArray();
                int a = 0;
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] == charLetter)
                        a++;
                }
                if(a > 0) {
                    words.add(word);
                    word.setDimension(a);
                }
            }

        }
        Collections.sort(words, new Word());
        for (Word word : words) {
            System.out.println(word);
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
