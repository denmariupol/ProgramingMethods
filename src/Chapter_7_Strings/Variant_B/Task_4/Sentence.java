package Chapter_7_Strings.Variant_B.Task_4;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Ingener_mobil on 11.11.2016.
 */
public class Sentence implements Comparator<Sentence>{
    private int count;
    private ArrayList<Word> words = new ArrayList<Word>();

    public ArrayList<Word> getWords() {
        return words;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public Sentence(){}
    public Sentence(ArrayList<Word> w) {
        for (Word word : w) {
            this.words.add(word);
        }
    }

    @Override
    public int compare(Sentence o1, Sentence o2) {
        return o2.getWords().size() - o1.getWords().size();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Word word : words) {
            sb.append(word+" ");
        }
        return sb.toString();
    }
}
