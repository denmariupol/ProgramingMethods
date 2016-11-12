package Chapter_7_Strings.Variant_B.Task_1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Ingener_mobil on 11.11.2016.
 */
public class Sentence {
    private int count;
    private ArrayList<Word> words = new ArrayList<Word>();

    public ArrayList<Word> getWords() {
        return words;
    }

    public int getCount() {
        return count;
    }

    public Sentence(ArrayList<Word> w) {
        for (Word word : w) {
            this.words.add(word);
        }
    }
//    @Override
//    public String toString(){
//        return sentence;
//    }
}
