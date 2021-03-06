package Chapter_7_Strings.Variant_B.Task_1;

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

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Sentence(){}
    public Sentence(ArrayList<Word> w) {
        for (Word word : w) {
            this.words.add(word);
        }
    }
    @Override
    public int compare(Sentence o1, Sentence o2) {
        return o2.getCount() - o1.getCount();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(count + " ");
        for (Word word : words) {
            sb.append(word+" ");
        }
        return sb.toString();
    }
}
//class SentenceComparator implements Comparator<Sentence>{
//
//    @Override
//    public int compare(Sentence o1, Sentence o2) {
//        return o2.getCount() - o1.getCount();
//    }
//}
