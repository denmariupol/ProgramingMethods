package Chapter_7_Strings.Variant_B.Task_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
            int count = 0;
            ArrayList<Integer> breakI = new ArrayList<Integer>();
            for (int i = 0; i < sentence.getWords().size(); i++) {
                for (int j = i+1; j < sentence.getWords().size(); j++) {
                    if (breakI.contains(i))
                        continue;
                    if (sentence.getWords().get(i).equals(sentence.getWords().get(j)) &&
                            !sentence.getWords().get(i).getWord().equals("")) {
                        count++;
                        breakI.add(j);
//                        System.out.print(sentence.getWords().get(j)+" ");
                    }
                }
            }
            sentence.setCount(count);
//            System.out.println(sentence.getCount() + " " + sentence.getWords());
        }
        Collections.sort(sentences, new Sentence());
        for (int i = 0; i < sentences.size(); i++) {
            int temp = sentences.get(0).getCount();
            if(temp == sentences.get(i).getCount())
                System.out.println(sentences.get(i).toString());
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
            if(symbols.size() == 0)
                return;
            words.add(new Word(symbols));
            symbols.clear();

        }
    }
}
